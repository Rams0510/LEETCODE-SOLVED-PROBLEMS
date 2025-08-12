class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums) {
            ones = (ones ^ num) & ~twos; // update ones
            twos = (twos ^ num) & ~ones; // update twos
        }

        return ones; // holds the single number
    }
}
