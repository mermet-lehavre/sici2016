public class Triangle implements Figure {
    private int c1;
    private int c2;
    private int c3;

    public Triangle(int monC1, int monC2, int monC3) {
	c1 = monC1;
	c2 = monC2;
	c3 = monC3;
    }

    @Override
    public String toString() {
	return "Triangle [" + c1 + "," + c2 + "," + c3 + "]";
    }
}
