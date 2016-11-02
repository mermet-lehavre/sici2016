public class Triangle implements Figure {
    private int[] cotes = new int[3];

    public Triangle(int monC1, int monC2, int monC3) {
	cotes[0] = monC1;
	cotes[1] = monC2;
	cotes[2] = monC3;
    }

    @Override
    public String toString() {
	return "Triangle [" + cotes[0] + "," + cotes[1] + "," + cotes[2] + "]";
    }
}
