package szotar;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Szotar {
	
	private HashMap<String, String> szotar;
	
	public Szotar() {
		this.szotar = new HashMap()<String,String>();
	}
	
	public void szoHozzaad(String magyar, String angol) {
		if(magyar == null || angol == null)
			return;
		
		this.szotar.put(magyar, angol);
	}
	
	public void szotarKiir() {
		for(Entry<String, String> s :szotar.entrySet())
			System.out.println(s.get);
	}
	

}
