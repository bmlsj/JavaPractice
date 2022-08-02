package prjTest;

public class variable_2 {

	public static void main(String[] args) {
		// 변수란? 데이터(자료)를 임시로 담을 수 있는 메모리 공간
		/* byte, boolean : 1byte
		 * char, short : 2byte
		 * int, float : 4byte
		 * long, double : 8byte 
		 * */
		
		
		/* 정수 */
		int i = 10;
		int j;
		j = 100;
		
		// 변수값은 변화 가능
		System.out.println("i = " + i);
		
		i = 200; 
		System.out.println("i = " + i);
		System.out.println("i+j = " + (i+j));
		
		/* 실수 */
		double d = 10.123;
		System.out.println("d = " + d);
		
		/* 문자 */
		char c = 'a';
		System.out.println("c = " + c);
		
		/* 문자열 */
		String s = "Hello Java World!!";
		System.out.println("s = " + s);
		
		/* 참, 거짓 */
		boolean b = false;
		System.out.println("b = " + b);
		
		
		
		/* 형변환 */
		// 자동(묵시적) 형변환 : 작은 공간의 메모리에서 큰 공간의 메모리로 이동
		byte by = 10;	// 1byte
		int in = by;	// 4byte
		System.out.println("in = " + in);
		
		
		// 명시적 형변환 : 큰 공간의 메모리에서 작은 공간의 메모리로 이동
		int iVar = 100;
		byte bVar = (byte)iVar;		// 4byte의 int가 1byte인 byte로 형변환
		System.out.println("bVar = " + bVar);
		
		// 명시적 형변환은 데이터가 누실될 수 있다.
		// 큰 수가 1byte 공간으로 다 들어갈 수 없음
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
		
	}

}
