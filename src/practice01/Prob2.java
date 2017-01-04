package practice01;


public class Prob2 {

	public static void main(String[] args) {
		
		int n=0;
		int m=10;
		for(int i=0; i<10; i++){
			for(int j=n; j<m;j++){
				System.out.print(j+1+"  ");	
			}
			n++;
			m++;
			System.out.println();
		}
	}

}
