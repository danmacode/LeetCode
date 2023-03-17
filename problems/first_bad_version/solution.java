/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
   
  public int firstBadVersion(int n) {
    if (n == 1) return 1;
    int lo = 1, hi = n;

    while(lo < hi){
      int mid = lo + (hi - lo) / 2;
      // if we find a positive, restrict high end
      // else, restrict low end to next sample
      if (isBadVersion(mid)) {
        hi = mid;
      } else {
        lo = mid + 1;
      }

    }
    // return lowest positive
    return lo;
  }
}