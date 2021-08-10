package day10_ClassVariable;

import java.util.Scanner;

public class Quiz01 {
	public static int select;
	public static int cnt = 0;
	public static int best = 0;

	public void scan() {
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
	}
	
	public int mathrandom() {
		int num = (int)((Math.random()*99)+1);
		return num;
	}
	
	
}
