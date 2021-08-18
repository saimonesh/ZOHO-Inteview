import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class KClosestElement {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
//        int loc = binarySearch(arr, 0, arr.length - 1, x);
//        LinkedList<Integer> res = new LinkedList<Integer>();
//        if (loc != -1) {
//            res.addFirst(arr[loc]);
//            k--;
//
//        }
//        for (int i = loc - 1, j = loc + 1; k > 0; ) {
//            if (i < 0) {
//                res.addLast(arr[j]);
//                j++;
//            } else if (j > arr.length - 1) {
//                res.addFirst(arr[i]);
//                i--;
//            } else {
//                if (Math.abs(x - arr[i]) < Math.abs(x - arr[j])) {
//                    res.addFirst(arr[i]);
//                    i--;
//                } else if (Math.abs(x - arr[i]) > Math.abs(x - arr[j])) {
//                    res.addLast(arr[j]);
//                    j++;
//                } else {
//                    if (arr[i] < arr[j]) {
//                        res.addFirst(arr[i]);
//                        i--;
//                    } else if (arr[i] > arr[j]) {
//                        res.addLast(arr[j]);
//                        j++;
//                    } else {
//                        res.add(arr[i]);
//                        i--;
//                        j++;
//                    }
//                }
//            }
//            k--;
//
//        }
//        return res;
        int left = 0, right = arr.length - k;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x - arr[mid] > arr[mid + k] - x)
                left = mid + 1;
            else
                right = mid;
        }
        return Arrays.stream(arr, left, left + k).boxed().collect(Collectors.toList());
    }

    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
}
