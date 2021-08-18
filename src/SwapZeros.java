import java.util.Arrays;

public class SwapZeros {
    int[] array;

    public SwapZeros(int[] array) {
        this.array = array;
    }

    public SwapZeros doSwap() {
        int non_zero = 0;
        while (array[non_zero] == 0) {
            non_zero++;
        }
        for (int zero_location = non_zero; zero_location < array.length; ) {
            if (array[zero_location] != 0) {
                zero_location++;
            } else {
                doShift(zero_location - 1, zero_location, non_zero);
                non_zero++;
            }
        }
        return this;
    }

    private void doShift(int i, int j, int until) {
        while (i >= until) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i--;
            j--;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
