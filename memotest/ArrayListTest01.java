package memotest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list1 = new ArrayList();
		
		
		list1.add("aaa");
		list1.add("bbb");
		list1.add(123);
		list1.add('k');
		list1.add("true");
		list1.add(123.45);
		
		System.out.println("list => " + list1);
		System.out.println("size ==> " + list1.size());
		System.out.println();
		
		
		System.out.println("1번째 자료" + list1.get(1));
		
		// 데이터 끼어넣기
		list1.add(3, "zzzz");
		System.out.println(list1);
		
		// 데이터 변경하기
		String sTemp = (String)list1.set(3, "yyy");
		System.out.println("list1=>" + list1);
		System.out.println("sTemp" + sTemp);
		System.out.println();
		
		//삭제도 같다
		list1.remove(3);
		System.out.println("3번째 자료 삭제 후 list =>" +list1);
		
		list1.remove("bbb");
		System.out.println("bbb 자료 삭제 후 list1 =>"+ list1);
		
		
		// 제네릭을 사용할 수 있다.
		List<String> list2 = new ArrayList<>();
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");
		list2.add("DDD");
		list2.add("EEE");
		
		for(int i =0; i<list2.size(); i++) {
			System.out.println(i+ " ==>" + list2.get(i));
  		}
		
		list2.add("DDD");

		// contains(비교객체) ==> 리스트에 저장된 데이터 중에서 '비교객체'가 있으면 true, 없으면 false 반환
		System.out.println("DDDD값 존재 여부 : " + list2.contains("DDDD"));
		System.out.println("AAA값 존재 여부 : " + list2.contains("AAA"));
		System.out.println("list2 =>" + list2);
		// index.of(비교객체)
		// lastIndexOf(비교객체) ==> 리스트에 '비교객체'가 있으면 '비교객체'가 저장된 index값을 반환하고
		//   	       없으면 -1을 반환한다.
		
		// - indexOf()는 검색 방향이 앞에서부터 뒤쪽으로 검색하고,
		// - lastIndexOf()는 뒤에서 앞쪽으로 검색한다.
		// - 비교객체가 많으면 검색해서 첫번째로 찾아진 데이터의 위치값을 반환한다
		System.out.println("DDD의 위치값 : " + list2.indexOf("DDD"));
		System.out.println("zzzz의 위치값 : " + list2.indexOf("zzzz"));
		System.out.println("DDD의 위치값 : " + list2.lastIndexOf("DDD"));
		System.out.println("---------------------------------------------------");
		
		// - toArray() ==> 리스트 안의 데이터를 배열로 변환해서 반환한다.
		//             ==> 기본적으로 object형 배열로 변환한다.
		
		// -toArray() 메소드를 사용할 때 toArray(new 제네릭타입명[0]) ==> 제네릭 타입의 배열로 변환해서 반환한다.
		
		Object[] strArr = list2.toArray();
		System.out.println("리스트의 개수 : " + list2.size());
		System.out.println("배열의 개수 : " + strArr.length);
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(i +"번째 자료 :"+ strArr[i]);
			
		}
		// 제네릭 타입의 배열로 변환해서 가져오기
		String[] strArr2 = list2.toArray(new String[0]);
		
		for (String string : strArr2) {
			System.out.println(string);
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}	

}