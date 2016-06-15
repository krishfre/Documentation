
public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		int mat[][]={ {1,2},
				      {3,4}};
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
