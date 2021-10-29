package telran.util;

import java.util.Comparator;

public class ComparatorNumInverse implements Comparator<Integer> {
	@Override
	public int compare(Integer num1, Integer num2) {
		
		return num2.compareTo(num1);
	}

}
