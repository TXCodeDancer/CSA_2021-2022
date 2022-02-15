
/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 2/14/2022
 */

public class Gradebook
{
    public static void main(String[] args)
    {
        int[][] gradeBook =
                {{90, 87, 86, 56, 96},
                {65, 76, 87, 84, 93},
                {85, 56, 91, 90, 65},
                {65, 56, 78, 31, 65},
                {85, 56, 71, 80, 39}};

        rowTraversal(gradeBook);
        rowMajorTraversal(gradeBook);
        columnMajorTraversal1(gradeBook);
        columnMajorTraversal2(gradeBook);
    }

    private static void rowTraversal(int[][] gradeBook)
    {
        System.out.println();
        System.out.println("rowTraversal()");
        //Iterate through each row in the gradebook
        for(int row = 0; row < gradeBook.length; row++)
        {
            System.out.print("Week "+ (row +1)+ " Scores: ");
            //Iterate through each score in a row
            for(int grade: gradeBook[row])
            {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
    }

    private static void rowMajorTraversal(int[][] gradeBook)
    {
        System.out.println();
        System.out.println("rowMajorTraversal()");
        //Iterate through each row in the gradebook
        for(int row = 0; row < gradeBook.length; row++)
        {
            System.out.print("Week "+ (row +1)+ " Scores: ");
            //Iterate through each score in a row
            for(int col = 0; col < gradeBook[row].length; col++)
            {
                int grade = gradeBook[row][col];
                System.out.print(grade + " ");
            }

            System.out.println();
        }
    }

    private static void columnMajorTraversal1(int[][] gradeBook)
    {
        System.out.println();
        System.out.println("columnMajorTraversal1()");
        //Iterate through each column in the gradebook
        for(int row = 0; row < gradeBook.length; row++)
        {
            System.out.print("Student "+ (row +1)+ " Scores: ");
            //Iterate through each score in a column
            for(int col = 0; col < gradeBook[row].length; col++)
            {
                int grade = gradeBook[col][row];
                System.out.print(grade + " ");
            }

            System.out.println();
        }
    }

    private static void columnMajorTraversal2(int[][] gradeBook)
    {
        System.out.println();
        System.out.println("columnMajorTraversal2()");
        //Iterate through each column in the gradebook
        for(int col = 0; col < gradeBook[0].length; col++)
        {
            System.out.print("Student "+ (col +1)+ " Scores: ");
            //Iterate through each score in a column
            for(int row = 0; row < gradeBook.length; row++)
            {
                int grade = gradeBook[row][col];
                System.out.print(grade + " ");
            }

            System.out.println();
        }
    }
}
