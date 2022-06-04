package iterator;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("post 1 content");
        board.addPost("post 2 content");
        board.addPost("post 3 content");

        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while (recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getContent());
        }
    }
}
