package day02;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("����� �̸��� �����Դϱ� ? ");
		String name = scan.next();
		
		System.out.print(name+"���� �������� : ");
		int kor = scan.nextInt();

		System.out.print(name+"���� �������� : ");
		int eng = scan.nextInt();
		
		System.out.print(name+"���� �������� : ");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		
		System.out.println("===============");
		System.out.println("�̸� : "+name);
		System.out.println("===============");
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
		System.out.println("===============");
		System.out.println("�հ� : "+total);
		System.out.println("===============");
				
	}

}
