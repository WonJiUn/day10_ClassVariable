package day10_ClassVariable;

public class Ex03_MainClass {
	public static void main(String[] args) {
		
		/*
		 Ŭ���� ����
		 - ���α׷� ���۽� ����(�޸𸮿� �ö� ��)
		 - ��� ������ ��밡���ϴ�
		 
		 �ν��Ͻ�(��ü) ����
		 - �ν��Ͻ��� ������ ��(new�� ������ ��)
		 
		 ���� ����
		 - Ư�� �������� ������ ��
		 - �ش� ���������� ��밡���ϴ�
		 - �Ǵ� �ش� ������ ���ӵǾ� �ִ� ������ ��� ����
		 */
		
		int cnt = 0;	//main �ȿ����� ��밡���� ��������
		if(cnt == 0) {
			int test = 1000;	//if�� �ȿ����� ��밡���� ��������
			System.out.println(cnt);
			System.out.println(test);
		}
		
		Ex03_Variable ex = new Ex03_Variable();
		int a = ex.variable01();
		ex.variable02(a);
	}
}
