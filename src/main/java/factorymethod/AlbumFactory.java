package factorymethod;

public class AlbumFactory extends DefaultProductFactory {

    @Override
    public Product createProduct() {
        return new Album();
    }
}
