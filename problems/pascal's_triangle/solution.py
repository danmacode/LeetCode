class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        r1, r2 = [1], [1, 1]
        if (n := numRows) == 1:
            return [r1]
        elif numRows == 2:
            return [r1, r2]

        r_n = [r1, prev_ri := r2]

        for i in range(3, n + 1):
            # current arr size i
            new_arr = i * [1]
            for j in range(len(prev_ri) - 1):
                new_arr[j + 1] = prev_ri[j] + prev_ri[j + 1]
            #print(f"n={i}, new_arr = {new_arr}")
            r_n.append(prev_ri := new_arr)
        return r_n
