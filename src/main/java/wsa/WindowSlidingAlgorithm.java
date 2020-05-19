package wsa;

/*Given a array find largest sum of contagious subarray of given length*/
public class WindowSlidingAlgorithm {

    public Integer findMaxSumOfSubArray(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (i >= k - 1) {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                currentSum -= arr[i + 1 - k ];
            }

        }
        return maxSum;
    }
}
