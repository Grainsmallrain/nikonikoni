public class leetcode0624_2{
	public static int myAtoi(String str) {
	    String str_new=str.trim();
	    if(str_new==null||str_new.isEmpty())
	    	return 0;
        if(str_new.charAt(0)!='+'&&str_new.charAt(0)!='-'&&!(str_new.charAt(0)>='0'&&str_new.charAt(0)<='9'))
        	return 0;
        String result=String.valueOf(str_new.charAt(0));
        for(int i=1;i<str_new.length();i++)
        {
        	if((str_new.charAt(i)>='0'&&str_new.charAt(i)<='9'))
        		{
        		   result=str_new.substring(0, i+1);
        		}
         else
             break;
        }
     if(result==null||result.equals("+")||result.equals("-"))
     	return 0;
    int result_int=0;
     try
     {
     	result_int=Integer.parseInt(result);
     }
     catch(Exception e) {
     	if(result.contains("-"))
     		return -2147483648;
     	return 2147483647;
     }
        
        return result_int;
    }
	public static void main(String args[]) {
		String str="  -0012a42";
		int result_int=myAtoi(str);
		System.out.println(result_int);
		}
}