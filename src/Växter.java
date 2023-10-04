public abstract class Växter {
    public Växter(String namn, double höjdMeter, Vätskor näringsVätska) {
        this.namn = namn;
        this.höjd = höjdMeter;
        this.näringsVätska = näringsVätska;
    }

    //Inkapsling sparar värdena för variablerna utan att dom syns i koden
    private String namn;
    private double höjd;
    private Vätskor näringsVätska;

    public double getHöjd() {
        return höjd;
    }

    public Vätskor getNäringsVätska() {
        return näringsVätska;
    }

    public String getNamn() {
        return namn;
    }
}
