import java.util.ArrayList;

public class Matrix {

    static int sumOfNumbersDivisibleByFive(int[][] matrix){
        int dboszt=0;

        for(int i=0;i< matrix.length;i++)
        {
            for (int j=0;j< matrix.length;j++)
            {
                if (matrix[i][j]%5==0){
                    dboszt++;
                }

            }

        }


        return dboszt;
    }
    static int indexOfRowsWithZeros(int[][] matrix){
        int nullindex=0;

        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j< matrix.length;j++)
            {
                if (i>=j){
                    for(int k=0;k< matrix.length;k++)
                    {
                        if (matrix[i][j]==0){
                            nullindex=i;
                        }
                    }
                }
            }
        }
        return nullindex;
    }
}
