import java.util.HashSet;

/**
  * TransposeMatrix
  */
 public class TransposeMatrix {
 
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6}};
        int rows=matrix.length;
        int columns=matrix[0].length;
        int transpose[][]= new int[columns][rows];
        // HashSet <Integer> 
        //  for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         int temp=matrix[i][j];
        //      System.out.print(temp+",");
        //     }      System.out.println();  }   
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j <rows; j++) {
                int temp=matrix[j][i];;
                transpose[i][j]=temp;
              
            }        }
System.out.println();
           for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                int temp=transpose[i][j];
             System.out.print(temp+",");
            }      System.out.println();  }   
    }
 }