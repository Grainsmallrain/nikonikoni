public class leetcode0628_1{
	 public static double myPow1(double x, int n) {

		 if(n==0)
			 return 1;
		
		 int num=1;
		 double result=x;
		 while(num<n/2)
		 {
			 result*=result;
			 num=num*2;
		 }
		return result*myPow1(x,n-num);
	    }
	 public static double myPow(double x, int n) {
		 double result=myPow1(x,Math.abs(n));
		 if(n>0)
			 return result;
		 else
			 return 1/result;
	        
	    }
	public static void main(String args[]) {
		double x=2;
		int n=3;
		double result=myPow(x,n);
		System.out.print(result);
	}
}