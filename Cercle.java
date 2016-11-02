public class Cercle implements Figure {
    private int rayon;

    public Cercle(int monRayon) {
	rayon = monRayon;
    }

    public Cercle() {
	rayon = 0;
    }

    @Override
    public String toString() {
	return "Cercle [" + rayon + "]";
    }
}
