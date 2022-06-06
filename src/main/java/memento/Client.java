package memento;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(10);

        GameSave gameSave = game.save();

        game.setBlueTeamScore(20);
        game.setRedTeamScore(21);

        game.restore(gameSave);

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
