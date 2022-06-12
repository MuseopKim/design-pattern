package strategy;

public class Faster implements Speed {

    @Override
    public void blueLight() {
        System.out.println("blue light faster");
    }

    @Override
    public void redLight() {
        System.out.println("red light faster");
    }
}
