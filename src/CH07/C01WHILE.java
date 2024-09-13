package CH07;

import java.util.Scanner;

public class C01WHILE {

	public static void main(String[] args) {
		
		// 01 while 기본
		// while(조건식) {
		// 조건식이 참인 경우 실행되는 종속 문장(1개의 행일때는 생략가능)
		//}
		
		// 탈출용 변수
		// 탈출을 위한 조건식
		// 탈출을 위한 연산식
		
//		int i= 0;  //탈출용 변수
//		
//		while(i<5) // 탈출을 위한 조건식
//		{
//			System.out.println("HELLO WORLD");
//			i ++; //탈출을 위한 연산식
//		}
		
		
		// 02 1-10 까지 합
		
//		int i =1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println("i : " +i);
//			sum +=i;
//			i++;
//		}
//		System.out.println("sum : "+ sum);
		
		
		
		
		
		
		
		
		
		
		
		//04 1 -n 까지의 합
		
		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		int i =1;
//		while(i<=n) {
//			System.out.println(i);
//			++i;
//		}
		
		// N_ M 까지의 합을 구합니다. (N<m)
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int sum = 0;
//		
//		while(n<=m) {
//			sum += n;
//			++n;
//		}
//		System.out.println(sum);
		
		
		
//		강사님 
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//무한루프(같은수 입력 방지)
		while(n==m) {
			System.out.println("같은 수가 입력되었습니다. 다시 입력하세요..");
			n= sc.nextInt();
			m= sc.nextInt();
		}
		
		// n>m경우 Swap
		int tmp;
		if(n>=m) {
		tmp = m;
		m =n;
		n=tmp;
		}
		System.out.println("n>m 인 상황입니다.n : " + n + "m : " + m);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 01 1-N 까지 수중에 짝수/홀수의 합을 각각 출력
		
//		int n = sc.nextInt();
//		
//		int num1 = 0;
//		int num2 = 0;
//		int i = 1;
//
//		while(i<=n) {
//			
//			//if문 판단 짝수이면
//			if(i%2==0) {
//				num1 += i;
//			}else {
//				num2 += i;
//			}
//			++i;
//			
//			//num1에 값을 더해줌
//			//else문 판단
//			//num2에 값을 더해줌
//			// i를 증감시킴
//			
//		}
//		System.out.printf("짝수 %d",num1);
//		System.out.printf("홀수 %d",num2);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 1-N 까지 수중에 3의 배수만 출력하고 그 합도 출력
		
//		int n = sc.nextInt();
//		
//		int num =0;
//		int i = 1;
//		
//		while(i<=n) {
//			if(i%3==0) {
//				num += i;
//				System.out.println(i);
//			}
//			i++;
//		}System.out.println(num + "합");
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 1-N 까지 수중에 4의 배수를 출력하고 4의 배수가 아닌 나머지의 합을 구하세요
		
//		int n = sc.nextInt();
//		
//		int num = 0;
//		int numX = 0;
//		int i = 1;
//		
//		while(i<=n) {
//			if(i%4==0) {
//				System.out.println(i);
//			}else {
//				numX +=i;
//				System.out.println(numX);
//			}
//		}
		
		//구구단 2단 출력 
		
//		int n = sc.nextInt();
		int i = 2;
		int num = 1;
		
		while(i==2) {
			System.out.println(i);
			System.out.println('*');
			
		}while(num<=9) {
			System.out.println(num);
			++num;
		}
		
		
		
		
	}

}
