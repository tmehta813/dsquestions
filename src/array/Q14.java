package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//Find the maximum and minimum element in an array

public class Q14 {
	
	public static void main(String[] args) {
	
		Queue<Integer> queue = new LinkedList();
		for(int i=0;i<10;i++) {
			queue.add(i);
		}
		
//		System.out.println(queue.remove());
//		System.out.println(queue.peek());
//		System.out.println(queue.peek());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		
		Iterator<Integer> iterator = queue.iterator();
//		while(iterator.hasNext()) {
//			//System.out.println(iterator.next());
//		}
		
		//sortArray();
		//hashsetTest();
		hashMapTest();
	}
	
	
	private static void hashMapTest() {
		Map<Integer,Integer> map = new HashMap();
		map.put(10, 15);
		map.put(15, 15);
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
	}


	static void sortArray() {
		int[][] array= {
				{1, 5,4},
				{13, 1,8},
				{4, 1,0},
				{12, 90,100},
				{12, 85,45} };
		
		for(int i=0;i<array.length;i++) {
			Arrays.sort(array[i]);
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	static void hashsetTest() {
		
	  Set<Integer> set = new LinkedHashSet();	
	  
	  set.add(10);
	  set.add(15);
	  set.add(16);
	  
	  Iterator iterator = set.iterator();
	  while(iterator.hasNext()) {
		  System.out.println(iterator.next());
	  }
		
	}
	
	

}


//stack 2,1
//print: 2,1,1,1,2,1,1,		