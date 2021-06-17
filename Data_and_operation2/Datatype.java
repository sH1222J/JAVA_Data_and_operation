/*
 * datatype(자료형)에는 number(숫자), string(문자) 등이 있다.
데이터타입에 따라서 처리방식이 달라지므로 잘 구분해야 한다.
1) 어떤 종류의 데이터타입들이 존재하는가
2) 각각의 데이터타입별로 어떤 연산방식이 있는가

Sout + Ctrl + spacebar => System.out.println()

 * 데이터 타입별로 어울리는 연상 방법이 존재하기 때문에 엄격하게 구분
 * 데이터를 구분하는 이유는 데이터별로 다뤄지는 연산방법이 다르기 때문이다
Number - ()
String - (" ")
syout + ( )
syout + ("")

 */

public class Datatype {
	public static void main(String[] args) {
		System.out.println(6); // Number
		System.out.println("six"); // string
		System.out.println("6"); // string 6
		System.out.println(6+6); // 12
		System.out.println("6"+"6"); // 66
		System.out.println(6*6); // 36
//		System.out.println("6"*"6"); // 문자열이란 데이터타입은 곱하기라는 연산자를 이용할수없음
		System.out.println("1111".length()); // 4
//		System.out.println(1111.length()); // 숫자의 길이를 알려주는 연산자가 없다.
	}
}