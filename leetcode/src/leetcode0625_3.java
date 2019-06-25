import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode0625_3{
	  
	public static List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();
	Arrays.sort(nums);
	for(int i=0;i<nums.length-2;i++)
	{
		int l=i+1,r=nums.length-1;
		if(nums[i]>0||nums[r]<0) break;
        if(i>0&&nums[i]==nums[i-1]) continue;
		while(l<r)
		{
			if(nums[l]<-nums[i]-nums[r])
			{
				l++;
				while(l<r&&nums[l]==nums[l-1])
				l++;
			}
		
			else if(nums[l]>-nums[i]-nums[r])
			{
				r--;
				while(l<r&&nums[r]==nums[r+1])
    			r--;
			}
			else
			{
				result.add(Arrays.asList(nums[i],nums[l],nums[r]));
				l++;
				r--;
				while(l<r&&nums[l]==nums[l-1])
				l++;
				while(l<r&&nums[r]==nums[r+1])
    			r--;
			}
		}
	}
	return result;  
}
        
	public static void main(String args[])
	{
		int[] nums= {-3,-6,-2,-4,4,7,1,2,3,2,-2};
		List<List<Integer>> result=threeSum(nums);
	}
}