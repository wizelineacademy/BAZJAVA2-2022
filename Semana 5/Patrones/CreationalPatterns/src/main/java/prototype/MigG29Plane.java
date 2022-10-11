package prototype;

public class MigG29Plane implements PlaneMold, Cloneable {

    @Override
    public void createPlane() {
        try {
            Object obj = this.clone();
            System.out.println("Pintando el avion de color negro");
            System.out.println("Created plane object with id: " + obj.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
