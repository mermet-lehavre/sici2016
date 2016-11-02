public class Triangle implements Figure {
    private int[] cotes = new int[3];

    public Triangle(int a1, int a2, int a3) {
	cotes[0] = a1;
	cotes[1] = a2;
	cotes[2] = a3;
    }

    @Override
    public String toString() {
	return "Triangle [" + cotes[0] + "," + cotes[1] + "," + cotes[2] + "]";
    }
}
