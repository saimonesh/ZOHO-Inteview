public class BalancedString {
    public int balancedStringSplit(String s) {
        int loc = 0;
        int lCount = 0, rCount = 0;
        int count = 0;
        while (loc < s.length()) {
            if (lCount == rCount && lCount != 0) {
                count++;
                lCount = 0;
                rCount = 0;
            } else {
                if (s.charAt(loc) == 'L') {
                    lCount++;
                } else {
                    rCount++;
                }
                loc++;
            }

        }
        if (lCount == rCount && lCount != 0) count++;
        return count;
    }
}
