package trie;

public class PhoneDirectory {
	
	Node head;
	
	
	void search(String str) {
		
		Node node = head;
    		
		if(node==null) return;
		boolean found = true;
		int i=0;
		for(char c:str.toCharArray()) {
			
			int index = c-'a';
			if(node.chArray[index]!=null) {
				node = node.chArray[index];
				i++;
			}
			else {
				System.out.println("no string found");
				found=false;
				break;
			}
		}
		
		if(found) {
			search(node,str.substring(0, i));
		}
	}
	
	
	void search(Node node, String ans) {
		if(node!=null && node.isEnd) {
			System.out.println(ans);
		}
		
	  for(char ch ='a'; ch<='z';ch++) {
		  int index = ch-'a';
		  if(node.chArray[index]!=null) {
			  search(node.chArray[index],ans+ch);
		  }
	  }
		
	}
	
	
	
	
	public static void main(String[] args) {
		String contact[] = {"geeikistest", "geeksforgeeks", 
		"geeksfortest"};
		
		PhoneDirectory phone = new PhoneDirectory();
		for(String str:contact) {
			phone.insert(str);
		}
		
		phone.search("geek");
	}
	
	void insert(String str) {

		if(head==null) {
			head = new Node();
		}
		
		Node node = head;
		
		for(char ch: str.toCharArray()) {
			if(node.chArray[ch-'a']==null) {
				Node newNode = new Node();
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
		boolean isEnd;
		Node chArray[]=new Node[26];
	}


}
