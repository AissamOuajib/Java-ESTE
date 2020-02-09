package EX2;

public class TestEntNat {
	public static void main(String[] args) {
		try {
			System.out.println("la somme :" + EntNat.somme(10, 9));
			System.out.println(EntNat.somme(Integer.MAX_VALUE , 12));

		} catch (ErrSom e) {
			System.out.println(e.getMessage());
			try {
				System.out.println("Difference :" + EntNat.difference(9, 3));
				System.out.println(EntNat.difference(Integer.MAX_VALUE +4, 1));

			} catch (ErrDiff e1) {
				System.out.println(e1.getMessage());
				try {
					System.out.println("produit :" + EntNat.produit(5, 1));
					System.out.println(EntNat.produit(Integer.MAX_VALUE +3, 19));
				} catch (ErrProd e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
	}
}