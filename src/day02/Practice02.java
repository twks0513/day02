package day02;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String result;
		int num, num1, num2;
		
		System.out.print("수 입력 : ");
		num = scan.nextInt();
		
		result = (num%2==0) ?"짝수":"홀수";
		
		System.out.println(num+" = "+result);
		
		result = (num%3==0) ?"3의 배수가 맞다":"3의 배수가 아니다";
		
		System.out.println(num + " = "+result);
		
		System.out.print("두 수 입력 : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println("num1 : "+num1+" ,num2 : "+num2);
		
		result = (num1>num2)?"num1이 num2보다 크다":"num2가 num1보다 크다";
		System.out.println(result);

	}

}
