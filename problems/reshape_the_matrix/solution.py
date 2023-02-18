class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        # num of elements = row * col = m * n
        n_el = (m := len(mat)) * (n := len(mat[0]))
        if n_el != r * c:
            return mat

        col_cnt = row_cnt = 0 # counters
        res: List[List[int]] = r * [ c * [0] ]
        res_row = c * [0]
        for i in range(m):
            for j in range(n):
                res_row[col_cnt] = mat[i][j]
                col_cnt += 1  # next element
                if col_cnt == c:
                    res[row_cnt] = res_row
                    res_row = c * [0]
                    col_cnt = 0
                    row_cnt += 1
        return res
