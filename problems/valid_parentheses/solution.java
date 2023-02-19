import java.util.Map;
import java.util.Stack;

class Solution {
  public static boolean isValid(String s) {
    Map<Character, Character> pMap =
        Map.of(
            '}', '{',
            ']', '[',
            ')', '(');
    final Stack<Character> pStack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      final char c = s.charAt(i);
      if (pMap.containsKey(c)) // closing bracket (key in pMap) - search opposite|return false
      if (!pStack.isEmpty() && pStack.peek() == pMap.get(c)) pStack.pop();
        else return false;
      else pStack.push(c); // opening bracket - put in LIFO
    }
    return pStack.isEmpty();
  }
}