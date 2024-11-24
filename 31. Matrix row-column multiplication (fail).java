package practice;
import java.util.Arrays;
public class Main
{	
			public static void main(String[] args)
			{
				int[][] m1 = {
						{1,2},
						{3,4},
				};
				
				int[][] m2 = {
						{5,6},
						{7,8}
				};
				
				int[][] m = {
						{0,0},
						{0,0}
				};
				
				
				m[0][0] = (m1[0][0] * m2[0][0]) + (m1[0][1] * m2[1][0]);
					
				m[0][1] = (m1[0][0] * m2[0][1]) + (m1[0][1] * m2[1][1]);
				
					
				m[1][0] = (m1[1][0] * m2[0][0]) + (m1[1][1] * m2[1][0]);
					
				m[1][1] = (m1[1][0] * m2[0][1]) + (m1[1][1] * m2[1][1]);
				
				System.out.println(Arrays.deepToString(m));
				
		
				}
			}
			
			/*
			 * guide: multiply matrix 1 row by matrix 2 column
			 * for example: (1 x 5) + (2 x 7) = (5) + (14) = 19
			 *
			 * 1 = m1[0][0]
			 * 5 = m2[0][0]
			 *
			 * 2 = m1[0][1]
			 * 7 = m2[1][0]
			 *
			 * expected output is:
			 * 19 22
			 * 43 50
			 */
					


//ChatGPT solution
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input matrices
        int[][] m1 = {
                {1, 2},
                {3, 4},
        };

        int[][] m2 = {
                {5, 6},
                {7, 8}
        };

        // Resultant matrix (2x2 for this example)
        int[][] m = new int[m1.length][m2[0].length];

        // Perform matrix multiplication
        for (int i = 0; i < m1.length; i++) { // Loop through rows of m1
            for (int j = 0; j < m2[0].length; j++) { // Loop through columns of m2
                for (int k = 0; k < m1[0].length; k++) { // Loop through elements of the row and column
                    m[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        // Print the resultant matrix
        for (int[] row : m) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}


