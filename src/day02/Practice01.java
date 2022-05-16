package day02;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("당신의 이름은 무엇입니까 ? ");
		String name = scan.next();
		
		System.out.print(name+"님의 국어점수 : ");
		int kor = scan.nextInt();

		System.out.print(name+"님의 영어점수 : ");
		int eng = scan.nextInt();
		
		System.out.print(name+"님의 수학점수 : ");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		
		System.out.println("===============");
		System.out.println("이름 : "+name);
		System.out.println("===============");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("===============");
		System.out.println("합계 : "+total);
		System.out.println("===============");
				
	}

}
