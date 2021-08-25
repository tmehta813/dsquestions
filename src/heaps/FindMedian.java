package heaps;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedian {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> left = new PriorityQueue<Integer>();
		PriorityQueue<Integer> right = new PriorityQueue<Integer>(Collections.reverseOrder());
		boolean isLeft=true;
		boolean isRight=false;
		int arr[] = {5,15,1,3};
		for(int i=0;i<arr.length;i++) {
			
			//very important
			if(right.size()>0 && arr[i]>right.peek()) {
				right.add(arr[i]);
			}
			else {
				left.add(arr[i]);
			}
			
			
			if(left.size()-right.size()>=2) {
				right.add(left.poll());
				isRight=true;
				isLeft=false;
			}
			else if(right.size()-left.size()>=2) {
				left.add(right.poll());
				isRight=false;
				isLeft=true;
			}
			
		}
		
		if(left.size()>=right.size()) {
			System.out.println(left.poll());
		}
		else {
			System.out.println(right.poll());
		}
		
		
	}

}
