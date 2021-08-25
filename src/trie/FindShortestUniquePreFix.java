package trie;

public class FindShortestUniquePreFix {
	
	Node head = null;
	
	
	void insert(char character[]) {
	 if(head==null) head = new Node();
	 Node node = head;
	 for(char ch: character) {
		 if(node.nodes[ch-'a']==null) {
			 Node newNode = new Node();
			 node.nodes[ch-'a']=newNode;
			 ++newNode.frequency;
			 node=newNode;
		 }
		 else {
			 node=node.nodes[ch-'a'];
			 ++node.frequency;
		 }
	 }
	 node.isEnd=true;
	}
	
	
	void printValue(char[] character) {
		
		Node node = head;
		
		StringBuilder builder = new StringBuilder();
		for(char ch: character) {
			if(node.nodes[ch-'a'].frequency==1) {
				builder.append(ch);
				break;
			}
			else {
				builder.append(ch);
				node=node.nodes[ch-'a'];
			}
		}
		System.out.println(builder.toString());
		
	}
	
	
	public static void main(String[] args) {
		
		String arr[] = {"zebra", "dog", "duck", "dove"};
		
		FindShortestUniquePreFix obj = new FindShortestUniquePreFix();
		
		for(String str:arr) {
			obj.insert(str.toCharArray());
		}
		
		for(String str:arr) {
			obj.printValue(str.toCharArray());
		}
		
		
	}
	
	static class Node {
		Node nodes[]=new Node[26];
		int frequency=0;
		boolean isEnd;
	}

}
