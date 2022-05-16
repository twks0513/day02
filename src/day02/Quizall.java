package day02;

import java.util.Scanner;

public class Quizall {

	public static void main(String[] args) {
		// ##문제 1

//국어, 영어 성적을 입력받고,
//평균이 90점 이상이면 "A",
//평균이 80점 이상이면 "B",
//평균이 70점 이상이면 "C",
//평균이 69점 미만이면 "D" 가 나오도록 하시오
		
		Scanner scan = new Scanner(System.in);
		
		int kor,eng;
		double avg;
		
		System.out.print("국어점수 : ");
		kor = scan.nextInt();
		System.out.print("영어점수 : ");
		eng = scan.nextInt();
		
		avg = (kor+eng)/2;
		
		if(avg >= 90) {
			System.out.println("A");
		}
		if(avg <90 && avg >= 80) {
			System.out.println("B");
		}
		if(avg < 80 && avg >= 70) {
			System.out.println("C");
		}
		if(avg < 70) {
			System.out.println("D");
		}
		
//		##문제 2
//
//		A-B-C-D가 순서대로 청소당번을 한다.
//		첫날 A가 당번이라면 N일 후에는 누가 당번인가?

		int n;
		
		System.out.print("일째 입력 : ");
		n = scan.nextInt();
		
		if(n%4==3) {
			System.out.println("D");
		}
	
		if(n%4==2) {
			System.out.println("C");
		}
		if(n%4==1) {
			System.out.println("B");
		}
		if(n%4==0) {
			System.out.println("A");
		}
		
//		##문제 3
//		상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
//
//		상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
//
//		이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.
//
//		바로 "45분 일찍 알람 설정하기"이다.
//
//		이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
//
//		현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
//
//
//		 (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
		
		
		int h,m;
		
		System.out.print("시 입력 : ");
		h = scan.nextInt();
		System.out.print("분 입력 : ");
		m = scan.nextInt();
		
		if(m>=45) {
			System.out.println(h+"시"+(m-45)+"분");
		}
		if(h !=0 && m<45) {
			System.out.println((h-1)+"시"+(m+15)+"분");
		}
		if(h==0 && m<45) {
			h=23;
			System.out.println(h+"시"+(m+15)+"분");
		}
		
		
		
//		문제4. Q. 오늘은 목요일! 아래 8 개 요일 코드를 나열해주세요
//		(월 M, 화 T, 수 W, 목 T, 금 F, 토 S, 일 S)
//
//		- 19 일 후
//		- 54 일 후
//		- 203 일 후
//		- 601 일 후
//		- 1923 일 후
//		- 3092 일 후
//		- 8930 일 후
//		- 19203 일 후
//		예) TTTWTTTS
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
