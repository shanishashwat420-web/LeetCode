class Solution {

    boolean possible(int[] piles, int h, int speed) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
        }
        return hours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // Maximum pile = maximum possible speed
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(piles, h, mid)) {
                // mid valid hai, aur smaller speed try kare
                high = mid - 1;
            } else {
                // mid invalid hai, speed badhay
                low = mid + 1;
            }
        }
        return low;
    }
}