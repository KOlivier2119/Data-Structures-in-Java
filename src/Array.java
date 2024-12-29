import java.util.Arrays;

public class Array {
    private int size;
    private int count;
    int[] numbers = new int[size];
    Array(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insert(int number) {
        if (numbers.length == count) {
            int[] new_numbers = new int[count * 2];
            for (int i = 0; i < count; i++)
                new_numbers[i] = numbers[i];

            numbers = new_numbers;
        }
        numbers[count++] = number;
    }

    public void removeAt(int index) {
        int[] new_array = new int[size];
        for (int i = 0; i < size; i++) {
            if (i != index) {
                new_array[i] = numbers[i];
            }
        }
        numbers = new_array;
        System.out.println(Arrays.toString(numbers));
    }

    public int indexOf(int num) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == num) {
                index = i;
            }
        }
        return index;
    }

    public void print() {
        System.out.println(Arrays.toString(numbers));
    }
}
