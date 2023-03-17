/** 
 * Forward declaration of isBadVersion API.
 * @param   version   your guess about first bad version
 * @return 	 	      true if current version is bad 
 *			          false if current version is good
 * func isBadVersion(version int) bool;
 */

func firstBadVersion(n int) int {
    if ( n == 1){
        return n
    }

    var lo, hi = 1, n

    for lo < hi {
        var mid = lo + (hi - lo) / 2
        // if we find a positive, restrict high end
        // else, restrict low end to next sample
        if (isBadVersion(mid)) {
            hi = mid;
        } else {
            lo = mid + 1;
        }
    }
    // return lowest positive
    return lo
}