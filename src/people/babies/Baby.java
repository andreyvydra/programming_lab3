package people.babies;

import people.Man;

public class Baby extends Man implements Kid {
    public Baby() {
        super("Babyyy");
    }
    public Baby(String name) {
        super(name);
    }

    public void goingOn() {
        System.out.println(this + " going on a somewhere");
    }
}
