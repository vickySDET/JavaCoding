package javaCoding;

import java.util.HashMap;

public class OccurencesofCharacter {

	public static void main(String[] args) {
		   String str="automation";
	       
	       HashMap<Character,Integer> map =new HashMap<>();
	       for(char  ch : str.toCharArray()){
	           if(map.containsKey(ch)){
	               map.put(ch,map.get(ch)+1);
	           }else{
	               map.put(ch,1);
	           }
	       }
	       System.out.println("Character Occurrences:");
	       for(char ch : map.keySet()){
	           System.out.println(ch + " : " + map.get(ch));
	       }
	       
	       
	       
	      // Approach 2
	      /* String str1 = "automation";
	        char[] arr = str1.toCharArray();

	        for (int i = 0; i < arr.length; i++) {

	            int count = 1;

	            for (int j = i + 1; j < arr.length; j++) {

	                if (arr[i] == arr[j]) {
	                    count++;
	                    arr[j] = '0';   // Mark duplicate character
	                }
	            }

	            if (arr[i] != '0') {
	                System.out.println(arr[i] + " : " + count);
	            }
	        }
	        */
	      
	}

}
