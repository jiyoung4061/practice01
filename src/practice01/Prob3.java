package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);		
		System.out.println("숫자를 입력하세요.:");
		int number = scanner.nextInt();
		int res=0;
		
		if(number%2==0){//짝수이면
			for(int i=0; i<number;){
				res=res +(i+2);
				i=i+2;
			}	
			System.out.println("결과 값:"+res);
			}else{//홀수이면
			for(int i=-1;i<number;){
				res=res+(i+2);
				i=i+2;
			}
			System.out.println("결과 값:"+res);
		}
		
	}

}
