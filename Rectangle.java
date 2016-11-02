public class Rectangle {
    private int largeur;
    private int longueur;

    public Rectangle(int larg, int lg) {
	largeur = larg;
	longueur = lg;
    }

    public Rectangle() {
	largeur = 20;
	longueur = 50;
    }

    @Override
    public String toString() {
	return "Rectangle [" + largeur + "," + longueur + "]";
    }
}
