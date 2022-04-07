package factorymethod;

public class BookFactory extends DefaultProductFactory {

    @Override
    public Product createProduct() {
        return new Book();
    }
}
