package people.characters;

import people.Man;

public class Neznaika extends Man {
    public Neznaika() {
        super("Neznaika");
    }

    public void sitAndSleep() {
        System.out.println(this + " has already set and slept at dandelions before dance started");
    }

    public void goToSquare() {
        System.out.println(this + " has saw babies, got up and gone to square");
    }
}
