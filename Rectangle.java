public class Rectangle implements Figure {
    private int largeur;
    private int longueur;

    public Rectangle(int larg, int lg) {
	largeur = larg;
	longueur = lg;
    }

    @Override
    public String toString() {
	return "Rectangle [" + largeur + "," + longueur + "]";
    }
}
