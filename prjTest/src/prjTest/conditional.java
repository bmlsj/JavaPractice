package prjTest;

import java.util.Scanner;

public class conditional {

	public static void main(String[] args) {
		
		// 조건문
		
		// 1. if문
		int num1 = 10;
		int num2 = 20;
		
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		} else if(num1 > num2) {
			System.out.println("num1는 num2보다 크다.");
		}else {
			System.out.println("num1과 num2는 같다.\n");
		}
		
		
		
		// 2. switch문
		System.out.println("점수를 입력하세요 : ");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch(score) {
			case 100:
			case 90:
				System.out.println("수");
				break;
				
			case 80:
				System.out.println("우");
				break;
			case 70:
				System.out.println("미");
				break;
				
			default:
				System.out.println("try again!");
				break;
		}
		
		inputNum.close();
	}

}
