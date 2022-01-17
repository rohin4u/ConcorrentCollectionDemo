package spiders;

import java.util.HashMap;

public class CocurrentHashMapDemo {
	
	static HashMap m = new HashMap();
	
	public static void main(String[] args) {
		
		
		m.put(100, "delhi");
		m.put(101,"manali");
		
		m.putIfAbsent(102, "mumbai");
		
	}
}
