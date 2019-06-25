public class leetcode0625_2{
    public static int numDecodings(String s) {
    	
    	   if(s==null||s.isEmpty())
    		   return 0;
            int[] dp=new int[s.length()];
        	if(Integer.parseInt(String.valueOf(s.charAt(0)))==0)
        		return 0;  	                            
            
        	if(Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))!=0)
        	   dp[s.length()-1]=1;
        	else
        		dp[s.length()-1]=0;
            if(s.length()==1)
                return dp[0];
            if((Integer.parseInt(String.valueOf(s.charAt(s.length()-2)))*10+Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))>26&&
                    Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))==0)||(Integer.parseInt(String.valueOf(s.charAt(s.length()-2)))==0&&Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))==0))
                return 0;
        	if(Integer.parseInt(String.valueOf(s.charAt(s.length()-2)))*10+Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))<=26&&Integer.parseInt(String.valueOf(s.charAt(s.length()-2)))!=0)
        		dp[s.length()-2]=dp[s.length()-1]+1;
        	else
        		dp[s.length()-2]=1;
        	for(int i=s.length()-3;i>=0;i--)
        	{
        		if((Integer.parseInt(String.valueOf(s.charAt(i)))*10+Integer.parseInt(String.valueOf(s.charAt(i+1)))>26&&Integer.parseInt(String.valueOf(s.charAt(i+1)))==0)||(Integer.parseInt(String.valueOf(s.charAt(i)))==0&&Integer.parseInt(String.valueOf(s.charAt(i+1)))==0))
        			return 0;
        		else if(Integer.parseInt(String.valueOf(s.charAt(i)))*10+Integer.parseInt(String.valueOf(s.charAt(i+1)))<=26&&Integer.parseInt(String.valueOf(s.charAt(i)))!=0&&Integer.parseInt(String.valueOf(s.charAt(i+1)))!=0)
            		dp[i]=dp[i+1]+dp[i+2];
            	else
            		dp[i]=dp[i+1];
        	}
    		return dp[0];        
    }
    /////////////////////////////内存优化版，dp长度为三///////////////////////
    public static int numDecodings1(String s) {
    	
 	   if(s==null||s.isEmpty())
 		   return 0;
         int[] dp=new int[3];
     	if(Integer.parseInt(String.valueOf(s.charAt(0)))==0)
     		return 0;  	                            
         
     	if(Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))!=0)
     	   dp[2]=1;
     	else
     		dp[2]=0;
         if(s.length()==1)
             return dp[2];
         if((Integer.parseInt(String.valueOf(s.charAt(s.length()-2)))*10+Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))>26&&
                 Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))==0)||(Integer.parseInt(String.valueOf(s.charAt(s.length()-2)))==0&&Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))==0))
             return 0;
     	if(Integer.parseInt(String.valueOf(s.charAt(s.length()-2)))*10+Integer.parseInt(String.valueOf(s.charAt(s.length()-1)))<=26&&Integer.parseInt(String.valueOf(s.charAt(s.length()-2)))!=0)
     		dp[1]=dp[2]+1;
     	else
     		dp[1]=1;
     	for(int i=s.length()-3;i>=0;i--)
     	{
     		if((Integer.parseInt(String.valueOf(s.charAt(i)))*10+Integer.parseInt(String.valueOf(s.charAt(i+1)))>26&&Integer.parseInt(String.valueOf(s.charAt(i+1)))==0)||(Integer.parseInt(String.valueOf(s.charAt(i)))==0&&Integer.parseInt(String.valueOf(s.charAt(i+1)))==0))
     			return 0;
     		else if(Integer.parseInt(String.valueOf(s.charAt(i)))*10+Integer.parseInt(String.valueOf(s.charAt(i+1)))<=26&&Integer.parseInt(String.valueOf(s.charAt(i)))!=0&&Integer.parseInt(String.valueOf(s.charAt(i+1)))!=0)         		
     			{
     			  dp[0]=dp[1]+dp[2];
     			  dp[2]=dp[1];
     			  dp[1]=dp[0];
     			}
         	else
         	{
         		dp[0]=dp[1];
         		dp[2]=dp[1];
         		dp[1]=dp[0];
         	}

     	}
 		return dp[0];        
 }
	public static void main(String args[]) {
		String s="20236";
		int result=numDecodings1(s);
		System.out.print(result);
	}
}