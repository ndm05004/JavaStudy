package chapter04;

public class OverlapFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 4;
		int y = 5;
		
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if((x*i)+(y*j)==60) {
					System.out.printf("(%d x, %d y) ", i, j);
					System.out.println(" ");
				}
			}
		}

	}

}
