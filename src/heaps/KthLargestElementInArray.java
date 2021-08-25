package heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInArray {
	
	public static void main(String[] args) {
		int arr[] = {12, 5, 787, 1, 23};
		int k =2;
		Queue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
		for(int i=0;i<k;i++) {
			queue.add(arr[i]);
		}
		for(int i:arr) {
			if(queue.peek()<i) {
				queue.poll();
				queue.add(i);
			}
			
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
