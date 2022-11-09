package org.col;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap();
		
//	To add the value
		m.put(10, "tim");
		m.put(20, "siva");
		m.put(30, "chandru");
		m.put(60, "Anand");
		m.put(20,"xavier");
		m.put(20, "tim");
	}
}
