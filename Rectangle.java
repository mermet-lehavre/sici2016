public class Rectangle {
    private int largeur;
    private int longueur;

    public Rectangle(int larg, int lg) {
	largeur = larg;
	longueur = lg;
    }

    public static void main(String... args) {
	Retangle r1 = new Rectangle(4,5);
	System.out.println(r1);
    }
}
