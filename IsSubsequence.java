
public class IsSubsequence {
	/*
	 * Given two strings s and t, return true if s is a subsequence of t, or false
	 * otherwise.
	 * 
	 * A subsequence of a string is a new string that is formed from the original
	 * string by deleting some (can be none) of the characters without disturbing
	 * the relative positions of the remaining characters. (i.e., "ace" is a
	 * subsequence of "abcde" while "aec" is not).
	 * Example 1:
	 * 
	 * Input: s = "abc", t = "ahbgdc" Output: true
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: s = "axc", t = "ahbgdc" Output: false
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		String firstSequence = input1.nextLine();
		String secSequence = input1.nextLine();
		boolean result = isSubsequence(firstSequence, secSequence); 
		if(result) { 
			System.out.println("First sequence is a subsequence of the second sequence."); 
	    } else { 
	        System.out.println("First sequence is NOT a subsequence of the second sequence."); 
	    }
		input1.close(); 
	} 
	
	public static boolean isSubsequence(String s, String t) {
		int i = 0, j = 0;
		   while(i < s.length() && j < t.length()){
		   	if(s.charAt(i) == t.charAt(j)) i++;
		       j++;
		   }
		   return i == s.length();
		}
	}
	/*
	 * i is the length of first sequence that is being compared.
	 * as long as the condition in if statement satisfies, i++.
	 * so if s and t are not in the same length, this algorithm can significantly pass the extra letters
	 */
	
	
}
