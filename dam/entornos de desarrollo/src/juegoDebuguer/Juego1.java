package juegoDebuguer;

public class Juego1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String menu = "[ESCRIBE LAS INSTRUCCIONES QUE SE DEBERÍAN MOSTRAR AL USUARIO UNA VEZ SEPAS DE QUE VA EL JUEGO]";
				
				// Imprimir menú
				System.out.println(menu);
				int longitud = 5; // Longitud de la contraseña
				// Saber si usuario quiere repetidos
				boolean conRepetidos = obtenerConRepetidos();
				String passwordCorrecto = obtenerPasswordAleatoria(conRepetidos, longitud);
				int intentos = 1;
				while (true) {// Ciclo infinito; se rompe cuando el usuario acierta con "break"
					String suposicionUsuario = obtenerSuposicionDeUsuario(longitud);
					if (suposicionUsuario.equals(passwordCorrecto)) {
						System.out.printf("Ganaste en %d intentos\n", intentos);
						break;
					}

					String pistas = obtenerPistas(suposicionUsuario, passwordCorrecto);
					System.out.printf("Incorrecto. Pistas:\n%s\n", pistas);
					intentos++;
				}

			}

			private static String obtenerSuposicionDeUsuario(int longitud) {
				String eleccion = "";
				while (eleccion.length() != longitud) {
					System.out.println("¿Cuál crees que es la contraseña?: ");
					Scanner sc = new Scanner(System.in);
					eleccion = sc.nextLine();
				}
				return eleccion;
			}

			private static boolean obtenerConRepetidos() {
				System.out.println("¿Puede incluir repetidos? 1 = sí. 0 = no ");
				return new Scanner(System.in).nextInt() == 1;
			}

			private static String obtenerPistas(String suposicionPassword, String passwordCorrecto) {
				String pistas = "";
				for (int x = 0; x < suposicionPassword.length(); x++) {
					// Si está en el lugar correcto se indica con un *
					if (suposicionPassword.charAt(x) == passwordCorrecto.charAt(x)) {
						pistas += "*";
						continue;
					}

					// Si está en la cadena pero no en el lugar correcto, se indica con un _
					int indiceCaracter = passwordCorrecto.indexOf(suposicionPassword.charAt(x));

					if (indiceCaracter != -1) {
						pistas += "_";
						continue;
					}
					// Finalmente, si ninguna de las condiciones de arriba se cumple, el carácter no
					// está
					pistas += " ";
				}
				return pistas;
			}

			private static String obtenerPasswordAleatoria(boolean conRepetidos, int longitud) {
				String muestra = "0123456789";
				Random random = new Random(System.currentTimeMillis());
				String pass = "";
				for (int x = 0; x < longitud; x++) {
					// Tomamos un dígito aleatorio
					int indiceAleatorio = random.nextInt(muestra.length());
					char digitoAleatorio = muestra.charAt(indiceAleatorio);
					// Si no quieren repetidos...
					if (!conRepetidos) {
						// Mientras que en la cadena ya exista el carácter que acabamos de generar
						while (pass.indexOf(digitoAleatorio) != -1) {
							// Generamos otro
							indiceAleatorio = random.nextInt(muestra.length());
							digitoAleatorio = muestra.charAt(indiceAleatorio);
						}
					}
					// De cualquier forma, agregamos el dígito a la cadena
					pass += digitoAleatorio;
				}
				return pass;
			}
}
