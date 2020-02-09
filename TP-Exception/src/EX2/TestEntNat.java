package EX2;

public class TestEntNat {
	public static void main(String[] args) {
		try {
			System.out.println("la somme :" + EntNat.somme(1, 89));
			System.out.println(EntNat.somme(Integer.MAX_VALUE , 20));

		} catch (ErrSom e) {
			System.out.println(e.getMessage());
			try {
				System.out.println("Difference :" + EntNat.difference(19, 11));
				System.out.println(EntNat.difference(Integer.MAX_VALUE +2, 1));

			} catch (ErrDiff e1) {
				System.out.println(e1.getMessage());
				try {
					System.out.println("produit :" + EntNat.produit(40, 10));
					System.out.println(EntNat.produit(Integer.MAX_VALUE +1, 9));
				} catch (ErrProd e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
	}
}