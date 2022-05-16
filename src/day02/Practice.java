package day02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 1. 첫번째 수를 입력하고 두번째 수를 입력한뒤 첫번째수가 두번째수의 배수인지 출력해주는 프로그램을 만드시오  

		// 2. 수를 입력하고 그 수가 3과 5의 공배수인지 출력해주는 프로그램을 만드시오 
		
		
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
		
		//2.
		
		System.out.print("수 입력 : ");
		int su1 = scan.nextInt();
		
		
		if(su1 % 3 == 0 && su1 % 5 == 0) {
			System.out.println(su1+"은 3과 5의 공배수가 맞습니다");
		}
		if(su1 % 3 != 0 && su1 % 5 == 0) {
			System.out.println(su1+"은 3과 5의 공배수가 아닙니다");
		}
		if(su1 % 3 == 0 && su1 % 5 != 0) {
			System.out.println(su1+"은 3과 5의 공배수가 아닙니다");
		}
		if(su1 % 3 != 0 && su1 % 5 != 0) {
			System.out.println(su1+"은 3과 5의 공배수가 아닙니다");
		}
		

	}

}
