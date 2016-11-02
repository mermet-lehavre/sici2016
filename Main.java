public class Main {
    public static void main(String... args) {
	Figure[] f;
	f = new Figure[3];
	f[0] = new Rectangle(4,5);
	System.out.println(f[0]);
	f[1] = new Cercle(5);
	System.out.println(f[1]);
	f[2] = new Triangle(3,4,5);
	System.out.println(f[2]);
    }
}
