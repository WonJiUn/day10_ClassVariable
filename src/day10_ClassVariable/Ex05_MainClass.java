package day10_ClassVariable;

public class Ex05_MainClass {
	public static void main(String[] args) {
		
		Ex05_Variable.cnt = 888;	//�ش��ϴ� ������ ���� new�� ��üȭ���� �ʾұ� ������ ����
		//��, static�� ���̸� ��ó�� ��밡��. ��ü�� ������ �ʾƵ� ������ �̸� �������ڴٴ� �ǹ�
		
		System.out.println(Ex05_Variable.cnt);	//Ŭ���������� ���ٰ���
		//Ex05_Variable ex = new Ex05_Variable();
		//ex.cnt = 888;
		
		Ex05_Variable.func();
		
		//static�� ���� �������� ������� ������ static�� �ִ°����� ����Ϸ��� �ϸ� �����߻�
	}
}
