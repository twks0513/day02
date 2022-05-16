package day02;

public class Ex02 {

	public static void main(String[] args) {
		int num1 = 9, num2 = 2;
		System.out.println(num1 / num2);
		System.out.println(num1 / (double)num2);
		System.out.println(num1 / 2.0);
		System.out.println(num1 % num2);
		System.out.println();
		
		/*
		 a=10, b=5;
		 a = a+b; => a+=b;
		 a = a*b; => a*=b;
		 */
		
		int a = 10, b=5;
		a += b;
		System.out.println(a);
		System.out.println();
		
		int su1,su2;
		
		su1= su2 =5;
		
		System.out.println(su1+=1);
		System.out.println(su1-=1);
		System.out.println(su1*=su2);
		System.out.println(su1/=su2);
		System.out.println(su1%=su2);
		System.out.println();
		
		/*
		  a = 10 , b = 5;
		  
		  a > b true
		  a <= b false
		  a == b false
		  a != b true
		*/
		
		double do1 =3.1 , do2 = 3.0;
		System.out.println(do1 <= do2);
		System.out.println(do1 >= do2);
		System.out.println(do1 == do2);
		System.out.println(do1 != do2);
		System.out.println();
		
		
		/*
		  && - 그리고(and) 모두가 참일경우에 true 반환
		  || - 또는(or) 전부중 하나라도 참일경우 ture반환
		  ! - 부정(not) 결과를 반전시킨다
		*/
		
		
		int su3;
		
		su1 = 10; su2 = 20; su3 = 30;
		
		System.out.println(su1>su2 && su1>su3);
		System.out.println("=====and=====");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("=====or=====");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("=====not=====");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		/*
			a=10;
			++a : 전치 또는 전위
			a++ : 후치 또는 후위
		*/
		
		su1=10;
		su1++;
		System.out.println(su1);
		System.out.println();
		su1=10;
		++su1;
		System.out.println(su1);
		
		su1 =10; su2 = su1++;
		
		System.out.println("su1 : "+su1);
		System.out.println("su2 : "+su2);
		su1 =10; su2 = ++su1;
		
		System.out.println("su1 : "+su1);
		System.out.println("su2 : "+su2);
		System.out.println();
		
		su1 = 8;
		String s = (su1%2==0)?"짝수":"홀수";
		System.out.println("su1의 값 "+su1+"은 "+ s+"입니다");
		

	}

}
