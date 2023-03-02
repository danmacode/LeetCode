class Solution {
  public int lengthOfLastWord(String s) {
    int longest = 0, current = 0;
    int state = 0; // 0 = word, 1 = space
    for (int i = 0; i < s.length(); i++) {
      if (state == 0) {
        if (s.charAt(i) == ' ') {
          state = 1;
          longest = current;
          current = 0;
        }else current ++;
      } else {
        if (s.charAt(i) != ' ') {
          state = 0;
          current = 1; longest = 1;
        }
      }
    }
    if (current > longest) return current;
    return longest;
  }
}