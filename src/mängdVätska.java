public interface mängdVätska {
    String meddelandeMängdVätska();
    void enhet(double höjdMeter);
    double uträkning();
    default Måttenheter volymEnhet(double totalVätskorLiter){
        if (totalVätskorLiter < 0.1){
            return Måttenheter.CENTILITER;
        } else if (totalVätskorLiter < 1) {
            return Måttenheter.DECILITER;
        } else
            return Måttenheter.LITER;
    }
    default double rättFormat(double uträkning){
        if (uträkning < 0.1){
            return uträkning*100;
        } else if (uträkning < 1) {
            return uträkning*10;
        } else
            return uträkning;
    }
}
