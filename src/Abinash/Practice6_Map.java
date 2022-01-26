package Abinash;

import java.util.HashMap;
import java.util.Map;

public class Practice6_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> mapper=new HashMap<String,String>();
		mapper.put("Prerna", "Mohanty");
		mapper.put("Abinash", "Patra");
   for (Map.Entry<String, String> e :mapper.entrySet()) {
	   System.out.println(e.getKey()+" "+e.getValue());
	   
   }
		
		
		
	}

}
