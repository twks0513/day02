package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		final String KOREA = "���ѹα�";
		System.out.println(KOREA);
		
//		KOREA = "ĳ����";
//		System.out.println(KOREA);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸��Է� : ");
		String name = scan.next();
		
		System.out.print("���� �Է� : ");
		int age = scan.nextInt();
		
		System.out.println(name+"���� ���̴� "+age+"�Դϴ�.");
		
	}

}
