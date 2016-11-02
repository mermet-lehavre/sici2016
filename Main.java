public class Main {
    public static void main(String... args) {
	Figure[] f;
	f = new Figure[3];
	f[0] = new Rectangle(4,5);
	f[1] = new Cercle(5);
	f[2] = new Triangle(3,4,5);
	for (Figure maFigure: f) {
	    System.out.println(maFigure);
	}
    }
}
