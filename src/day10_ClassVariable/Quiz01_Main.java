package day10_ClassVariable;

import java.util.Scanner;

public class Quiz01_Main {
	public static void main(String[] args) {
		
		boolean bool = true;
		
		Quiz01 q = new Quiz01();
		
		while(bool) {
			System.out.println("=== UP & Down Game ===");
			System.out.println("1. 게임시작");
			System.out.println("2. 게임전적");
			System.out.println("3. 게임종료");
			System.out.print(">>>> ");
			q.scan();
			
			switch(Quiz01.select) {
			case 1:
				int num = q.mathrandom();
				System.out.println("컴퓨터 숫자 : " + num);
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
						System.out.println(Quiz01.cnt + "회 만에 맞췄습니다!!!");
						
						if(Quiz01.best == 0) {
							Quiz01.best = Quiz01.cnt;
							Quiz01.cnt = 0;
							break;
						}
						else if(Quiz01.cnt<Quiz01.best) {
							Quiz01.best = Quiz01.cnt;
							System.out.println("최고기록을 갱신하였습니다.");
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
					System.out.println("게임을 시작하지 않았습니다");
					break;
				}
				else {
					System.out.println("최고 점수는 " + Quiz01.best + "회 입니다!!!");
					break;
				}
			case 3:
				System.out.println("게임을 종료 합니다!!!");
				bool = false;
				break;
			default:
				System.out.println("1~3중에 하나를 입력해주세요");	
			}
			
		}
		
		
		
	}
}
