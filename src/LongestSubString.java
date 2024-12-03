public class LongestSubString {

//    Given a string s, find the length of the longest substring without repeating characters.

//    Input: s = "pwwkew"
//    Output: 3
//    Explanation: The answer is "wke", with the length of 3.
//    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

    public static int lengthOfLongestSubstring(String s) {

        String substring = "";
        int longest = 0;

        if (s.isEmpty()) {
            return longest;
        }

        for (int i = 0; i < s.length(); i++) {
            CharSequence c = String.valueOf(s.charAt(i));
            if (substring.contains(c)) {
                if (substring.length() > longest) {
                    longest = substring.length();
                }
                substring = c.toString();
            } else {
                substring = substring + c;
            }
        }

        return Integer.max(longest, substring.length());

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
