public class Length {
    private double length;
    private int unit;

    Length(double len, int ut) {
        length = len;
        unit = ut;
    }

    double getLen() {
        return length;
    }

    public void add(Length len) {
        double len1 = transformUnitToMM();
        double len2 = len.transformUnitToMM();
        len1 += len2;

        length = transformUnitToSpecify(len1, unit);
    }

    public void minus(Length len) {
        double len1 = transformUnitToMM();
        double len2 = len.transformUnitToMM();
        len1 -= len2;

        length = transformUnitToSpecify(len1, unit);
    }

    public Boolean equal(Length len2) {
        double len = transformUnitToMM();
        double len1 = len2.transformUnitToMM();
        if (len == len1) {
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
            return length*multiplier;
        } else if (unit == 3) {
            return length*multiplier*multiplier;
        }


        return length;
    }

    private double transformUnitToSpecify(double len, int u)
    {
        int multiplier = 10;
        if (u == 2) {
            return len / multiplier;

        } else if (u == 3) {
            return len / multiplier /multiplier;
        }

        return len;
    }
}
