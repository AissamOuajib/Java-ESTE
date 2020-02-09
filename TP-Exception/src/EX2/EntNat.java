package EX2;

public class EntNat {
	public static int  somme(int a,int b) throws ErrSom {
		if(a + b < 0) throw new ErrSom("Somme superieure a MAX_VALUE");
		return a + b;
	}

	public static int difference(int a,int b) throws ErrDiff {
		if(a - b < 0) throw new ErrDiff("Différence superieure a MAX_VALUE");
		return a - b;
	}
	
	public static int produit(int a,int b) throws ErrProd {
		if(a * b < 0) throw new ErrProd("Produit superieure a MAX_VALUE");
		return a * b;
	}
}
