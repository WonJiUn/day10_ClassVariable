package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {
	//인스턴스 변수로 선언
	//입력, 출력 기능으로 나누세요
	
	public int age;			//여기저기에서 다 쓰려면 인스턴스변수로 선언하는것이 좋음
	public String name;
	
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름입력");
		name = input.next();
		System.out.println("나이입력");
		age = input.nextInt();
	}
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
