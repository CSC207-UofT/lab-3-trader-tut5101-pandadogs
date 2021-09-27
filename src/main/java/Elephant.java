public class Elephant implements Tradable, Domesticatable {

    @Override
    public String sound() {
        return "Boooo!";
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String toString() {
        return "Elephant sounds" + this.sound();
    }
}
