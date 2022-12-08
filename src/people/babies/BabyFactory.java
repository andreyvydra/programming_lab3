package people.babies;

import exceptions.OutOfBabyCounterException;
import people.ConstructorGetter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BabyFactory {
    private static byte babyCounter = 0;

    public static Baby createBaby(ConstructorGetter constructorGetter) {
        Baby baby = null;
        try {
            BabyFactory.babyCounter++;
            if (BabyFactory.babyCounter < 0) {
                throw new OutOfBabyCounterException();
            }
            Constructor<?> constructor = constructorGetter.getConstructor(Baby.class.getConstructors());
            baby = (Baby) constructor.newInstance("Малышка " + BabyFactory.babyCounter);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            System.out.println("Error: Didn't create guest!");
        }
        return baby;
    }
}
