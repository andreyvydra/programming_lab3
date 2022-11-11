import people.*;
import people.babies.Baby;
import people.characters.*;

public class Main {
    public static void main(String[] args) {
        Baby baby1 = new Baby("Первая малышка");
        Baby baby2 = new Baby("Вторая малышка");
        Baby baby3 = new Baby("Третья малышка");
        Guest shurup = new Guest("Шурупчик");
        Guest gvozd = new Guest("Гвоздик");
        Guest bublik = new Guest("Бублик");
        Guest citizen = new Guest("Житель Змееевки");
        Neznaika neznaika = new Neznaika();

        Guest[] guests = new Guest[4];
        guests[0] = shurup;
        guests[1] = gvozd;
        guests[2] = bublik;
        guests[3] = citizen;

        Baby[] babies = new Baby[3];
        babies[0] = baby1;
        babies[1] = baby2;
        babies[2] = baby3;

        doForAll(guests, babies);

        neznaika.sitAndSleep();
        babiesGoingOn(babies);
        neznaika.goToSquare();
    }

    public static void doForAll(Guest[] guests, Baby[] babies) {
        for (int i = 0; i < guests.length; i++) {
            guests[i].getToDance();
            guests[i].sayThankSomeone(babies[i % babies.length]);
            guests[i].getInvitation();
            System.out.println();
        }
    }

    public static void babiesGoingOn(Baby[] babies) {
        for (Baby baby : babies) {
            baby.goingOn();
        }
    }

}