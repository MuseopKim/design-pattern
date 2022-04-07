package factorymethod;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Product albumProduct = new AlbumFactory().createProduct();
        Product Book = new BookFactory().createProduct();
    }
}
