public class Lingkaran {
    private double jariJari;
    public static final double PHI = 3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return PHI * jariJari * jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }
}