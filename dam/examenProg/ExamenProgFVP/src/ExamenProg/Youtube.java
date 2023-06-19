package ExamenProg;

import java.util.ArrayList;
import java.util.HashMap;

public class Youtube {
	
	private HashMap <String,Youtuber> EEUU;
	private HashMap <String,Youtuber> Japon;
	private HashMap <String,Youtuber> Espanya;
	
	
	

	public Youtube() {
		super();
	}

	public HashMap<String, Youtuber> getEEUU() {
		
		return EEUU;
	}

	public void setEEUU(HashMap<String, Youtuber> eEUU) {
		EEUU.put("nano", new Youtuber("fernando", "nano", 41,'B', 90));
		EEUU.put("pano", new Youtuber("nando", "pano", 20,'B', 60));
		EEUU = eEUU;
	}

	public HashMap<String, Youtuber> getJapon() {
		
		return Japon;
	}

	public void setJapon(HashMap<String, Youtuber> japon) {
		Japon.put("nano", new Youtuber("fernando", "nano", 41,'B', 90));
		Japon.put("pano", new Youtuber("nando", "pano", 20,'B', 60));
		Japon = japon;
	}

	public HashMap<String, Youtuber> getEspanya() {
	
		return Espanya;
	}

	public void setEspanya(HashMap<String, Youtuber> espanya) {
		Espanya.put("nano", new Youtuber("fernando", "nano", 41,'B', 90));
		Espanya.put("pano", new Youtuber("nando", "pano", 20,'B', 60));
		Espanya = espanya;
	}
	
	
		
	}
	

	
	
	
	
	


