public class TicTacToe
{
    //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
    private int turn;
    private String[][] board = new String[3][3];

    public TicTacToe()
    {
        turn = 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
                board[i][j] = "-";
        }
    }

    public String[][] getBoard()
    {
        return board;
    }

    //this method returns the current turn
    public int getTurn()
    {
        return turn;
    }

    /*This method prints out the board array on to the console
     */
    public void printBoard()
    {
        System.out.println("  " + "0 " + "1 " + "2");
        printRow(0);
        printRow(1);
        printRow(2);
    }

    private void printRow(int row)
    {
        System.out.print(row + " ");
        System.out.println(board[row][0] + " " + board[row][1] + " " + board[row][2]);
    }

    //This method returns true if space row, col is a valid space
    public boolean pickLocation(int row, int col)
    {
        if(row < 0 || row > 2)
            return false;

        if(col < 0 || col > 2)
            return false;

        if(!board[row][col].equals("-"))
            return false;

        return  true;
    }

    //This method places an X or O at location row,col based on the int turn
    public void takeTurn(int row, int col)
    {
        if(!pickLocation(row, col))
            return;

        if(turn == 0)
        {
            board[row][col] = "X";
            turn = 1;
        }
        else
        {
            board[row][col] = "O";
            turn = 0;
        }
    }

    //This method returns a boolean that returns true if a row has three X or O's in a row
    public boolean checkRow()
    {
        for(String[] row : board)
        {
            boolean AllX = true;
            boolean AllO = true;
            for(String square : row)
            {
                if(!square.equals("X"))
                    AllX = false;

                if(!square.equals(")"))
                    AllO = false;
            }
            if(AllX || AllO)
                return true;
        }

        return false;
    }

    //This method returns a boolean that returns true if a col has three X or O's
    public boolean checkCol()
    {
        for(int col = 0; col < 3; col++)
        {
            boolean AllX = true;
            boolean AllO = true;
            for(int row = 0; row < 3; row++)
            {
                if(!board[row][col].equals("X"))
                    AllX = false;
                if(!board[row][col].equals("O"))
                    AllO = false;
            }
            if(AllX || AllO)
                return true;
        }

        return false;
    }

    //This method returns a boolean that returns true if either diagonal has three X or O's
    public boolean checkDiag()
    {
        int row = 0;
        boolean AllX = true;
        boolean AllO = true;
        for(int col = 0; col < 3; col++, row++)
        {
            if(!board[row][col].equals("X"))
                AllX = false;
            if(!board[row][col].equals("O"))
                AllO = false;
        }
        if(AllX || AllO)
            return true;

        row = 2;
        AllX = true;
        AllO = true;
        for(int col = 2; col >= 0; col--, row--)
        {
            if(!board[row][col].equals("X"))
                AllX = false;
            if(!board[row][col].equals("O"))
                AllO = false;
        }
        if(AllX || AllO)
            return true;

        return false;
    }

    //This method returns a boolean that checks if someone has won the game
    public boolean checkWin()
    {
        return checkRow() || checkCol() || checkDiag();
    }

}