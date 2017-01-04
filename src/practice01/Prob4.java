package practice01;

import java.util.Scanner;
	
//		String s="Hello World";//c에는 문자열마지막에 null이있지만 java는 없음.
//		System.out.println(s.length());//s라는 객체에게 물어보기! 몇개짜리 배열이니?
//		int length=s.length();
//		
//		for(int i=0; i<length;i++){
//			System.out.println(s.charAt(i));//해당 인덱스의 문자를 줘
//		}
		
public class Prob4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String s=scanner.nextLine();
		int length = s.length();
		for(int j=0; j<length;j++){
			for(int i=0; i<=j;i++){
				System.out.print(s.charAt(i));				
			}
			System.out.println();
		}
		
		
	}
}
