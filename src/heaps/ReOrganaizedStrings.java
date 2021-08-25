package heaps;
import java.util.ArrayList;
import java.util.PriorityQueue;

import java.lang.Comparable;

public class ReOrganaizedStrings {
	
	public static void main(String[] args) {
		
		String str = "abghga";
		int count[]=new int[26];
		for(char ch:str.toCharArray()) {
			count[ch-'a']++;
		}
		
		PriorityQueue<Key> pq = new PriorityQueue<Key>();
		for(int i='a';i<='z';i++) {
			if(count[i-'a']>0) {
				pq.add(new Key((char)i,count[i-'a']));
			}
		}
		
		for(Key key:pq) {
			System.out.println("key ch: "+ key.ch +" count: "+key.count);
		}
		
		StringBuilder builder = new StringBuilder();
		int i =0;
		Key previousKey = new Key('#',-1);
		while(!pq.isEmpty()) {
			
			Key k = pq.poll();
			builder.append(k.ch);
			
			if(previousKey.count>0) {
				pq.add(previousKey);
			}
		
			k.count=k.count-1;
		
			previousKey=k;
		}
		
		if(builder.length()==str.length())
		System.out.println(builder.toString());
		else
			System.out.println("can't formed");
			
		
	}
	
	static class Key implements Comparable<Key>{
		char ch;
		int count;
		Key(char ch, int count){
			this.ch=ch;
			this.count=count;
		}
		
		@Override
		public int compareTo(Key key1) {
			return key1.count-this.count;
		}
	}

}
