import java.util.Arrays;

public class leetcode0627_1{
	 public static String largestNumber(int[] nums) {
		 for(int i=0;i<nums.length-1;i++)
		 {
			 for(int j=0;j<nums.length-1-i;j++)
				 {
				    int count1=0,count2=0;
				    double num1=nums[j],num2=nums[j+1];
				    while(num1>=1)
				    {
				    	num1/=10;
				    	count1++;
				    }
				    while(num2>=1)
				    {
				    	num2/=10;
				    	count2++;
				    }
				    if(nums[j]*Math.pow(10, count2)+nums[j+1]<nums[j+1]*Math.pow(10, count1)+nums[j])
				    {
				    	int temp=nums[j];
				    	nums[j]=nums[j+1];
				    	nums[j+1]=temp;
				    }
				 }
		 }
		 StringBuffer str = new StringBuffer();
		 for (int i = 0; i <nums.length ; i++) {
		 str = str.append(nums[i]);
		 }
		 return str.toString();
	        
	    }
	
	public static void main(String args[]) {
		int[] nums= {1,31,9,42,5,8};
		String result=largestNumber(nums);
		System.out.print(result);
	}
}