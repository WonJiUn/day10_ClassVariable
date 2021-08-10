package day10_ClassVariable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Lotto{
	ArrayList arr = new ArrayList();
	HashSet hs = new HashSet();
	Iterator it = hs.iterator();
	
	public void arrSelect() {
		for(int i = 0; i<6; i++) {
			int num = (int)(Math.random()*45 + 1);
			if(arrCheck(num) == 1) {
				arr.add(num);
			}
			else if(arrCheck(num) == 0) {
				i--;
				continue;
			}
		}
	}
	
	public int arrCheck(int num) {
		if(arr.contains(num) == true) {
			return 0;
		}
		else return 1;
	}

	public void hsSelect() {
		for(int i = 0; i<6; i++) {
			int num = (int)(Math.random()*45 + 1);
			hs.add(num);
			if(i == 5 && hs.size() != 6) {
				i--;
				continue;
			}
		}
	}
	public void hsDisp() {
		hsSelect();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
	}
	
}


public class Quiz02 {
	public static void main(String[] args) {
		
		Lotto lotto = new Lotto();
		lotto.arrSelect();
		lotto.hsSelect();
		
		System.out.println("·Î¶Ç ÃßÃ· : " + lotto.arr);
		System.out.println("·Î¶Ç ÃßÃ· : " + lotto.hs);

		
		
		
	}
}
