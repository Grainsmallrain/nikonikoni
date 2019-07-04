public class leetcode0704_2{
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length==0)
    		return "";
    	if(strs.length==1)
    		return strs[0];
    	int minLen=Integer.MAX_VALUE;
    	for(int i=0;i<strs.length;i++)
    	{
    		if(strs[i].length()<minLen)
    			minLen=strs[i].length();
    	}
    	if(minLen==0)
    		return "";
    	StringBuffer result=new StringBuffer();
    	for(int i=0;i<minLen;i++)
    	{
    		for(int j=0;j<strs.length-1;j++)
    		{
    			if(strs[j].charAt(i)!=strs[j+1].charAt(i))
    				return result.toString();
    		}
    		result.append(strs[0].charAt(i));
    			
    	}
    	return result.toString();
        
    }
	public static void main(String args[]) {
		String[] strs= {};
		String result=longestCommonPrefix(strs);
	}
}