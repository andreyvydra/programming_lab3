import people.ConstructorGetter;
import people.Guest;
import people.GuestFactory;
import people.Man;
import people.babies.Baby;
import people.babies.BabyFactory;
import people.characters.Gvozdik;
import people.characters.Neznaika;

import java.util.Arrays;

public class Story {
    public void printStory() {
        Evening.notCameYet();
        Story.printPeopleActions();

        Story.sceneGvozdik();

        Baby[] babies = new Baby[5];
        for (int i = 0; i < babies.length; i++) {
            babies[i] = BabyFactory.createBaby(new ConstructorGetter() {});
        }

        Story.sceneGuests(babies);
        Story.sceneNeznaika(babies);
        Story.sceneBabies(babies);
    }

    public static void sceneNeznaika(Baby[] babies) {
        Neznaika neznaika = new Neznaika();
        neznaika.sitAndSleep();
        Story.babiesGoingOn(babies);
        neznaika.goToSquare();
    }

    public static void sceneGuests(Baby[] babies) {
        Guest[] charactersGuests = new Guest[2];
        charactersGuests[0] = new Guest("Шурупчик");
        charactersGuests[1] = new Guest("Бублик");
        Guest[] zmeevkaCitizens = new Guest[5];
        for (int i = 0; i < zmeevkaCitizens.length; i++) {
            zmeevkaCitizens[i] = GuestFactory.createZmeevkaCitizen(new ConstructorGetter() {});
        }
        Guest[] allGuests = Arrays.copyOf(charactersGuests, charactersGuests.length + zmeevkaCitizens.length);
        System.arraycopy(zmeevkaCitizens, 0, allGuests, charactersGuests.length, zmeevkaCitizens.length);
        Story.getToDance(allGuests);
        System.out.println();
        Story.getInvitation(allGuests, babies);
        System.out.println();
    }

    public static void sceneGvozdik() {
        Gvozdik gvozdik = new Gvozdik();
        gvozdik.getToDance();
        gvozdik.printClothes();
        gvozdik.printIsWashed();
        gvozdik.getHead().printStatus();
        System.out.println();
    }

    public static void sceneBabies(Baby[] babies) {
        for (Baby baby : babies) {
            baby.cry();
        }
    }

    public static void printPeopleActions() {
        class People extends Man {
            public People() {
                super("Все");
            }

            public void allGathered() {
                System.out.println(this.getName() + " собрались вокруг площадки");
            }

            public void waitingGuests() {
                System.out.println(this.getName() + " стали ждать гостей");
            }
        }
        People people = new People();
        people.allGathered();
        people.waitingGuests();
    }

    public static void getToDance(Guest[] guests) {
        for (Guest guest : guests) {
            guest.getToDance();
        }
        System.out.println();
    }

    public static void getInvitation(Guest[] guests, Baby[] babies) {
        for (int i = 0; i < guests.length; i++) {
            guests[i].sayThankSomeone(babies[i % babies.length]);
            guests[i].getInvitation();
        }
        System.out.println();
    }

    public static void babiesGoingOn(Baby[] babies) {
        for (Baby baby : babies) {
            baby.goingOn();
        }
    }

    static class Evening {
        public static void notCameYet() {
            System.out.println("Вечер ещё не пришёл");
        }
    }
}
