import java.util.Arrays;

public class Add {
    public static void main(String[] args) {
        // Initial energy
        int E = 6;

        // Machines - each value is how much energy it reduces
        int[] A = {2,10, 1};

        // Step 1: Sort the array in ascending order
        Arrays.sort(A);

        // Step 2: Create a new array in descending order
        int n = A.length;
        int[] desc = new int[n];
        for (int i = 0; i < n; i++) {
            desc[i] = A[n - 1 - i];  // Reversing the array
        }

        int steps = 0;  // Count how many machines used

        // Step 3: Use each machine at most 2 times
        for (int i = 0; i < desc.length; i++) {
            int count = 0;
            while (count < 2 && E > 0) {
                E -= desc[i];    // Reduce energy
                steps++;         // Increase use count
                count++;         // Track this machine's usage

                if (E <= 0) {
                    System.out.println("Minimum machine uses: " + steps);
                    return;  // Done early
                }
            }
        }

        // Step 4: If not enough to reduce E to 0
        System.out.println("Minimum machine uses: -1");
    }
}
