package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		String str = "google";
		char[] ch = str.toCharArray();
		
		Set<Character> setStr = new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			setStr.add(ch[i]);			
		}		
		//System.out.print(setStr);
		for(Character character : setStr) {
			System.out.print(character);
		}
	}

}
