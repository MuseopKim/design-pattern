package command;

public class Light {

    private boolean on;

    public void on() {
        System.out.println("light on");
        this.on = true;
    }

    public void off() {
        System.out.println("light off");
        this.on = false;
    }
}
