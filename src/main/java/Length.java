public class Length {
    private double value;
    private int unit;

    Length(double value, int unit) {
        this.value = value;
        this.unit = unit;
    }

    double getValue() {
        return value;
    }

    public void add(Length length) {
        double value1 = transformUnitToMM();
        double value2 = length.transformUnitToMM();
        value1 += value2;

        this.value = transformUnit(value1, unit);
    }

    public void subtract(Length length) {
        double value1 = transformUnitToMM();
        double value2 = length.transformUnitToMM();
        value1 -= value2;

        value = transformUnit(value1, unit);
    }

    public Boolean equal(Length length) {
        double value1 = transformUnitToMM();
        double value2 = length.transformUnitToMM();
        if (value1 == value2) {
            return true;
        } else {
            return false;
        }
    }

    public int getUnit() {
        return unit;
    }

    double transformUnitToMM() {
        int multiplier = 10;
        if (unit == 2) {
            return value *multiplier;
        } else if (unit == 3) {
            return value *multiplier*multiplier;
        }
        return value;
    }

    private double transformUnit(double value, int unit)
    {
        int multiplier = 10;
        if (unit == 2) {
            return value / multiplier;

        } else if (unit == 3) {
            return value / multiplier /multiplier;
        }

        return value;
    }
}
