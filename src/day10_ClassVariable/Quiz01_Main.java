package day10_ClassVariable;

import java.util.Scanner;

public class Quiz01_Main {
	public static void main(String[] args) {
		
		boolean bool = true;
		
		Quiz01 q = new Quiz01();
		
		while(bool) {
			System.out.println("=== UP & Down Game ===");
			System.out.println("1. ���ӽ���");
			System.out.println("2. ��������");
			System.out.println("3. ��������");
			System.out.print(">>>> ");
			q.scan();
			
			switch(Quiz01.select) {
			case 1:
				int num = q.mathrandom();
				System.out.println("��ǻ�� ���� : " + num);
				System.out.println("=== START ===");
				for(;;) {
					System.out.print("Input Number --> ");
					q.scan();
			
					if(Quiz01.select < num) {
						Quiz01.cnt++;
						System.out.println("===  U  P  ===");
					}
					else if(Quiz01.select > num) {
						Quiz01.cnt++;
						System.out.println("===  Down  ===");
					}
					else {
						Quiz01.cnt++;
						System.out.println(Quiz01.cnt + "ȸ ���� ������ϴ�!!!");
						
						if(Quiz01.best == 0) {
							Quiz01.best = Quiz01.cnt;
							Quiz01.cnt = 0;
							break;
						}
						else if(Quiz01.cnt<Quiz01.best) {
							Quiz01.best = Quiz01.cnt;
							System.out.println("�ְ����� �����Ͽ����ϴ�.");
							Quiz01.cnt = 0;
							break;
						}
						else {
							Quiz01.cnt = 0;
							break;
						}
	
					}
				}
				break;
			case 2:
				if(Quiz01.best == 0) {
					System.out.println("������ �������� �ʾҽ��ϴ�");
					break;
				}
				else {
					System.out.println("�ְ� ������ " + Quiz01.best + "ȸ �Դϴ�!!!");
					break;
				}
			case 3:
				System.out.println("������ ���� �մϴ�!!!");
				bool = false;
				break;
			default:
				System.out.println("1~3�߿� �ϳ��� �Է����ּ���");	
			}
			
		}
		
		
		
	}
}
