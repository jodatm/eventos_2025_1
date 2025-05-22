public class ComparadorGenerico<T extends Comparable<T>> {
    public T mayor(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        ComparadorGenerico<Integer> comparadorInt = new ComparadorGenerico<>();
        System.out.println("Mayor (Integer): " + comparadorInt.mayor(10, 20));

        ComparadorGenerico<String> comparadorString = new ComparadorGenerico<>();
        System.out.println("Mayor (String): " + comparadorString.mayor("manzana", "banana"));
    }
}