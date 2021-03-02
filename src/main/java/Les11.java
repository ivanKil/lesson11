import java.util.*;

public class Les11 {

    public static void main(String[] args) {
        String[] arrayOfWords = new String[]{"1", "2", "3", "4", "5"};

        System.out.println("Исходный массив строк: " + Arrays.toString(arrayOfWords));
        swapTwoElements(arrayOfWords, 3, 0);
        System.out.println("Массив строк с перестановками 3-го и 0-го элементов: " + Arrays.toString(arrayOfWords));

        System.out.println("ArrayList из массива типа String: " + createArrayListFromArray(arrayOfWords));

        Box<Apple> boxApples = new Box<>();
        boxApples.addFruit(new Apple());
        boxApples.addFruit(new Apple());
        boxApples.addFruit(new Apple());
        System.out.println("\nКоробка с яблоками: " + boxApples.getFruits() + ", вес=" + boxApples.getWeight());
        Box<Orange> boxOranges = new Box<>();
        boxOranges.addFruit(new Orange());
        boxOranges.addFruit(new Orange());
        System.out.println("Коробка с апельсинами: " + boxOranges.getFruits() + ", вес=" + boxOranges.getWeight());
        System.out.println("Сравнение коробок: " + (boxApples.compareByWeight(boxOranges) ? "равны" : "не равны"));

        Box<Orange> secondBoxOranges = new Box<>();
        secondBoxOranges.addFruit(new Orange());
        System.out.println("\nКоробка-источник до пересыпки: " + boxOranges.getFruits());
        System.out.println("Коробка-приёмник до пересыпки: " + secondBoxOranges.getFruits());
        boxOranges.transferFruits(secondBoxOranges);
        System.out.println("Коробка-источник после пересыпки: " + boxOranges.getFruits());
        System.out.println("Коробка-приёмник после пересыпки: " + secondBoxOranges.getFruits());
    }

    private static void swapTwoElements(Object array[], int ind1, int ind2) {
        if (ind1 >= array.length || ind1 < 0 || ind2 >= array.length || ind2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Индексы выходят за пределы массива");
        }
        Object object2 = array[ind2];
        array[ind2] = array[ind1];
        array[ind1] = object2;
    }

    private static <T> ArrayList<T> createArrayListFromArray(T array[]) {
        ArrayList<T> list = null;
        if (array != null) {
            list = new ArrayList<>();
            for (T t : array) {
                list.add(t);
            }
        }
        return list;
    }
}