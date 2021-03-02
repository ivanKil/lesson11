public abstract class Fruit {
    abstract public float getWeight();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
