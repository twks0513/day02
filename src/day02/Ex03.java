package day02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("1.�������");
		System.out.println("2.��������");
		System.out.println("3.����");
		System.out.print(">>> : ");
		num = scan.nextInt();
		
		if(num == 1) {
			System.out.println("������� ����");
		}
		if(num == 2) {
			System.out.println("�������� ����");
		}
		if(num == 3) {
			System.out.println("���� ����");
		}

	}

}
