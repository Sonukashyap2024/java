import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int findKthSmallest(int[] nums, int k) {
        // Create a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert elements of the array into the min-heap
        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(nums[i]);
        }

        // Remove k-1 smallest elements from the min-heap
        for (int i = 0; i < k - 1; i++) {
            minHeap.poll();
        }

        // The top of the min-heap will be the kth smallest element
        return minHeap.poll();
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5};
        int k = 3;

        int kthSmallest = findKthSmallest(nums, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
}
