package Java_homework_5;

public class task_4 {
    public static void main(String[] args) {
        int[] board = new int[8];
        String[] s = {"A", "B", "C", "D", "E", "F", "G", "H"};
        if(solve(board, 0))
        {
            for (int i = 0; i < board.length; i++)
            {
                System.out.print(s[i] + (board[i] + 1) + " ");
            }
        }
    }


    static boolean chek(int[] board, int row, int col)
    {
        for (int i = 0; i < row; i++)
        {
            if (board[i] == col || board[i] == col + row || board[i] == col - row)
            {
                return false;
            }
        }
        return true;
    }


    static boolean solve(int[] board, int row)
    {
        if (row == board.length)
        {
            return true;
        }
        for (int col = 0; col < board.length; col++)
        {
            if (chek(board, row, col))
            {
                board[row] = col;
                if (solve(board, row + 1))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
