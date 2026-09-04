public class TowerOfHanoi {

    // TOH = Tower of Hanoi
    // n = number of discs
    // A = source rod
    // C = destination rod
    // B = auxiliary/helper rod
    public static void TOH(int n, int A, int C, int B) {

        // Base condition:
        // If there are no discs, there is nothing to move.
        if (n == 0)
            return;

        // Step 1:
        // Move the top n-1 discs from A to B.
        // Here, C acts as the auxiliary rod.
        TOH(n - 1, A, B, C);

        // Step 2:
        // Move the largest disc (disc n) from A to C.
        System.out.println("Moving Disc " + n + " from " + A + "-->" + C);

        // Step 3:
        // Move the n-1 discs from B to C.
        // Here, A acts as the auxiliary rod.
        TOH(n - 1, B, C, A);
    }

    public static void main(String[] args) {

        // We have 3 discs.
        //
        // 10 = Source rod (A)
        // 30 = Destination rod (C)
        // 20 = Auxiliary rod (B)
        //
        // So, move 3 discs from rod 10 to rod 30
        // using rod 20 as the helper.
        TOH(3, 10, 30, 20);
    }
}
