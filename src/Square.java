public class Square {
    private int bok;
    private int obw;
    private int pole;

    Square(int bok) {
        this.bok = bok;
        this.obw = bok*4;
        this.pole = bok*bok;
    }

    Square() {
    }

    public int getBok() {
        return bok;
    }

    public int getObw() {
        return obw;
    }

    public int getPole() {
        return pole;
    }

    public void setBok(int bok) {
        this.bok = bok;
        this.obw = 4*bok;
        this.pole = bok*bok;
    }
}
