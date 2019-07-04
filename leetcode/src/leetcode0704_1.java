public class leetcode0704_1{
    public static int reverse(int x) {
    	while(x>0&&x%10==0)
    	{
    		x=x/10;
    	}
    	int temp=x;
    	int num=0;
    	while(Math.abs(temp)>10)
    	{
    		temp=temp/10;
    		num++;
    	}
    	int sum=0;
    	while(num>=0)
    	{
    		sum+=(x%10)*Math.pow(10, num);
    		x=x/10;
    		num--;
    	}
    	return sum;
        
    }
	public static void main(String args[])
	{
		int x=-365;
		int result=reverse(x);
		System.out.print(result);
	}
}