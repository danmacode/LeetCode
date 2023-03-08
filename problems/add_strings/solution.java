class Solution {
  
  public String addStrings(String num1, String num2) {
    final int n = num1.length(), m = num2.length(), maxLen = (int) Math.pow(10, 4);
    int i = n - 1, j = m - 1;
        
    StringBuilder res = new StringBuilder();
    
    int curr = 0; // carry of each sum
    
    while (i >= 0 || j >= 0) {
      final int iCurr = (i >= 0) ? num1.charAt(i--) - '0' : 0,
          jCurr = (j >= 0) ? num2.charAt(j--) - '0' : 0;
      
      curr += iCurr + jCurr;
      
      res.append(curr % 10);
      
      curr /= 10;
      
    }

    if (curr != 0) res.append(curr);
    
    
    
    return res.reverse().toString();
  }
}
