package day02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 1. 수를 입력하고 그 수가 몇의 배수인지 출력해주는 프로그램을 만드시오  

		
		
		
		//1.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println(num1+"은"+num2+"의 배수입니다");
		}
		if(num1 % num2 != 0) {
			System.out.println(num1+"은"+num2+"의 배수가 아닙니다");
		}
		

	}

}
