class Solution {
    public boolean isValidSudoku(char[][] board) {
        // rows and columns together
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char r = board[i][j];          // row i
                char c = board[j][i];          // column i
                if (r != '.') {
                    if (row.contains(r)) return false;
                    row.add(r);
                }
                if (c != '.') {
                    if (col.contains(c)) return false;
                    col.add(c);
                }
            }
        }

        // the 9 boxes
        for (int box = 0; box < 9; box++) {
            Set<Character> seen = new HashSet<>();
            int startRow = (box / 3) * 3;      // 0,0,0,3,3,3,6,6,6
            int startCol = (box % 3) * 3;      // 0,3,6,0,3,6,0,3,6
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 3; b++) {
                    char v = board[startRow + a][startCol + b];
                    if (v == '.') continue;
                    if (seen.contains(v)) return false;
                    seen.add(v);
                }
            }
        }
        return true;
    }
}
