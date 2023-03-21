package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import chapter11.Member;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //중복되면 홍길동에는 제일 마지막에 저장한 값으로 대체
		System.out.println(map.size());
		
		System.out.println("홍길동: "+ map.get("홍길동"));
		System.out.println();
		
		
		
		// 1.entry로 접근
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		//entrySet.iterator();을 통해 while문으로 접근
		System.out.println("entrySet.iterator()");
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println();
		//entrySet foreach문으로 접근
		System.out.println("entrySet foreach");
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println();
		// 2.key로 접근
		Set<String> keySet = map.keySet();
		// for each
		System.out.println("key foreach");
		for (String key : keySet) {
			System.out.println(key + ": " + map.get(key));
		}
		
		System.out.println();
		Iterator<String> keyIIterator = keySet.iterator();
		
		// 3. value로 접근 -> key는 모름
		System.out.println("value로 접근");
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
		Map<Member, Integer> map2 = new HashMap<>();
		map2.put(new Member("홍길동", "30"), 95);
		
		
	}

}
