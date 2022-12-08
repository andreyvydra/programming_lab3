package people.babies;

import exceptions.OutOfBabyCounterException;
import people.ConstructorGetter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BabyFactory extends ConstructorGetter {
    private static byte babyCounter = 0;

    public static Baby createBaby() {
        Baby baby = null;
        try {
            BabyFactory.babyCounter++;
            if (BabyFactory.babyCounter < 0) {
                throw new OutOfBabyCounterException();
            }
            Constructor<?> constructor = BabyFactory.getConstructor(Baby.class.getConstructors());
            baby = (Baby) constructor.newInstance("Житель Змеевки " + BabyFactory.babyCounter);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            System.out.println("Error: Didn't create guest!");
        }
        return baby;
    }
}
