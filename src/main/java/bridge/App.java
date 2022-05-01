package bridge;

public class App {

    public static void main(String[] args) {
        Champion kdaAri = new Ari(new KDA());
        kdaAri.skillQ();
        kdaAri.skillW();

        Champion poolPartyAri = new Ari(new PoolParty());
        poolPartyAri.skillR();
        poolPartyAri.skillW();
    }
}
