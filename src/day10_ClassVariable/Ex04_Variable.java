package day10_ClassVariable;

public class Ex04_Variable {
	//int var = 12345;	//이런식으로 많이 변수를 만들면 프로그램이 느려짐
	public int cnt = 10;
	public void func01() {
		cnt++; System.out.println("01 cnt : " + cnt);
	}
	public void func02() {
		cnt++; System.out.println("02 cnt : " + cnt);
	}
}
