public class Cd implements Disc {

    @Override
    public String read() {
            return this.getName() + " Cd with not very well quality";

    }

    @Override
    public String getName() {
        return "CD";
    }




}
