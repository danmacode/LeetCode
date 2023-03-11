class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    if (strs.length == 1) return strs[0];
    Arrays.sort(strs);
    final String first = strs[0],
      last = strs[strs.length - 1];
    int i = 0;
    while(i < first.length()){
      if (first.charAt(i) == last.charAt(i)) i++;
      else break;
    }
    return i == 0 ? "" : first.substring(0, i);
  }
}
