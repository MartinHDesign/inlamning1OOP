public class KöttätandeVäxter extends Växter implements mängdVätska{
    public KöttätandeVäxter(String namn, double höjdMeter) {
        super(namn, höjdMeter, Vätskor.PROTEINDRYCK);
        enhet(höjdMeter);
        uträkning();
    }
    //Inkapsling sparar värdena för variablerna utan att dom syns i koden
    private double literPerDag = 0.2;
    private double basnivå = 0.1;
    private Måttenheter enhet;
    private double uträkning;


    @Override
    //polymorfism denna funktion gör olika saker beroende på vilken klass som anropar den.
    public String meddelandeMängdVätska() {
        return this.getNamn()+" behöver " + uträkning + " " + this.enhet.volymEnhet + " " + this.getNäringsVätska().vätska;
    }
    @Override
    public void enhet(double höjdMeter) {
        double totalVätskorLiter = this.basnivå + (literPerDag*höjdMeter);
        this.enhet = volymEnhet(totalVätskorLiter);
    }


    @Override
    public double uträkning(){
        double uträkning = this.basnivå + (literPerDag*getHöjd());
        this.uträkning = rättFormat(uträkning);
        return uträkning;
    }
}
