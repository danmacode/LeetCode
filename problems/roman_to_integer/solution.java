class Solution {
  private int rom2dec(char romanChar) {
    return switch (romanChar) {
      case 'I' -> 1;
      case 'V' -> 5;
      case 'X' -> 10;
      case 'L' -> 50;
      case 'C' -> 100;
      case 'D' -> 500;
      case 'M' -> 1000;
      default -> -1; // golang style
    };
  }

  public int romanToInt(String s) {
    int r = 0;
    for (int i = 0; i < s.length(); i++)
      // value of roman symbol s[i]
      if (i != s.length() - 1 && rom2dec(s.charAt(i)) < rom2dec(s.charAt(i + 1))) {
        r += rom2dec(s.charAt(i + 1)) - rom2dec(s.charAt(i));
        i++;
      } else r += rom2dec(s.charAt(i));
    return r;
  }
}
