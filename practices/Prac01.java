/*
Q)  사용자로부터 출력할 횟수를 숫자로 입력 받고, 
	입력 받은 숫자만큼 "Time waits for no one" 문자열을 
	화면에 출력하는 메소드를 만들고 실행하는 코드를 작성하시오.

    ↓ Console ↓
	출력할 횟수 입력: 5
	Time waits for no one
	Time waits for no one
	Time waits for no one
	Time waits for no one
	Time waits for no one
	
    ↓ Console2 ↓
	출력할 횟수 입력: 2
	Time waits for no one
	Time waits for no one

*/
package practices;

import java.util.Scanner;

public class Prac01 {

	static void repeatMsg(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.println("Time waits for no one");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문구를 출력할 횟수를 입력해주세요: ");
		int num = sc.nextInt();
		repeatMsg(num);
	}
}
