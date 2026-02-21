package javaCoding;

import java.util.HashSet;

public class LongestsubstringwithoutRepeatingchar {

	public static void main(String[] args) {
		
		String str="abcabsddaef";
		
		System.out.println("Input string :"+str);
		
		int left=0,right=0,maxlength=0,best=0;
		
		HashSet<Character> set = new HashSet<>();
		
		while(right<str.length()) {
			
			char currentcahr=str.charAt(right);
			
			while(set.contains(currentcahr)) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(currentcahr);
			
			if((right-left+1)>maxlength) {
				maxlength=right-left+1;
				best=left;
				
			}
			right++;
		}
		
		 String longestsubstring=str.substring(best,best+maxlength);
		
		 System.out.println("Longest substring length : " + maxlength);
	     System.out.println("Longest substring        : " + longestsubstring);
	     
	     System.out.println("Characters inside substring:");
	        for (char c : longestsubstring.toCharArray()) {
	            System.out.print(c + " ");

	}

	}
}
	
