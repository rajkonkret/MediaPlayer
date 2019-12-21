public class Cd extends Disc2 {

    public Cd() {
        super("CD");
    }

    @Override
    public String read() {
        return this.getName() + " Cd with not very well quality";

    }

}
