package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		final String KOREA = "대한민국";
		System.out.println(KOREA);
		
//		KOREA = "캐나다";
//		System.out.println(KOREA);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름입력 : ");
		String name = scan.next();
		
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		System.out.println(name+"님의 나이는 "+age+"입니다.");
		
	}

}
