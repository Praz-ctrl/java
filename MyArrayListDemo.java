import java.util.ArrayList;

public class MyArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("ArrayList: " + fruits);
        fruits.remove("Apple");
        fruits.remove("Banana");
        fruits.remove("Cherry");
        System.out.println("ArrayList after removing elements: " + fruits);
        System.out.println("Size of ArrayList: " + fruits.size());
        System.out.println("contains 'Apple': " + fruits.contains("Apple"));
    }
}
