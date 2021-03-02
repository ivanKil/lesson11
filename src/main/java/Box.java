import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();// фрукты в корзине

    public float getWeight() {
        if (fruits.size() == 0) {
            return 0;
        }
        return fruits.size() * fruits.get(0).getWeight();
    }

    //Comporable реализовывать не стал, т.к. compareTo возвращает int, а нужно boolean
    public boolean compareByWeight(Box box) {
        if (box == null) {
            return false;
        }
        return getWeight() == box.getWeight();
    }

    public void transferFruits(Box<T> newBox) {
        for (T fruit : getFruits()) {
            newBox.addFruit(fruit);
        }
        fruits.clear();
    }

    public void addFruit(T fruit) {
        if (fruit != null) {
            fruits.add(fruit);
        }
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }
}
