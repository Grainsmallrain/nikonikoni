public class leetcode0627_2{
	public static double calculatesub(String s) {
		if(!s.contains("*")&&!s.contains("/"))
			return Integer.parseInt(s);
		int i=s.length()-1;
		while(i>0)
		{
			if(s.charAt(i)=='/')
				return calculatesub(s.substring(0,i))/Integer.parseInt(s.substring(i+1, s.length()));
			else if(s.charAt(i)=='*')
				return calculatesub(s.substring(0,i))*Integer.parseInt(s.substring(i+1, s.length()));
			i--;
		}
		return 0;
	}
    public static int calculate(String s) {
       String[] split = new String[s.length()];
        
        //拆分字符串，存到 split 数组里
        for (int i=0; i<s.length(); i++) {
            split[i] = s.substring(i, i+1);
        }
        
        String snew = "0";  //去掉空格后的字符串
    
        for (int i=0; i<s.length(); i++) {
            
            if (split[i].equals(" ")) {
                continue;
            }
            else {
            	snew=snew+split[i];    //把拆分的每一个都加上去，拼成一个没有空格的新字符串。
            }
            
        }
    	int sum=0;
    	int start=snew.length()-1,end=snew.length();
        for(int i=snew.length()-1;i>=0;i--)
        {
        	if(snew.charAt(i)=='+')
        	{
        		start=i+1;
        		sum+=calculatesub(snew.substring(start, end));
        		end=i;
        	}
        	if(snew.charAt(i)=='-')
        	{
        		start=i+1;
        		sum-=calculatesub(snew.substring(start, end));
        		end=i;
        	}
        }
        sum+=calculatesub(snew.substring(0, end));
        return sum;
    }

	public static void main(String[] args) {
		String s="";
		int result=calculate(s);
		System.out.print(result);
	}
	
}