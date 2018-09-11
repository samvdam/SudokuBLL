package pkgHelper;

public class LatinSquare {
	
	private int[][] myLatinSquare;
	
	public LatinSquare(int [][] twoDimArray) {
		this.myLatinSquare = twoDimArray;
	}
	
	public boolean ContainsZero() {
		for(int iCol=0;iCol<myLatinSquare.length;iCol++) {
			for (int iRow=0;iRow<myLatinSquare.length;iRow++) {
				if (myLatinSquare[iCol][iRow]==0)
					return true;
			}
		}
		return false;
	}
}
