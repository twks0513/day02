package day02;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String result;
		int num, num1, num2;
		
		System.out.print("�� �Է� : ");
		num = scan.nextInt();
		
		result = (num%2==0) ?"¦��":"Ȧ��";
		
		System.out.println(num+" = "+result);
		
		result = (num%3==0) ?"3�� ����� �´�":"3�� ����� �ƴϴ�";
		
		System.out.println(num + " = "+result);
		
		System.out.print("�� �� �Է� : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println("num1 : "+num1+" ,num2 : "+num2);
		
		result = (num1>num2)?"num1�� num2���� ũ��":"num2�� num1���� ũ��";
		System.out.println(result);

	}

}
