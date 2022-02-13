package prjTest;

import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		// 배열이란? 인덱스를 이용해서 자료형이 같은 데이터를 관리하는 것
		// 변수와 마찬가지로, 선언과 초기화 과정이 필요
		
		/*** 자바는 배열의 크기가 정해지면, 크기를 변경할 수 없음 ***/
		
		// 1. 선언 후 초기화
		int[] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4]);
		
		
		// 2. 배열 선언과 초기화를 동시에
		int[] arr2 = {10, 20, 30, 40, 50};
		System.out.println("\narr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr2[3] : " + arr2[3]);
		System.out.println("arr2[4] : " + arr2[4]);

		
		// 3. 배열은 많은 데이터를 효율적으로(쉽게) 관리하기 위해 사용한다.
		// ex) 학사관리
		
		String[] name = {"박찬호", "이승엽", "박병호", "이병규", "류현진"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("\n%S의 점수를 입력하시요 : ", name[0]);
		score[0] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하시요 : ", name[1]);
		score[1] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하시요 : ", name[2]);
		score[2] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하시요 : ", name[3]);
		score[3] = scanner.nextInt();
		System.out.printf("%s의 점수를 입력하시요 : ", name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s 점수 : \t%.2f\n", name[0], (double)score[0]);
		System.out.printf("%s 점수 : \t%.2f\n", name[1], (double)score[1]);
		System.out.printf("%s 점수 : \t%.2f\n", name[2], (double)score[2]);
		System.out.printf("%s 점수 : \t%.2f\n", name[3], (double)score[3]);
		System.out.printf("%s 점수 : \t%.2f\n", name[4], (double)score[4]);
		
		scanner.close();
		System.out.println();
		
		
		// 4. 배열을 구성하는 데이터의 자료형에 따라, 배열의 메모리 크기가 결정된다
		// ex) int[] arr = new int[3]은 int(4byte)공간이 3개 존재 
		//		-> 총 12byte 공간이 메모리에 존재
		
		
		// 5. 기본 자료형 데이터를 담고 있는 변수와 다르게, 배열 변수는 배열 데이터의 주소(레퍼런스)를 담고 있다.
		// 배열 i가 데이터 값이 아닌 i[0]의 시작주소를 가짐
		
		// 배열의 기본 속성
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		// 배열 길이
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		
		// 배열 요소 출력
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		// 배열 요소 복사
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);	// 매개변수 : 복사하고 싶은 배열과 배열 크기
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		// 배열 레퍼런스 
		// - arrAtt3는 arrAtt1과 값은 같지만, 배열을 복사해 새로운 공간을 만들어 다른 주소 공간을 가짐
		// - arrAtt2는 배열 arrAtt1를 가리키고 있어, 같은 주소값을 가진다.
		
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);		// arrAtt1과 같은 주소	
		System.out.println("arrAtt3 : " + arrAtt3);		// arrAtt2와 다른 주소
		
		
		// 6. 다차원 배열 - 3차원이상은 거의 사용x
		int[][] arrMul = new int[3][2]; 	// 3행 2열의 배열
		arrMul[0][0] = 10;					//	10 100
		arrMul[0][1] = 100;					//  20 200
		arrMul[1][0] = 20;					//  30 300
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("\narrMul[0] : " + Arrays.toString(arrMul[0]));	// 1행 - 10
		System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));	// 2행 - 20
		System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));	// 3행 - 30
		
	}

}
