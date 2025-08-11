package Dependency_Injection.Example2;



import javax.inject.Provider;

public class CylinderProvider implements Provider<Cylinder> {

    @Override
    public Cylinder get() {
        return new StrongCylinder("234235");
    }
}
