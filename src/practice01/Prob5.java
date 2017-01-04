package practice01;

public class Prob5 {

	public static void main(String[] args) {
		
		for(int i=1; i<10;i++){
			if(i%3==0){
				System.out.println(i+"   짝");
			}
		}
		for(int i=1; i<10;i++){
			for(int j=1; j<10;j++){
				if(i%3==0||j%3==0){
					if(i%3==0&&j%3==0){
						System.out.println(i+""+j+"  짝짝");
					}
					System.out.println(i+""+j+"   짝");
				}
			}
		}
		
		
	}
}
