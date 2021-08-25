package dp;

public class PartitionProblem {
	

	public String validIPAddress(String IP) {
	       
        if(IP==null) return "Neither";
        String[] arr = IP.split("\\."); 
        char ch = IP.charAt(IP.length()-1);
        if(ch == '.' || ch == ':') return "Neither";
        if(arr.length==4){
            return testip4(arr);
        }
        else{
        String arr1[]=IP.split(":");
        if(arr1.length==8) {
            return testip6(arr1);
        }
        }
        return "Neither";
        
    }
    
    
    private String testip4(String[] str){
        for(String st:str){
             try{
                 int val = Integer.parseInt(st);
                 if(val>255 || val<0) return "Neither";
             }
            catch(Exception e){
                return "Neither";
            }
             
            if(st.length()>3) return "Neither";
            else if(st.charAt(0)=='0' && st.length()>1) return "Neither";
        }
        
        return "IPv4";
    }
    
     private String testip6(String str[]){
        for(String st:str){
            try {
             Long.parseLong(st, 16);
                }
           catch (NumberFormatException ex) {
             return "Neither";
               }   
        } 
        return "IPv6";
    }
	     
	     public static void main(String[] args) {
	    	 
	    	 PartitionProblem ip = new PartitionProblem();
	    	 System.out.println(ip.validIPAddress("0.0.0.-0"));
			
		}

}
