import java.util.Arrays;

public class leetcode0626_3{
	 public static void wiggleSort(int[] nums) {
	        Arrays.sort(nums);
	        int[] nums_new=Arrays.copyOf(nums, nums.length);
	        for(int i=0;i<=nums.length/2;i++)
	        {
	            if(i*2==nums.length)
	                break;
	        	nums[2*i]=nums_new[(nums_new.length-1)/2-i];
	            if(i*2==nums.length-1)
	                break;
	        	nums[2*i+1]=nums_new[nums_new.length-i-1];
	        }
	    }
	public static void main(String args[]) {
		int[] nums = {1,1,2,1,2,2,1};
		wiggleSort(nums);
	}
}