package strategy;

public class Normal implements Speed {

    @Override
    public void blueLight() {
        System.out.println("blue light normal");
    }

    @Override
    public void redLight() {
        System.out.println("red light normal");
    }
}
