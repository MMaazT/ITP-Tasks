/*Muhammed Maaz Tariq
 * ERP ID:12407
 * Note: I have hard-coded a valid Sudoku as an input. Ypu can change the values to check whether the program detects 
 * an invalid input.
 * The program gives an assertion error if numbers in the Sudoku are not in the range 1-9.
 * It displays 'true' or 'false' if a number in any row or column, or a 3x3 box, gets repeated.
  */

public class isValidSudoku {
  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3, 4, 5, 6, 7, 8, 9},  
      {4 ,5 ,6 ,7 ,8, 9 ,1 ,2 ,3},  
      {7, 8, 9 ,1, 2, 3, 4, 5, 6},
      {2, 3, 4, 5, 6, 7, 8, 9, 1},
      {5, 6,7, 8, 9, 1, 2, 3, 4,},
      {8, 9,1, 2, 3, 4, 5, 6, 7,},
      {3, 4, 5, 6, 7, 8, 9, 1, 2},
      {6,7, 8, 9, 1, 2, 3, 4, 5,},
      {9, 1, 2, 3, 4, 5, 6, 7, 8},
};
    boolean flag= true;
    for (int i=0; i<9;i++) {
      for (int j=0; j<9;j++) {
        if (matrix[i][j]<=0 || matrix[i][j]>=10) {
          
          flag=false;
          assert flag=false: "The input Sudoku either contains a number not which is not in the range 1-9. Try again.";
        }                                                
      }
    } 
     System.out.println(" 'true' indicates a valid Sudoku. 'false' indicates an invalid Sudoku. The input Sudoku is: ");
                      
    System.out.println(isValid(matrix));
  }
    
  public static boolean isValid(int[][] a) {
      boolean RowCheck = true;
      boolean ColumnCheck = true;
      boolean BoxCheck = true;
     
      for (int i = 0; i < 9; i++) 
       if (!FreqChecker(a,i,i+1,0,9)) RowCheck = false;
      
           
      for (int i = 0; i < 9; i++) 
        if (!FreqChecker(a,0,9,i,i+1)) ColumnCheck = false;
      
      for (int i = 0; i < 9;i += 3) { 
        for (int j = 0; j < 9; j += 3)
           if  (!FreqChecker(a,i,i+3,j,j+3)) BoxCheck = false;   
           }
      
      if (!RowCheck || !ColumnCheck || !BoxCheck) return false;
      else                                                 return true;
    }
    
    public static boolean FreqChecker(int[][] a,int FirstRow,int FinalRow, int FirstColumn, int FinalColumn) {
      int one = 0,two=0,three=0,four = 0,five = 0,six = 0,seven = 0,eight = 0, nine = 0;
      
      boolean NumCountCheck = true;
      
      for (int i = FirstRow; i < FinalRow;i++) {
        for (int j = FirstColumn; j < FinalColumn; j++) {
          switch (a[i][j]) {
             case 1: one++;
                    if (one > 1) NumCountCheck = false;
                    break;
             case 2: two++;
                    if (two > 1) NumCountCheck = false;
                    break;
             case 3: three++;
                    if (three > 1) NumCountCheck = false;
                    break;
             case 4: four++;
                    if (four > 1) NumCountCheck = false;
                    break;
             case 5: five++;
                    if (five > 1) NumCountCheck = false;
                    break;
             case 6: six++;
                    if (six > 1) NumCountCheck = false;
                    break;
             case 7: seven++;
                    if (seven > 1) NumCountCheck = false;
                    break;
             case 8: eight++;
                    if (eight > 1) NumCountCheck = false;
                    break;
             case 9: nine++;
                    if (nine > 1) NumCountCheck = false;
                    break;
          }
          
        }
      }
    return NumCountCheck;
    }
}