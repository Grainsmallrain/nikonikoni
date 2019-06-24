import java.util.HashMap;
import java.util.Map;

public class leetcode0624_1{
	 public static int biggestLength(String s)
	 {
		 int ans=0;
		 Map<Character,Integer> str=new HashMap<>();
		 for(int i=0, j=0;j<s.length();j++)
		 {
			 if(str.containsKey(s.charAt(j)))
			 {
				 i=Math.max(str.get(s.charAt(j)),i);
			 }
			 ans=Math.max(j-i+1, ans);
			 str.put(s.charAt(j), j+1);
		 }
		 return ans;
	 }
     public static void main(String args[]) {
    	 String s="abcbcdabb";
    	 int ans=biggestLength(s);
    	 System.out.print(ans);
     }
}