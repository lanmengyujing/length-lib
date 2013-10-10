public enum Unit {
    M(1000), CM(10), MM(1);

    private int ratio;

    public int getRatio() {
        return this.ratio;
    }

    Unit(int ratio) {
        this.ratio = ratio;
    }
}
