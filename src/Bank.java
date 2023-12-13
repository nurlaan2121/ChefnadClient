public class Bank {
    private double chet;
    private Peson kto;

    public Bank() {
    }

    public Bank(double chet, Peson kto) {
        this.chet = chet;
        this.kto = kto;
    }

    public double getChet() {
        return chet;
    }

    public void setChet(double chet) {
        this.chet = chet;
    }

    public Peson getKto() {
        return kto;
    }

    public void setKto(Peson kto) {
        this.kto = kto;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "chet=" + chet +
                ", kto=" + kto +
                '}';
    }
}
