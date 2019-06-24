public class leetcode0624_3{
	 public static int divide_false(int dividend, int divisor) {
	    	if(divisor==1)
	    		return dividend;
	    	if(divisor==-1)
	    	{
	    		if(dividend<=Integer.MIN_VALUE)
	    			return Integer.MAX_VALUE;
	    		else
	    			return -dividend;
	    	}
	        int result = 0;
	        if(dividend>0)
	        {
	        	int dividend_dif=dividend;
	            while(dividend_dif>=0)
	            {
	            	dividend_dif=dividend_dif-Math.abs(divisor);
	                result++;
	            }
	            result--;
	        }
	        else
	        {
	        	int	dividend_dif;
	        	if(dividend==Integer.MIN_VALUE)
	            {
	                dividend_dif=Integer.MAX_VALUE;
	            }
	        	else
	        	    dividend_dif=-dividend-1;
	        	while(dividend_dif>=-1)
	            {
	        		dividend_dif=dividend_dif-Math.abs(divisor);
	                result++;
	            }
	            result--;
	            result=-result;
	        }
	        if(divisor<0)
	        	result=-result;
	        return result;
	        
	    }
	public static int divideplus(int dividend_dif, int divisor_dif,int result)
	{
		int temp=1;
		if (divisor_dif<dividend_dif)
			return result;
		int divisor_diff=divisor_dif;
		while(divisor_diff>dividend_dif-divisor_diff)
		{
			divisor_diff+=divisor_diff;
			temp+=temp;
		}
		result+=temp;
		result=divideplus(dividend_dif-divisor_diff,divisor_dif,result);
		return result;
		
	}
	public static int divide(int dividend, int divisor) {
		int dividend_dif=dividend>0?(-dividend):dividend;
		int divisor_dif=divisor>0?(-divisor):divisor;
		int ans;
		if((dividend>0&&divisor>0)||(dividend<0&&divisor<0))
			ans=1;
		else
			ans=-1;
		if((dividend==Integer.MAX_VALUE||dividend==Integer.MIN_VALUE)&&Math.abs(divisor)==1)
		{
			if(ans>0)
				return Integer.MAX_VALUE;
			else
				return Integer.MIN_VALUE;
		}
		
		int result=divideplus(dividend_dif,divisor_dif,0);	
        return result*ans;
	}
	public static void main(String args[]) {
		int dividend=2147483647; int divisor=3;
		int result=divide(dividend,divisor);
		System.out.print(result);
	}
}