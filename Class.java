package javaMidterm;
import java.util.*;

public class Class {
	
	public static int[] twoSum(int[]list, int target) {
		Map<Integer,Integer>map=new HashMap<>();
		int []a= new int[2];
		for(int i=0;i<list.length;i++) {
			map.put(list[i],i);
			
			int targetResult=target-list[i];
			System.out.print(i);
			if(map.containsKey(targetResult)) {
				
				 if(map.get(targetResult)!=i)
					a[0]=map.get(targetResult);
				 	a[1]=i;
				// or we can use return new int[]={map.get(targetResult),i}
			}
	
		}
		return a;
	}
}
