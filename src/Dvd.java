public class Dvd implements Disc {
    @Override
    public String read() {
        return getName() + " Dvd with quite nice quality";
    }

    @Override
    public String getName() {
        return "DVD";
    }
}
