package top_interview_questions.easy.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    /*
    Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
    Note:
    A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    Only the filled cells need to be validated according to the mentioned rules.
    */

    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                if( num == '.'){
                    continue;
                }
                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i].contains(num) ||
                cols[j].contains(num) ||
                boxes[boxIndex].contains(num)) {
                    return false;
                }

                rows[i].add(num);
                cols[j].add(num);
                boxes[boxIndex].add(num);
            }
        }
        return true;
    }
}
