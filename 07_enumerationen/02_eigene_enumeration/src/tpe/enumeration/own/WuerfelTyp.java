package tpe.enumeration.own;

public enum WuerfelTyp {

    D4, D6, D8, D10, D12, D20;

    public int getSides() {
        switch(this) {
            case D4: return 4;
            case D6: return 6;
            case D8: return 8;
            case D10: return 10;
            case D12: return 12;
            case D20: return 20;
            default: throw new IllegalArgumentException("Kein gültiger Würfel!");
        }
    }

    public double average() {
        return this.getSides() / 2.0 + 0.5;
    }

}
