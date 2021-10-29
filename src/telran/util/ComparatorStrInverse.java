package telran.util;

import java.util.Comparator;

public class ComparatorStrInverse implements Comparator<String> {
	@Override
	public int compare(String str1, String str2) {
		
		return str2.compareTo(str1);
	}
}
