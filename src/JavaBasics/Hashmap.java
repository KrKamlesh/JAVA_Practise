package JavaBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap 
{
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		
		h.put(1, "esh");
		h.put(2, "lesh");
		h.put(3, "mlesh");
		h.put(4, "amlesh");
		System.out.println(h.get(1));
		System.out.println(h.get(2));
		System.out.println(h.get(5));
		for(Entry m: h.entrySet())
		{
		System.out.println(m.getKey());
		System.out.println(m.getValue());
		
		}
		
	}

}
