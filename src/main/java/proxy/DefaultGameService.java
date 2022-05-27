package proxy;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("start game!");
    }
}
