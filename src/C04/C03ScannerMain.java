package C04;

import java.util.Scanner;

public class C03ScannerMain {

	public static void main(String[] args) {
		//이름을 입력하세요? 홍길동
		//홍길동 님의 나이를 입력하세요? 35
		//홍길동 님의 주소를 입력하세요? 대구광역시 달서구 000
		// 홍길동 님의 나이는 35세 주소는 대구광역시 ~~  입니다

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :" );
		String str1 = sc.next();
		
		System.out.print("나이를 입력하세요 :");
		int num1 = sc.nextInt();
		
		System.out.print("주소를 입력하세요 : ");
	}

}
