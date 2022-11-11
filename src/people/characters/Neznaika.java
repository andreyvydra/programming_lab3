package people.characters;

import people.Man;

public class Neznaika extends Man {
    public Neznaika() {
        super("Незнайка");
    }

    public void sitAndSleep() {
        System.out.println(this + " сидел, а конкретнее спал в одуванчиках до начала бала");
    }

    public void goToSquare() {
        System.out.println(this + " увидел малышек, поднялся и пошёл на площадку");
    }
}
