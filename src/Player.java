class Player {
    private boolean empty;
    private Disc2 disc;

    public Player() {
        this.empty = true;
    }

    void play() {
        if (!empty) {
            System.out.println(disc.read());
        } else {
            System.out.println("Brak płyty w napędzie");
        }
    }

    void insert(Disc2 disc) {
        if (empty) {
            this.disc = disc;
            empty = false;
            System.out.println("Załadowano płytę " + disc.getName());
        } else {
            System.out.println("W napędzie jest już płyta");
        }
    }

    void eject(Disc2 disc) {
        if (!empty) {
            System.out.println("Wyjęto płytę");
            this.disc = null;
            empty = true;
        } else {
            System.out.println("Brak płyty w napędzie");
        }

    }
}
