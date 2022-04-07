package factorymethod;

public abstract class DefaultProductFactory implements ProductFactory {

    @Override
    public void sendEmailTo(String email, Product product) {
        System.out.println(product.getName() + "완성되었습니다.");
    }
}
