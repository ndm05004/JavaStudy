package chapter11;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		Integer b = new Integer(10);
		int bb = b.intValue();
		Boolean c = new Boolean(false);

		Integer d = 10;
		int e = new Integer(10);
		a+=d;
		
		//System.out.println(a);
		
		long startTime = System.nanoTime();
		Integer sum =0;
		for (int i=1; i<=10000; i++) {
			sum+=i;
		}
		
		
		System.out.println(sum);
		long endTime = System.nanoTime();
		System.out.println(endTime-startTime);
		System.out.println("");
		System.out.println("---------");
		System.out.println("");
		
		long startTime1 = System.nanoTime();
		int sum1 =0;
		for (int i=1; i<=10000; i++) {
			sum1+=i;
		}
		
		
		System.out.println(sum);
		long endTime1 = System.nanoTime();
		System.out.println(endTime1-startTime1);
	
	}

}
