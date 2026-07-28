import java.util.Vector;

public class VectorArray {
    public static void main(String[] args) {
        Vector<Integer> Numbers = new Vector<>();
        Numbers.add(10);
        Numbers.add(20);
        Numbers.add(30);
        
        System.out.println("Vector: " + Numbers);
        Numbers.remove(2);
        
        System.out.println("Vector after removing elements: " + Numbers);
        System.out.println("Size of Vector: " + Numbers.size());
        
        System.out.println("contains '10': " + Numbers.contains(10));
    }
}
