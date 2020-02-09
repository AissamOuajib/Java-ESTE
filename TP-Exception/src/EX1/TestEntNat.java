package EX1;

public class TestEntNat {
	public static void main(String[] args) {
		try {
			EntNat entNat1 = new EntNat(11);
			System.out.println("entNat1 : " + entNat1.getN());
			EntNat entNat2 = new EntNat(-9);
			System.out.println("entNat2 : " + entNat2.getN());

		} catch (ErrConst e) {
			System.out.println(e.getMessage());
		}
	}
}
