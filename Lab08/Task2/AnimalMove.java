package Task2;

public interface AnimalMove {
    default void move() {
        System.out.println(this.getClass().getSimpleName() + " is moving.");
    }
}

