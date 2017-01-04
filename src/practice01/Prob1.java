package practice01;

import java.util.Scanner;

public class Prob1 {//3의 배수인지 판별

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수를 입력하세요: ");
		int number=scanner.nextInt();
		int res=number%3;
		
		if(res==0){
			System.out.println("3의 배수입니다.");
		}else{
			System.out.println("3의 배수가아닙니다.");
			}		
	}
}
