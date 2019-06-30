public class leetcode0630_2{
	public boolean increasingTriplet(int[] nums) {
		int big=Integer.MAX_VALUE,small=Integer.MAX_VALUE;
		int temp=0;
		while(temp<nums.length)
		{
			if(nums[temp]<small)
				small=nums[temp];
			else if(nums[temp]>small&&nums[temp]<big)
				big=nums[temp];
			else if(nums[temp]>big)
				return true;
			temp++;
		}
		return false;
    
}
	public static void main(String args[]) {
		
	}
}