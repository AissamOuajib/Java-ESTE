package EX1;

public class EntNat {
	private int n;
	
	public EntNat(int n) throws ErrConst{
		if(n < 0)  throw new ErrConst("Ce nombre ne peut pas être négatif.");
		this.n = n;
	}

	public int getN() {
		return n;
	}
}
