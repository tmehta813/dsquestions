package trie;

public class InsertAndSearch {
	
	Node head;
	
	public static void main(String[] args) {
		
		InsertAndSearch i = new InsertAndSearch();
		i.insert("word");
		i.search("word");
		i.search("hello");
		i.insert("hello");
		i.search("hello");
		i.search("wo");
		i.search("wordd");
	}
	
	
	void search(String str) {
	
		if(head==null) {
			System.out.println("head is null");
		}
		Node node = head;
		boolean isFound = true;
		for(char ch:str.toCharArray()) {
			if(node.chArray[ch-'a']==null) {
				isFound= false;
				break;
			}
			else {
				node = node.chArray[ch-'a'];
			}
		}
		
		if(isFound && node.isEnd) {
			System.out.println("word found");
		}
		else {
			System.out.println("no word found");
		}
		
	}
	
	
	void insert(String str) {

		if(head==null) {
			head = new Node('\u0000');
		}
		
		Node node = head;
		
		for(char ch: str.toCharArray()) {
			if(node.chArray[ch-'a']==null) {
				Node newNode = new Node(ch);
				node.chArray[ch-'a']=newNode;
				node=newNode;
			}
			else {
				node = node.chArray[ch-'a'];
			}
		}
		node.isEnd=true;
		
	}
	
	static class Node{
		Character ch;
		boolean isEnd;
		Node chArray[]=new Node[26];
		Node(Character ch) {
			this.ch=ch;
		}
	}

}
