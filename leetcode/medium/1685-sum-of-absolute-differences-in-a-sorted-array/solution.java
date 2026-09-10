class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int[] result = new int[n];
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            int suffixSum = totalSum - prefixSum - nums[i];

            int leftTotal = nums[i] * i - prefixSum;
            int rightTotal = suffixSum - nums[i] * (n - i - 1);

            result[i] = leftTotal + rightTotal;
            prefixSum += nums[i];
        }

        return result;
    }
}