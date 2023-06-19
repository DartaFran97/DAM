package juegoDebuguer;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;

	public class Juego2 {
	   
		private static final int CARD_DECK_SIZE = 52;
	    private static int playerTotalScore = 0;
	    private static int computerTotalScore = 0;
	    private static boolean invalidInput;
	    private static Scanner userInput = new Scanner(System.in);

	    private static ArrayList<String> deckOfCards = new ArrayList<String>(
	            Arrays.asList("S-2", "H-2", "C-2", "D-2", "S-3", "H-3", "C-3", "D-3", "S-4", "H-4", "C-4", "D-4", "S-5",
	                    "H-5", "C-5", "D-5", "S-6", "H-6", "C-6", "D-6", "S-7", "H-7", "C-7", "D-7", "S-8", "H-8", "C-8",
	                    "D-8", "S-9", "H-9", "C-9", "D-9", "S-10", "H-10", "C-10", "D-10", "S-J", "H-J", "C-J", "D-J",
	                    "S-Q", "H-Q", "C-Q", "D-Q", "S-K", "H-K", "C-K", "D-K", "S-A", "H-A", "C-A", "D-A"));

	    public static void main(String[] args) {
	        introMessage();
	        showDirectionsBasedOnInput();
	        playGame();
	    }

	    private static void introMessage() {
	        System.out.println("\t         WAR");
	        System.out.println("INTRODUCE LAS INSTRUCCIONES DEL JUEGO");
	        
	    }

	    private static void showDirectionsBasedOnInput() {
	        invalidInput = true;
	        while (invalidInput) {
	            switch (userInput.nextLine().toLowerCase()) {
	                case "yes":
	                    System.out.println("INTRODUCE LAS INSTRUCCIONES DEL JUEGO");
	                   
	                    invalidInput = false;
	                    break;
	                case "no":
	                    System.out.println();
	                    invalidInput = false;
	                    break;
	                default:
	                    System.out.print("YES OR NO, PLEASE.   ");
	            }
	        }
	    }

	    private static void playGame() {

	        boolean gameEndedEarly = false;

	        Collections.shuffle(deckOfCards);

	        outerloop:
	        for (int i = 1; i <= CARD_DECK_SIZE; i += 2) {
	            System.out.println("YOU: " + deckOfCards.get(i - 1) + "\t " + "COMPUTER: " + deckOfCards.get(i));
	            getWinner(deckOfCards.get(i - 1), deckOfCards.get(i));

	            invalidInput = true;
	            while (invalidInput) {
	                if (endedEarly()) {
	                    gameEndedEarly = true;
	                    break outerloop;
	                }
	            }
	        }

	        endGameOutput(gameEndedEarly);
	    }

	    private static void getWinner(String playerCard, String computerCard) {

	        String playerCardScore = (playerCard.length() == 3) ? Character.toString(playerCard.charAt(2))
	                : playerCard.substring(2, 4);
	        String computerCardScore = (computerCard.length() == 3) ? Character.toString(computerCard.charAt(2))
	                : computerCard.substring(2, 4);

	        if (checkCourtCards(playerCardScore) > checkCourtCards(computerCardScore)) {
	            System.out.println("YOU WIN.   YOU HAVE " + playerWonRound() + "   COMPUTER HAS " + getComputerScore());
	        } else if (checkCourtCards(playerCardScore) < checkCourtCards(computerCardScore)) {
	            System.out.println(
	                    "COMPUTER WINS!!!   YOU HAVE " + getPlayerScore() + "   COMPUTER HAS " + computerWonRound());
	        } else {
	            System.out.println("TIE.  NO SCORE CHANGE");
	        }

	        System.out.print("DO YOU WANT TO CONTINUE? ");
	    }

	    private static int checkCourtCards(String cardScore) {
	        switch (cardScore) {
	            case "J":
	                return Integer.parseInt("11");
	            case "Q":
	                return Integer.parseInt("12");
	            case "K":
	                return Integer.parseInt("13");
	            case "A":
	                return Integer.parseInt("14");
	            default:
	                return Integer.parseInt(cardScore);
	        }
	    }

	    private static boolean endedEarly() {
	        switch (userInput.nextLine().toLowerCase()) {
	            case "yes":
	                invalidInput = false;
	                return false;
	            case "no":
	                invalidInput = false;
	                return true;
	            default:
	                invalidInput = true;
	                System.out.print("YES OR NO, PLEASE.   ");
	                return false;
	        }
	    }

	    private static void endGameOutput(boolean endedEarly) {
	        if (endedEarly) {
	            System.out.println("YOU HAVE ENDED THE GAME. FINAL SCORE:  YOU: " + getPlayerScore() + " COMPUTER: "
	                    + getComputerScore());
	            System.out.println("THANKS FOR PLAYING.  IT WAS FUN.");
	        } else {
	            System.out.println("WE HAVE RUN OUT OF CARDS. FINAL SCORE:  YOU: " + getPlayerScore() + " COMPUTER: "
	                    + getComputerScore());
	            System.out.println("THANKS FOR PLAYING.  IT WAS FUN.");
	        }
	    }

	    private static int playerWonRound() {
	        return playerTotalScore += 1;
	    }

	    private static int getPlayerScore() {
	        return playerTotalScore;
	    }

	    private static int computerWonRound() {
	        return computerTotalScore += 1;
	    }

	    private static int getComputerScore() {
	        return computerTotalScore;
	    }
	}


