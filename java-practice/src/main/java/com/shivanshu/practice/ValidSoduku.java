package com.shivanshu.practice;

public class ValidSoduku {
    //  public static boolean isValidSudoku(char[][] board) {
//    int row = 9;
//    int col = 9;
//    Set<Character> set = new HashSet<>();
//    for (int i = 0; i < row; i++) {
//      for (int j = 0; j < col; j++) {
//        if (board[i][j] == '.') continue;
//        if (!set.add(board[i][j])) {
//          return false;
//        }
//      }
//      set.clear();
//    }
//
//    for (int i = 0; i < col; i++) {
//      for (int j = 0; j < row; j++) {
//        if (board[j][i] == '.') continue;
//        if (!set.add(board[j][i])) {
//          return false;
//        }
//      }
//      set.clear();
//    }
//    int x = 3;
//    int l = 0;
//    Set<Character> set1 = new HashSet<>();
//    Set<Character> set2 = new HashSet<>();
//    while (x <= 9) {
//        for (int i = l; i < x; i++) {
//          for (int j = 0; j < 3; j++) {
//            if (board[i][j] != '.') {
//              if (!set.add(board[i][j])) {
//                return false;
//              }
//            }
//            if (board[i][j+3] != '.') {
//              if (!set1.add(board[i][j+3])) {
//                return false;
//              }
//            }
//            if (board[i][j+6] != '.') {
//              if (!set2.add(board[i][j+6])) {
//                return false;
//              }
//            }
//          }
//        }
//      set.clear();
//      set1.clear();
//      set2.clear();
//      x += 3;
//      l += 3;
//
//    }
//
//    return true;
//  }

    public static boolean isValidSudoku(char[][] board) {
        int [] vset = new int [9];
        int [] hset = new int [9];
        int [] bckt = new int [9];
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    idx = 1 << (board[i][j] - '0') ;
                    if ((hset[i] & idx) > 0 ||
                            (vset[j] & idx) > 0 ||
                            (bckt[(i / 3) * 3 + j / 3] & idx) > 0) return false;
                    hset[i] |= idx;
                    vset[j] |= idx;
                    bckt[(i / 3) * 3 + j / 3] |= idx;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidSudoku(new char[][]{
                {'.','.','.','.','.','.','5','.','.'}
                ,{'.','.','.','.','.','.','.','.','.'}
                ,{'.','.','.','.','.','.','.','.','.'}
                ,{'9','3','.','.','2','.','4','.','.'}
                ,{'.','.','7','.','.','.','3','.','.'}
                ,{'.','.','.','.','.','.','.','.','.'}
                ,{'.','.','.','3','4','.','.','.','.'}
                ,{'.','.','.','.','.','3','.','.','.'}
                ,{'.','.','.','.','.','5','2','.','.'}}));
    }


}
