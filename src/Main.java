public class Main {
    public void log(int[] numbers) {
        // O(1) runs in constant time
        System.out.println(numbers[0]);
        // O(n) takes time which equal to the number of inputs
        for (int number : numbers) System.out.println(number);
        // O(n^2) is for the nested loops which takes time which equals to the product of their inputs
        for (int first : numbers)
            for (int second : numbers)
                for (int third : numbers) // O(n^3) since its the third loop
                    System.out.println(first + "," + second + "," + third);
    }
}