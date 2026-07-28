public class Main {
    public static void main(String[] args) {
        int[] n = {10, 20, 30, 40, 50};
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        for (int num : n) {
            System.out.println(num);
        }
    }
}
