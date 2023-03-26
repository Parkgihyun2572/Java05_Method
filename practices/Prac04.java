/*
Q) 	사용자로부터 두 개의 정수를 입력받고,
   	매개변수와 리턴값을 가지는 
   	add, sub, mul, div의 메소드 중에서 
   	실행할 메소드를 선택하여 두 수의 연산 
   	결과값 중 하나를 출력하도록 코드를 작성하시오.

	↓ Console1 ↓				
    정수1 입력: 10
    정수2 입력: 20
    ---------------
    두 수의 연산 선택
    ---------------
    1. 합
    2. 차
    3. 곱
    4. 나눗셈
    ---------------
    연산을 선택하시오: 2
    연산 결과: -10

    ↓ Console2 ↓
    정수1 입력: 10
    정수2 입력: 20
    ---------------
    두 수의 연산 선택
    ---------------
    1. 합
    2. 차
    3. 곱
    4. 나눗셈
    ---------------
    연산을 선택하시오: 4
    연산 결과: 0.5

*/
package practices;

import java.util.Scanner;

public class Prac04 {

	static int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int mul(int a, int b) {
		return a * b;
	}

	static double div(double a, double b) {
		return a / b;
	}

	static void choose(int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------");
		System.out.println("두 수의 연산 선택");
		System.out.println("---------------");
		System.out.println("1. 합");
		System.out.println("2. 차");
		System.out.println("3. 곱");
		System.out.println("4. 나눗셈");
		System.out.println("---------------");
		System.out.print("연산을 선택하시오: ");
		int chooseNum = sc.nextInt();
		System.out.print("연산 결과: ");
		if (chooseNum == 1) {
			System.out.print(add(a, b));
		} else if (chooseNum == 2) {
			System.out.print(sub(a, b));
		} else if (chooseNum == 3) {
			System.out.print(mul(a, b));
		} else if (chooseNum == 4) {
			System.out.print(div(a, b));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = sc.nextInt();
		choose(num1, num2);
	}
}
