public class HexagoneRegulier implements Figure {
    private int cote;

    public HexagoneRegulier(int monCote) {
	cote = monCote;
    }

    @Override
    public String toString() {
	return "Hexagone Régulier [" + cote + "]";
    }
}
