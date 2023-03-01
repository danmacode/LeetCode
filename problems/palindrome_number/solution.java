class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) return false;
    final String s = Integer.toString(x);
    for (int i = 0; i < s.length() / 2; i++)
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
    
    return true;      
  }
}