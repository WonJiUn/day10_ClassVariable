package day10_ClassVariable;

import java.util.Scanner;

public class Ex06_final {
	public final String KOREA = "대한민국";
	public void func() {
		System.out.println("변경 전 KOREA : " + KOREA);
		Scanner input = new Scanner(System.in);
		System.out.print("입력 : ");
		//KOREA = input.next();		//final이 붙은 값을 변경하려고 하면 에러
		System.out.println("변경 후 KOREA : " + KOREA);
	}
}
