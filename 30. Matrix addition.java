import java.util.Arrays;

public class Main
{	
  //I had to ask for help here, I'm trying to memorize the whole code for the for loops so it'll be a no-brainer during the exams.
			public static void main(String[] args)
			{
				int[][] m1 = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
				};
				
				int[][] m2 = {
						{9,8,7},
						{6,5,4},
						{3,2,1}
				};
				
				int[][] mSum = {
						{0,0,0},
						{0,0,0},
						{0,0,0}
				};
				
				for (int a=0; a<mSum.length; a++) {
					for (int x=0; x<mSum[a].length; x++) 
					{
						mSum[a][x] = m1[a][x] + m2[a][x];
					}
				}
				
				//print
				for (int col=0; col<mSum.length; col++) 
				{
					for (int row=0; row<mSum.length; row++) 
					{
						System.out.print(mSum[col][row] + " ");
					}
					System.out.println();
				}
					
			}
}
