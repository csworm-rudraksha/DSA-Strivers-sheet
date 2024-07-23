package Arrays;

import java.util.*;

public class SlidingWindowMax {
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

        while (j < A.size()) {
            q.add(A.get(j));

            // If window size is not reached, just move the end pointer forward
            if (j - i + 1 < B) {
                j++;
            }
            // When window size is reached
            else if (j - i + 1 == B) {
                // Add the maximum element (which is at the head of the priority queue) to the result
                res.add(q.peek());

                // Remove the element going out of the window from the queue
                q.remove(A.get(i));

                // Slide the window forward
                i++;
                j++;
            }
        }

        return res;
//          reduced time complexity using deque
//        if (nums == null || nums.length == 0) return new int[0];
//
//        int n = nums.length;
//        int[] result = new int[n - k + 1];
//        Deque<Integer> deque = new LinkedList<>();
//
//        int i = 0, j = 0;
//
//        while (j < n) {
//            // Remove elements smaller than the current element from the back of the deque
//            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[j]) {
//                deque.pollLast();
//            }
//
//            // Add the current element index at the back of the deque
//            deque.offerLast(j);
//
//            // Remove the element at the front if it's out of the current window
//            if (!deque.isEmpty() && deque.peekFirst() < j - k + 1) {
//                deque.pollFirst();
//            }
//
//
//            // If window is hit
//            if (j - i + 1 == k) {
//                // The front of the deque is the largest element for the current window
//                result[i] = nums[deque.peekFirst()];
//
//                // Move the start of the window
//                i++;
//                // j++;
//
//            }
//            j++;
//        }
//
//        return result;
    }
}
