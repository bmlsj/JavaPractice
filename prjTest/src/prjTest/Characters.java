package prjTest;

public class Characters {
	
	public static void main(String[] args) {
		
		// 특수 문자 : 특수한 목적으로 사용되는 문자
		/* 탭 : /t 
		 * 줄바꿈 : \n
		 * 작은 따옴표 : \'
		 * 큰 따옴표 : \"
		 * 역 슬래쉬 : \\
		 * */
		
		System.out.println("1. Good\tMorning");
		System.out.println("2. Good\n\nMorning");
		System.out.println("3. Good \'Morning\'");
		System.out.println("4. Good \"Morning\"");
		System.out.println("5. Good \\Morning\\");
		
		
		// 서식 문자 : 서식에 사용되는 문자
		/* %d : 10진수, %o : 8진수
		 * %x : 16진수, %c : 문자
		 * %s : 문자열, %f : 실수*/
		
		System.out.printf("\n오늘의 기운은 %d도 입니다.\n", 10);
		int num = 20;
		System.out.printf("오늘의 기온은 %d도 입니다.\n", num);
		
		// 숫자
		int num2 = 30;
		System.out.printf("num2의 10진수 : %d\n", num2);
		System.out.printf("num2의 8진수 : %o\n", num2);
		System.out.printf("num2의 16진수 : %x\n", num2);
		
		// 문자
		char c1 = 'a';
		char c2 = 'A';
		System.out.printf("소문자 \'c\'의 대문자는 \'%c\'입니다.\n", c1, c2);
		
		// 실수
		float f = 1.234f;
		System.out.printf("f = %f\n", f);
		
		double d = 0.123344d;
		System.out.printf("d = %f\n", d);
		
		
		// 정렬과 소수점 제한 기능
		// 일반
		System.out.printf("\n%d\n", 123);		//123
		System.out.printf("%d\n", 1234);		//1234
		System.out.printf("%d\n", 12345);		//12345
		
		// 정렬
		System.out.printf("\n%5d\n", 123);		//   123
		System.out.printf("%5d\n", 1234);		//  1234
		System.out.printf("%5d\n", 12345);		// 12345
		
		// 소수점 제한
		System.out.printf("\n%f\n", 1.23); 		// 	1.230000
		System.out.printf("%.0f\n", 1.23);		//	1
		System.out.printf("%.1f\n", 1.23);		//	1.2
		System.out.printf("%.2f\n", 1.23);		//	1.23
		System.out.printf("%.3f\n", 1.23);		//	1.230


	}

}
