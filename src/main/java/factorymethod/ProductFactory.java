package factorymethod;

public interface ProductFactory {

    default Product orderProduct(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Product product = createProduct();
        sendEmailTo(email, product);
        return product;
    }

    void sendEmailTo(String email, Product product);

    Product createProduct();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("상품 이름을 입력 해주세요.");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalStateException("이메일을 입력 해주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + "준비 중");
    }
}
