package binarytrees;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumSwapRequireToConvertBinaryTreeToBST {
	
	public static void main(String[] args) {
		
		 int []a =       {1,5,4,3,2};
		 
		 int newArray[]= {1,2,3,4,5};
		 
		 int index[] =   {0,4,3,2,1};
		 minSwap(a);
		
	}
	
	static void minSwap(int arr[]) {
		
		int n = arr.length;
		ArrayList<Pair> list = new ArrayList();
		for (int i = 0; i < n; i++)
            list.add(new Pair(arr[i], i));
		
		Collections.sort(list,(a,b)->a.item-b.item);
		boolean visited[]=new boolean[n];
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(visited[i] || list.get(i).index==i) {
				continue;
			}
			
			ans++;
			swap(i,list.get(i).index,list);
			i--;
			
		}
		
		System.out.println(ans);

	
		
	}
	
	
	private static void swap(int index, int i, ArrayList<Pair> list) {
	 
		Pair pair = list.get(index);
		int pairindex = pair.index;
		int pairItem = pair.item;
		list.get(index).index=list.get(i).index;
		list.get(index).item=list.get(i).item;
		
		list.get(i).index=pairindex;
		list.get(i).item=pairItem;
		
	}


	static class Pair{
		int item;
		int index;
		Pair(int item, int index){
			this.item=item;
			this.index=index;
		}
	}

}
