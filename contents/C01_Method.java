/*
# 메소드(Method)
클래스 내에서 선언된 함수(function)
메소드는 어떤 기능(작업)을 수행하는 실행문들의 집합이다.

1. 메소드 선언
	리턴타입 메소드명(매개변수선언){
		실행문..
	}
	
메소드를 선언하여 '메소드명'이 어떤 기능들을 수행하도록 정해놓는다.

2. 메소드 실행
	메소드명(매개값..);

# return문
메소드 선언에 리턴타입이 있는 메소드는 리턴문으로 리턴값을 지정해야 한다.
	return 리턴값;
	
# 리턴타입 (출력)
리턴 타입은 리턴값의 타입
리턴값은 메소드를 실행한 후 반환되는 결과값이다.
void: 리턴값이 없는 메소드의 리턴타입

# 매개변수 (입력)
메소드를 실행할 때 필요한 데이터를 외부로부터 입력 받기 위한 변수
매개변수는 0개 또는 여러개 선언 가능

# 메소드 입출력 흐름
(입력) -> 메소드 실행 -> (출력)
(매개변수) -> 메소드 선언 -> (리턴값)

*/
package contents;

public class C01_Method {
	public static void main(String[] args) {
		//메소드 호출(=실행)
		int a = outTen();
		System.out.println(a);
		
		/* 리턴 타입에 따른 메소드 호출 */
		int b = outZero();
		System.out.println(b);
		
		double c = outPI();
		System.out.println(c);
		
		char d = ch();
		System.out.println(d);
		
		System.out.println(hello());
		
		//리턴값 없는 메소드 호출
//		System.out.println(noReturn());
		noReturn();
		
		/* 매개변수를 이용한 메소드 실행 */
		int num1 = 50;
		int num2 = 20;
		
		//매개값: a <= 50
		int plus = addTen(num1);
		System.out.println(plus);
		System.out.println(addTen(50));
		
		//매개값: a <= 50, b <= 20
		int minus = sub(num1, num2);
		System.out.println(minus);
		System.out.println(sub(50,num2));
		
		//매개값: a <= 50, b <= 20, c <= 20
		double average = avg(num1, num2, 20);
		System.out.println(average);
		
		//메세지 내용을 주어진 횟수만큼 출력해주는 메소드 호출
		msg_repeat("벚꽃이 곧 핍니다", 3);
		msg_repeat("오늘은 목요일입니다", 4);
	}
	
	//메소드 선언하기
	static int outTen() {
		return 10;
	}
	
	/* 리턴 타입에 따른 메소드 선언 */
	//정수형 리턴 타입
	static int outZero() {
		return 0;
	}
	
	//실수형 리턴 타입
	static double outPI() {
		return 3.14;
	}
	
	//문자 리턴 타입
	static char ch() {
		return 'K';
	}
	
	//문자열 리턴 타입
	static String hello() {
		return "Hello world!";
	}
	
	//리턴값이 없는 메소드 선언
	static void noReturn() {
		System.out.println("리턴값이 없는 메소드");
		//내부 코드만 실행하고 반환되는 값이 없다.
	}
	
	/* 매개변수를 이용한 메소드 선언 */
	//매개변수 1개
	static int addTen(int a) {
		return a + 10;
	}
	
	//매개변수 2개
	static int sub(int a, int b) {
		return a - b;
	}
	
	//매개변수 3개: 실수 리턴타입, 정수 매개변수
	static double avg(int a, int b, int c) {
		int sum = a + b + c;
		return sum/3.0;
	}
	
	//메소드 기능: 메세지 내용을 주어진 횟수만큼 출력해주는 메소드
	//리턴값 없음, 매개변수 2개 문자열과 정수타입
	static void msg_repeat(String msg, int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.println(msg);
		}
	}
}
