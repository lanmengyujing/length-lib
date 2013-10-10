public class Length {
    private double value;
    private Unit unit;


    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public Length add(Length length) {
        double value1 = transformUnitToMM();
        double value2 = length.transformUnitToMM();
        value1 += value2;

        return new Length(transformToInputUnit(value1, unit), unit);
    }

    public Length subtract(Length length) {
        double value1 = transformUnitToMM();
        double value2 = length.transformUnitToMM();
        value1 -= value2;

        return new Length(transformToInputUnit(value1, unit), unit);
    }

    public Boolean equals(Length length) {
        double value1 = transformUnitToMM();
        double value2 = length.transformUnitToMM();

        return value1 == value2;
    }

    double transformUnitToMM() {
        return value * unit.getRatio();
    }

    private double transformToInputUnit(double value, Unit unit) {
        return value / unit.getRatio();
    }

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
}
