public class Kaktusar extends Växter implements mängdVätska{
    public Kaktusar(String namn, double höjdMeter, Vätskor vätska) {
        super(namn, höjdMeter, vätska);
        enhet(höjdMeter);
    }
    //Inkapsling sparar värdena för variablerna utan att dom syns i koden

    private double literPerDag = 0.02;
    private double mängdVätska;
    private Måttenheter enhet;

    //polymorfism denna funktion gör olika saker beroende på vilken klass som anropar den.
    @Override
    public String meddelandeMängdVätska() {
        return this.getNamn()+" behöver " + this.mängdVätska + " " + enhet.volymEnhet + " " + this.getNäringsVätska().vätska;
    }
    @Override
    public void enhet(double höjdMeter) {
        Måttenheter enhet = volymEnhet(this.literPerDag);
        setMängdVätska(this.literPerDag);
        this.enhet = enhet;
    }

    @Override
    public double uträkning() {
        return this.literPerDag;
    }

    public void setMängdVätska(double literPerDag) {
        this.mängdVätska = rättFormat(literPerDag);
    }
}
