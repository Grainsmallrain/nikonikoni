public class leetcode0703_1{
	 public static int search(int[] nums, int target) {
         if(nums.length==0) return -1;
	       int i=0;
	       int j=nums.length-1;
	       while(i<j)
	       {
	    	   int mid=(i+j)/2;
	    	   if(nums[mid]<nums[j])
	    		   j=mid;
	    	   else
	    		   i=mid+1;
	       }
	       if(i==0||(nums[i]<=target&&target<=nums[nums.length-1]))
	    	   j=nums.length-1;
	       else if(nums[i-1]>=target&&target>=nums[0])
	       {

	    	   j=i-1;
	    	   i=0;
	       }
	       else
	    	   return -1;
	       while(i<=j)
	       {
	    	   int mid=(i+j)/2;
	    	   if(nums[mid]<target) i=mid+1;
	    	   else if(nums[mid]>target)j=mid-1;
	    	   else return mid;
	       }
	       return -1;
	    }
	public static void main(String args[]) {
		int[] nums= {3,1};
		int result=search(nums,3);
		
	}
}