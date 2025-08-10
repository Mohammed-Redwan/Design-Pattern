package Dependancy_Injection.Example2;

import javax.inject.Provider;

public class TireProvider implements Provider<Tire> {

    @Override
    public Tire get() {
        return new BigTire(40);
    }

}
