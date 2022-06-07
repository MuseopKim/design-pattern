package observer;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("user1");
        User user2 = new User("user2");

        chatServer.register("design", user1);
        chatServer.register("pattern", user1);

        chatServer.register("design", user2);

        chatServer.sendMessage(user1, "design", "hello design");
    }
}
