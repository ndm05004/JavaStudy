package chapter02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float var2 = 3.14f;
		double var3 =3.14;
		
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: "+ var2);
		System.out.println("var3: "+ var3);
		System.out.println("var4: "+ var4);
		System.out.println("var5: "+ var5);
		
		
		double var6 = 3e6;
		float var7 =  3e6f;
		double var8 = 2e-3;
		
		System.out.println("var6: "+ var6);
		System.out.println("var7: "+ var7);
		System.out.println("var8: "+ var8);
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		} 
		
	}

}
