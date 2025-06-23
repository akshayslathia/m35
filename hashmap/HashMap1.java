package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<>();
		
		// put(key,value) --> it used to put a entry into map
		hm.put(1, "mango");
		hm.put(4, "sheela");
		hm.put(1, "guava");
		System.out.println(hm);
		
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm1.put(5, "banana");
		hm1.put(4, "shushila");
		
		// putAll(map) --> it used to put all entries of specified to this map
		hm.putAll(hm1);
		System.out.println(hm);
		
		//{1=guava, 4=shushila, 5=banana}

		
		
		// putIfAbsent(key,value)--> it used put a entry only when the specified key
										// is not mapped with value
		
		hm.putIfAbsent(7, "tomato");
		System.out.println(hm);// {1=guava, 4=shushila, 5=banana, 7=tomato}
		
		hm.putIfAbsent(4, "grapes");
		System.out.println(hm);//{1=guava, 4=shushila, 5=banana, 7=tomato}
		
		// contains(key)
		System.out.println(hm.containsKey(4));//true
		System.out.println(hm.containsKey(11));//false
		
		// contains(value)
		System.out.println(hm.containsValue("guava"));//true
		System.out.println(hm.containsValue("Banana"));//false
		
		// remove(key)
		hm.remove(7);
		System.out.println(hm); // {1=guava, 4=shushila, 5=banana}
		
		
		// remove(key,value)
		hm.remove(10,"pepsi");
		System.out.println(hm);//{1=guava, 4=shushila, 5=banana}
		hm.remove(5,"banana");
		System.out.println(hm); //{1=guava, 4=shushila}
		
		// clear()
		//hm.clear();
		//System.out.println(hm); // {}
		
		// replace(key,oldvalue,newValue)
		hm.replace(4, "shushila","shaqeela");
		System.out.println(hm);//{1=guava, 4=shaqeela}
		
		// size()
		System.out.println(hm.size());// 2
		
		// get(key)
		System.out.println(hm.get(4));//shaqeela
		System.out.println(hm.get(10)); // null
		
		// getOrDefault(key, defaultValue)
		System.out.println(hm.getOrDefault(4, "abc"));//shaqeela
		System.out.println(hm.getOrDefault(10, "abc"));//abc
		
		// isEmpty()
		System.out.println(hm.isEmpty());//false
		
		//keySet()
		
		Set<Integer> keySet = hm.keySet();
		for(Integer i : keySet)
			System.out.println(i);
		
		System.out.println("-------");
		// entrySet
		Set<Map.Entry<Integer, String>> x = hm.entrySet();
		
		Iterator<Map.Entry<Integer, String>> i = x.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<Integer, String> entry = i.next();
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
		
		System.out.println("----");
		// forEach loop
		
		for(Map.Entry<Integer, String>   entry :  hm.entrySet())
		{
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		
		

	}

}
