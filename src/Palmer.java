public class Palmer extends Växter implements mängdVätska{
    //konstruktor
    public Palmer(String namn, double höjdMeter) {
        super(namn, höjdMeter, Vätskor.KRANVATTEN);
        enhet(höjdMeter);
        uträkning();
    }
    //Inkapsling sparar värdena för variablerna utan att dom syns i koden
    private double literPerDag = 0.5;
    private Måttenheter enhet;
    private double uträkning;

    //polymorfism denna funktion gör olika saker beroende på vilken klass som anropar den.
    @Override
    public String meddelandeMängdVätska() {
        return this.getNamn()+" behöver " + uträkning + " " + enhet.volymEnhet + " " + this.getNäringsVätska().vätska;
    }

    @Override
    public void enhet(double höjdMeter) {
        double totalVätskorLiter = this.literPerDag * höjdMeter;
        this.enhet = volymEnhet(totalVätskorLiter);
    }
    @Override
    public double uträkning(){
        double uträkning = this.literPerDag * getHöjd();
        this.uträkning = rättFormat(uträkning);
        return uträkning;
    }
}
