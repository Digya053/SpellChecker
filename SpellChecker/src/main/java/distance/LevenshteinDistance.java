package distance;

import utilities.Math;

/*
 * This calculates the LevenshteinDistance between two input strings.
 */

public class LevenshteinDistance {

	public static int distance(String s, String t){

		s=s.toLowerCase();
		t= t.toLowerCase();
		int m=s.length()+1;
		int n= t.length()+1;


		int[][]lev = new int[m][n];

		for(int i=0; i<m;i++){
			for(int j=0; j<n;j++){
				if(Math.min(i,j)==0){
					lev[i][j]=Math.max(i,j);
				}

				else
				{
					int insertion=lev[i-1][j]+1;
					int deletion= lev[i][j-1]+1;
					int cost=(s.charAt(i-1)==t.charAt(j-1))?0:1;
					int substitution= lev[i-1][j-1]+cost;

					lev[i][j]=Math.min(insertion,deletion,substitution);

				}
			}
		}
/*
			for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(lev[i][j] + " ");
			}
			System.out.println("");
		}*/
		return lev[m-1][n-1];

	}
}
