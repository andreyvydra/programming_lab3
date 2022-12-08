package people.characters;

import people.Guest;

public class Gvozdik extends Guest {
    public Gvozdik() {
        super("Гвоздик");
        this.setHeadCombed(false);
    }

    public void printClothes() {
        System.out.println("На " + this + " была чистенькая рубашка");
    }

    public void printIsWashed() {
        System.out.println(this + " был умыт");
    }
}
