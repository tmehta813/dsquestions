package array;
import java.util.ArrayList;
import java.util.Collections;

//N meetings in one room 
//https://www.youtube.com/watch?v=II6ziNnub1Q


public class Q16 {
	
	public static void main(String[] args) {
		
		Q16 q = new Q16();
		int start[] = {10, 12, 20};
		int end[] =  {20, 25, 30};
		ArrayList<Meeting> list = new ArrayList();
		for(int i=0;i<start.length;i++) {
			list.add(new Meeting(start[i],end[i],i));
		}
		
		Collections.sort(list, (o1,o2)-> o1.end-o1.end);
		for(Meeting meeting: list) {
			System.out.println("start:"+meeting.start+" end: "+meeting.end);
		}
		
		int last=0;
		int ans=0;
		for(Meeting meeting: list) {
			if(meeting.start>=last) {
				ans+=1;
				last=meeting.end;
			}
		}
		
		System.out.println("ans:"+ans);
		
		
	}

}


class Meeting{
	int start;
	int end;
	int index;
	Meeting(int start, int end, int index){
		this.start=start;
		this.end=end;
		this.index=index;
	}
}