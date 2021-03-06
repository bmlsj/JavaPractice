package prjTest;

public class operator{

	public static void main(String[] args) {

		// 연산자
		/* 1. 단항 연산자 : 피연산자가 하나 존재
				ex) +5, -5, !x
				
		*  2. 이항 연산자 : 피연산자가 두개 존재
		*  		ex)x=y, y<x, x!=y
		*  3. 삼항 연산자 : 피연산자가 세개 존재
		*  		ex) x>y(조건식) : true ? false */
		
		
		// 대입 연산자
		// '같다'라는 뜻이 아닌 '오른쪽의 값을 왼쪽에 대입한다'는 의미
		// '같다'는 '==' 로 표현
		int x = 10;
		int y = 20;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = y;
		System.out.println("\nx = " + x);
		System.out.println("y = " + y);
		
		
		// 산술 연산자
		x = 10; y = 20;
		System.out.println("\nx + y = " + (x+y));		// 30
		System.out.println("x - y = " + (x-y));		// -10
		System.out.println("x * y = " + (x*y));		// 200
		System.out.println("x / y = " + (x/y));		// 0.5 지만 정수이므로 0
		System.out.println("x % y = " + (x%y));		// 나머지	: 10
		
		
		// 복합 연산자
		/* 1. += : 더하고 대입
		 * 2. -= : 빼고 대입
		 * 3. *= : 곱하고 대입
		 * 4. /= : 나누고 대입
		 * 5. %= : 나머지를 대입
		*/
		
		x = 10;
		System.out.println("\nx += 10 : " + (x+=10));	// 20
		x = 10;
		System.out.println("x -= 10 : " + (x-=10));		// 0
		x = 10;
		System.out.println("x *= 10 : " + (x*=10));		// 100
		x = 10;
		System.out.println("x /= 10 : " + (x/=10));		// 1
		x = 10;
		System.out.println("x %= 10 : " + (x%=10));		// 10으로 나누었을때, 나머지 0
		
		// 증감 연산자
		// ++ : 1만큼 증가
		// -- : 1만큼 감소
		x = 10;
		System.out.println("\n++x : " + (++x));		// 11
		x = 10;
		System.out.println("--x : " + (--x));		// 9
		x = 10;
		System.out.println("x++ : " + (x++));		// 10 -> 이후에 1이 더해짐
		System.out.println("x : " + x);				// 11
		x = 10;
		System.out.println("x-- : " + (x--));		// 10 -> 이후에 1이 감소
		System.out.println("x : " + x);				// 9
		
		
		// 관계 연산자
		x = 10; y = 20;
		System.out.println("\n x > y : " + (x>y));	// false
		System.out.println(" x < y : " + (x<y));	// true
		
		
		// 논리 연산자
		// 1. 논리곱(AND): a && b -> a, b 모두 참이여야 참
		// 2. 논리합(OR) : a || b -> a, b 둘 중 하나가 참이면 참
		// 3. 논리부정(NOT) : !a -> a의 상태를 부정 
		
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("\nb1 && b2 : " + (b1 && b2));	// false
		System.out.println("b1 || b2 : " + (b1 || b2));		// true
		System.out.println("!b1 : " + (!b1));				// true
		
		// 조건(삼항) 연산자
		// 두개의 피연산자 연산 결과에 따라, 나머지 피연산자가 결정된다.
		// 조건식 ? 식1 : 식2	-> 조건식이 참이면 식1, 거짓이면 식2가 실행된다.
		x = 10; y = 20;
		int result = 0;
		result = (x > y)? 100 : 200;
		System.out.println("\nresult : "+ result);	// 200
		
		result = (x < y)? 100 : 200;
		System.out.println("result : "+ result);	// 100
		
		result = (x == y)? 100 : 200;
		System.out.println("result : "+ result);	// 200
		
		
		// 비트 연산자
		// 데이터를 bit단위로 환산하여 연산을 수행, 다른 연산자보다 연산 속도가 향상된다.
		// 1. &(AND 연산) : a & b -> a와 b가 모두 1이면, 1
		// 2. |(OR 연산) : a | b -> a, b 중 하나라도 1이면, 1
		// 3. ^(XOR 연산) : a^b -> a, b가 서로 같지 않으면, 1
		x = 2;	// 0000 0010
		y = 3;	// 0000 0011
		
		System.out.println("x & y : " + (x&y));	// 0000 0010 : 2
		System.out.println("x | y : " + (x|y));	// 0000 0011 : 3
		System.out.println("x ^ y : " + (x^y)); // 0000 0001 : 1

		
	}

}
