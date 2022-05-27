package flyweight;

public class Client {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character char1 = new Character('h' , "color", fontFactory.getFont("nanum:12"));
        Character char2 = new Character('e' , "color", fontFactory.getFont("nanum:12"));
        Character char3 = new Character('l' , "color", fontFactory.getFont("nanum:12"));
    }
}
