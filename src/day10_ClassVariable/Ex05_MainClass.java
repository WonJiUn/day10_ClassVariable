package day10_ClassVariable;

public class Ex05_MainClass {
	public static void main(String[] args) {
		
		Ex05_Variable.cnt = 888;	//해당하는 변수가 아직 new로 객체화되지 않았기 때문에 에러
		//단, static을 붙이면 위처럼 사용가능. 객체를 만들지 않아도 변수는 미리 만들어놓겠다는 의미
		
		System.out.println(Ex05_Variable.cnt);	//클래스명으로 접근가능
		//Ex05_Variable ex = new Ex05_Variable();
		//ex.cnt = 888;
		
		Ex05_Variable.func();
		
		//static이 없는 공간에서 만들어진 변수를 static이 있는곳에서 사용하려고 하면 에러발생
	}
}
