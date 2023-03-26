/*	도전과제
Q)	주어진 자연수가 소수인지 아닌지를 검사하여 
	true/false로 결과를 알려주는 prime(int num) 메소드를 먼저 작성하고, 
	이 메소드를 이용하여 1부터 100사이에 존재하는 소수들을 모두 출력해 보시오.
	(소수는 1과 자기 자신만을 약수로 가지는 수이다.)
	
	↓ Console ↓
	2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

*/
package practices;

public class Prac03 {

	static boolean prime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (prime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
