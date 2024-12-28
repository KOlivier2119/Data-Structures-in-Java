public class Main {
    public void log(int[] numbers) {
        // O(1) runs in constant time
        System.out.println(numbers[0]);
        // O(n) takes time which equal to the number of inputs
        for (int number : numbers) System.out.println(number);
    }
}