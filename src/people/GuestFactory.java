package people;

import exceptions.OutOfGuestCounterException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GuestFactory {
    private static byte guestCounter = 0;

    public static Guest createZmeevkaCitizen(ConstructorGetter constructorGetter) {
        Guest guest = null;
        try {
            GuestFactory.guestCounter++;
            if (GuestFactory.guestCounter < 0) {
                throw new OutOfGuestCounterException();
            }
            Constructor<?>[] constructors = Guest.class.getConstructors();
            Constructor<?> constructor = constructorGetter.getConstructor(constructors);
            guest = (Guest) constructor.newInstance("Житель Змеевки " + GuestFactory.guestCounter);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            System.out.println("Error: Didn't create guest!");
        } catch (OutOfGuestCounterException e) {
            System.out.println("В Змеевке всего 127 жителей");
        }
        return guest;
    }
}
