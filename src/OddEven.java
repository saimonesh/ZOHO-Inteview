import java.util.Arrays;

public class OddEven {
    int[] array;

    public OddEven(int[] array) {
        this.array = array;
    }

    public OddEven doSwap() {
        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 != 0) {
                array[k] *= -1;
            }
        }
        sort();
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) != 0) {
                array[i] *= -1;
            } else {
                break;
            }
        }
        return this;
    }

    private void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
