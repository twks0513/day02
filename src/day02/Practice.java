package day02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 1. ���� �Է��ϰ� �� ���� ���� ������� ������ִ� ���α׷��� ����ÿ�  

		
		
		
		//1.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println(num1+"��"+num2+"�� ����Դϴ�");
		}
		if(num1 % num2 != 0) {
			System.out.println(num1+"��"+num2+"�� ����� �ƴմϴ�");
		}
		

	}

}
