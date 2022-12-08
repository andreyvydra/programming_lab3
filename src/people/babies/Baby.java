package people.babies;

import people.Man;

public class Baby extends Man implements Kid {
    public Baby() {
        super("Малышка");
    }

    public Baby(String name) {
        super(name);
    }

    public void goingOn() {
        System.out.println(this + " начал собираться куда-то");
    }

    public void cry() {
        System.out.println(this + " кричит!");
    }
}
