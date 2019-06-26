public class leetcode0626_1{
	 public static int biggestLength(String s,int left,int right)
	 {
		 while(left>0&&right<s.length()-1&&s.charAt(left-1)==s.charAt(right+1))
		 {
			 left--;
			 right++;
		 }
		 return right-left+1;
	 }
	 public static String longestPalindrome(String s) {
		    if(s==null||s.isEmpty())
			  return null;
		    int start=0;int end=0;
		    for(int i=0;i<s.length()-1;i++)
		    {
		    	int len1=biggestLength(s,i,i);
		    	int len2=0;
		    	if(s.charAt(i)==s.charAt(i+1))
		    		len2=biggestLength(s,i,i+1);
		    	int maxlen=Math.max(len1, len2);
		    	if(maxlen>end-start+1)
		    	{
		    		end=i+maxlen/2;
		    		start=i-(maxlen-1)/2;
		    	}
		
		    }
	        return s.substring(start, end+1);
	    }
	public static void main(String args[]) {
		String s="dabbac";
		String result=longestPalindrome(s);
		System.out.print(result);
	}
}