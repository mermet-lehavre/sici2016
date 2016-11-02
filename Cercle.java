public class Cercle implements Figure {
    private int rayon;

    public Cercle(int monRayon) {
	rayon = monRayon;
    }

    @Override
    public String toString() {
	return "Cercle [" + rayon + "]";
    }
}
