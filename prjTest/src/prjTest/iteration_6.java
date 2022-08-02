package prjTest;

import java.util.Scanner;

public class iteration_6 {

	public static void main(String[] args) {

		// 반복문
		// for, while문 : 조건이 참일때까지 반복 수행

		
		// 1. for문
		// 구구단
		System.out.print("Input num : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		for (int i = 1; i < 10; i += 2) { // i가 1부터 9까지 2씩 증가
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
		}

		
		
		// 2. while문
		System.out.print("Input num : ");
		int num = scanner.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
			i++;
		}
		System.out.println();

		
		
		// 3. do - while 문
		// 조건과 상관없이 무조건 한번은 프로그램 수행

		i = 10;
		do { // do를 먼저 실행하고, while이 true이면 더 실행
			System.out.println("무조건 1번은 실행");
			i++;
		} while (i < 13);

		scanner.close();
	}

}
