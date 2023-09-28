


// This Search takes O(n).
// and for space O(1).



//Array should be sorted row and columns wise.

import java.util.Arrays;

public class BinarySearch2DArray {



    public static void main(String[] args) {
        



        int[][] array = {
            { 10, 20, 30, 40 },
            { 15, 25, 35, 45 },
            { 28, 29, 37, 49 },
            { 33,34, 38, 50 } };


        int key= 37;

            System.out.println(Arrays.toString(searched(array, key)));


    }


    static int [] searched(int [][]matrix, int target )
    {

        

        int r =0;
        int  c = matrix.length-1;


        while(r< matrix.length && c >=0)


       {     if(matrix[r][c]==target)
            return new int [] {r,c};


            if(matrix[r][c] < target)
            {
               
                r++;
            }
            else{

                    c--;
            }
        }

        return new int[]{-1,-1};



    }







    
}
