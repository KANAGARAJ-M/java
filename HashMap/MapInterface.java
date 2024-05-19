import java.util.*;
public class MapInterface {
	public static void main(String[] args) {
		Map<String,Integer> hMap = new TreeMap<>(); 
        hMap.put("Vijay", 304); hMap.put("Thanish", 32); hMap.put("Sugumar", 111);
        hMap.put("Jaya Prakash", 53);    hMap.put("Aakash", 420);
        System.out.println(hMap);    hMap.put("Thanish", 456789);
       System.out.println(hMap);
        System.out.println(hMap.get("Jaya Prakash"));
        System.out.println(hMap.keySet());
        hMap.putIfAbsent("Ajay", 99);
        System.out.println(hMap);
        hMap.remove("Ajay");
        System.out.println(hMap);
        hMap.replace("Aakash",420, 840); System.out.println(hMap);
	     System.out.println(hMap.containsValue(304));
	}

}
