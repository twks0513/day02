package day02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 1. ù��° ���� �Է��ϰ� �ι�° ���� �Է��ѵ� ù��°���� �ι�°���� ������� ������ִ� ���α׷��� ����ÿ�  

		// 2. ���� �Է��ϰ� �� ���� 3�� 5�� ��������� ������ִ� ���α׷��� ����ÿ� 
		
		
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
		
		//2.
		
		System.out.print("�� �Է� : ");
		int su1 = scan.nextInt();
		
		
		if(su1 % 3 == 0 && su1 % 5 == 0) {
			System.out.println(su1+"�� 3�� 5�� ������� �½��ϴ�");
		}
		if(su1 % 3 != 0 && su1 % 5 == 0) {
			System.out.println(su1+"�� 3�� 5�� ������� �ƴմϴ�");
		}
		if(su1 % 3 == 0 && su1 % 5 != 0) {
			System.out.println(su1+"�� 3�� 5�� ������� �ƴմϴ�");
		}
		if(su1 % 3 != 0 && su1 % 5 != 0) {
			System.out.println(su1+"�� 3�� 5�� ������� �ƴմϴ�");
		}
		

	}

}
