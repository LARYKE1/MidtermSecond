package javaMidterm;

import java.util.*;

public class MidtermEx {

	public static void main(String[] args) {
		int []list= {1,2,3,4,5,12};
		int target=4;

		int[]result=javaMidterm.Class.twoSum(list,target);
		
		System.out.println(Arrays.toString(result));
		for(int i:result) {
			System.out.print(list[i]+" ");
		}
	}
}
