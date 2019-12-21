public class Dvd extends Disc2 {

    public Dvd() {
        super("DVD");
    }

    @Override
    public String read() {
        return getName() + " Dvd with quite nice quality";
    }

}

