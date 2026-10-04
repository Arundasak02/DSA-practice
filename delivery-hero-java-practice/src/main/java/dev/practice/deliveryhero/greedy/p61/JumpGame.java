package dev.practice.deliveryhero.greedy.p61;

/*
 * P61 — Can you reach the last index? | 25 minutes
 * Evidence: Reported · Berlin senior Nov 2025, Python track; Java practice contract.
 *
 * Start at index 0. jumps[i] is the maximum forward jump from i; choose any positive
 * jump up to that value. Return whether the final index is reachable (overshooting
 * is unnecessary). One element is already reached. Input is non-null and non-empty,
 * length <=100,000, each value 0..Integer.MAX_VALUE. Do not mutate it.
 * Examples: [2,3,1,1,4] -> true; [3,2,1,0,4] -> false.
 * Target: O(n) time, O(1) extra space. Explain the invariant and overflow handling.
 * This is reachability (Jump Game I), not minimum jumps (removed P54).
 * The task name is reported; these edge cases and bounds are practice choices.
 *
 * Run: ./mvnw -Dtest=JumpGameTest test
 * Source S20: https://www.glassdoor.com/Interview/Delivery-Hero-Senior-Software-Engineer-Interview-Questions-EI_IE504556.0%2C13_KO14%2C38.htm
 */
public class JumpGame {
    public boolean canReach(int[] jumps) {
        throw new UnsupportedOperationException("TODO P61: implement your solution");
    }
}
