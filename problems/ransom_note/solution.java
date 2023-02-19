import java.lang.String;
import java.util.HashMap;

class Solution {
  // this method should be static...
  public static boolean canConstruct(String ransomNote, String magazine) {
    
    // max input length = (int) Math.pow(10, 5);
    final int n = ransomNote.length(), m = magazine.length();
    // if more words in ransomNote, it's impossible
    if (n > m) return false;
    
    // reserve space for the HashMap O(26) space (letters in alphabet)
    HashMap<Character, Integer> remLetters = new HashMap<>(26);
    
    // O(n) subtract letters from the ransomNote & add from magazine
    for (int i = 0; i < n; i++)
      // if letters don't cancel each other
      if (ransomNote.charAt(i) != magazine.charAt(i)) {
        final int actualVal1 = -1 + remLetters.getOrDefault(ransomNote.charAt(i), 0);
        if (actualVal1 != 0) remLetters.put(ransomNote.charAt(i), actualVal1);
        else remLetters.remove(ransomNote.charAt(i));
        
        final int actualVal2 = 1 + remLetters.getOrDefault(magazine.charAt(i), 0);
        if (actualVal2 != 0) remLetters.put(magazine.charAt(i), actualVal2);
        else remLetters.remove(magazine.charAt(i));
      }
    
    // removal phase O(26);
    remLetters.values().removeIf(v -> v >= 0);
    if (remLetters.isEmpty()) return true;
    
    
    // O(m-n) add letters if they're present & are needed to complete ransom
    for (int j = n; j < m; j++) {
      final char key = magazine.charAt(j);
      if (remLetters.containsKey(key)) {
        final int val = remLetters.get(key) + 1;
        if (val >= 0) {
          remLetters.remove(key);
          if (remLetters.isEmpty()) break;
        } else remLetters.put(key, val);
      }
    }
    
    System.out.println(remLetters);
    return remLetters.isEmpty();
  }
}