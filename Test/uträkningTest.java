import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class uträkningTest {
    Kaktusar Igge = new Kaktusar("Igge", 0.2, Vätskor.MINERALVATTEN);
    Palmer Laura = new Palmer("Laura", 5, Vätskor.KRANVATTEN);
    KöttätandeVäxter Meatloaf = new KöttätandeVäxter("Meatloaf", 0.7, Vätskor.PROTEINDRYCK);
    Palmer Olof = new Palmer("Olof", 1, Vätskor.KRANVATTEN);

    @Test
    void uträkning() {
        double expectedLiterIgge = 0.02;
        double actualLiterIgge = Igge.uträkning();
        Assertions.assertEquals(expectedLiterIgge,actualLiterIgge);

        double expectedLiterLaura = 2.5;
        double actualLiterLaura = Laura.uträkning();
        Assertions.assertEquals(expectedLiterLaura,actualLiterLaura);

        double expectedLiterMeatloaf = 0.24;
        double actualLiterMeatloaf = Meatloaf.uträkning();
        Assertions.assertEquals(expectedLiterMeatloaf,actualLiterMeatloaf);

        double expectedLiterOlof = 0.5;
        double actualLiterOlof = Olof.uträkning();
        Assertions.assertEquals(expectedLiterOlof,actualLiterOlof);
    }
}