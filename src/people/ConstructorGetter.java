package people;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public interface ConstructorGetter {
    default Constructor<?> getConstructor(Constructor<?>[] constructors) {
        Constructor<?> constructor = constructors[0];
        for (Constructor<?> curConstructor : constructors) {
            Parameter[] curParameters = curConstructor.getParameters();
            if (curParameters.length == 1 && curParameters[0].getType() == String.class) {
                constructor = curConstructor;
            }
        }
        return constructor;
    }
}
