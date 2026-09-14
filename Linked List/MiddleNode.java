public class MiddleNode {

    /*
     * LeetCode 876:
     * Middle of the Linked List
     *
     * Is problem mein humein LinkedList ka middle node find karna hai.
     *
     * Example:
     *
     * 10 -> 20 -> 30 -> 40 -> 50
     *
     * Is LinkedList ka middle node = 30
     *
     * Hum Tortoise and Hare Algorithm use karenge.
     *
     * Isme 2 pointers use hote hain:
     *
     * slow -> 1 step move karega
     * fast -> 2 steps move karega
     *
     * Jab fast LinkedList ke end tak pahunch jayega,
     * tab slow middle node par hoga.
     */


    // ListNode class ek single node ko represent karti hai
    class ListNode {

        // Node ke andar actual value store hogi
        int val;

        // Next node ka reference/address store hoga
        ListNode next;


        // Constructor new node create karne ke liye
        ListNode(int val) {

            // Jo value pass ki gayi hai,
            // use current node ke val mein store karo
            this.val = val;
        }
    }


    // Solution class mein problem ka actual solution likhenge
    class Solution {


        // Ye method LinkedList ka middle node return karega
        public ListNode middleNode(ListNode head) {

            /*
             * Slow pointer head se start karega.
             *
             * Slow ek baar mein sirf 1 node aage jayega.
             *
             * Example:
             *
             * 10 -> 20 -> 30 -> 40 -> 50
             * ↑
             * slow
             */
            ListNode slow = head;


            /*
             * Fast pointer bhi head se start karega.
             *
             * Fast ek baar mein 2 nodes aage jayega.
             *
             * Example:
             *
             * 10 -> 20 -> 30 -> 40 -> 50
             * ↑
             * fast
             */
            ListNode fast = head;


            /*
             * Ab slow aur fast ko move karenge.
             *
             * Condition:
             *
             * fast != null
             *     -> Check karta hai ki fast list ke bahar nahi gaya.
             *
             * fast.next != null
             *     -> Check karta hai ki fast 2 steps move kar sakta hai.
             *
             * Jab fast end par pahunch jayega,
             * loop automatically stop ho jayega.
             */
            while (fast != null && fast.next != null) {


                /*
                 * Slow ko ek step aage move karo.
                 *
                 * Example:
                 *
                 * 10 -> 20 -> 30 -> 40 -> 50
                 * ↑
                 * slow
                 *
                 * Iske baad:
                 *
                 * 10 -> 20 -> 30 -> 40 -> 50
                 *      ↑
                 *     slow
                 */
                slow = slow.next;


                /*
                 * Fast ko do steps aage move karo.
                 *
                 * fast.next  -> first step
                 * fast.next.next -> second step
                 *
                 * Isliye fast do nodes aage jayega.
                 */
                fast = fast.next.next;
            }


            /*
             * Jab loop finish ho jayega,
             * fast LinkedList ke end par pahunch chuka hoga.
             *
             * Kyunki fast, slow se double speed par move karta hai,
             * isliye us time slow middle node par hoga.
             *
             * Isliye slow ko return karenge.
             */
            return slow;
        }
    }


    // Main method program ko run/test karne ke liye hai
    public static void main(String[] args) {

        /*
         * MiddleNode class ka object create kar rahe hain.
         *
         * Is object ki help se hum ListNode aur Solution
         * ke objects create karenge.
         */
        MiddleNode obj = new MiddleNode();


        /*
         * Ab LinkedList create karenge:
         *
         * 10 -> 20 -> 30 -> 40 -> 50 -> null
         *
         * Sabse pehle 10 ka node create karenge.
         * Ye hamara head node hoga.
         */
        ListNode head = obj.new ListNode(10);


        /*
         * Head ke next mein 20 ka node connect karo.
         *
         * Ab:
         *
         * 10 -> 20
         */
        head.next = obj.new ListNode(20);


        /*
         * 20 ke next mein 30 ka node connect karo.
         *
         * Ab:
         *
         * 10 -> 20 -> 30
         */
        head.next.next = obj.new ListNode(30);


        /*
         * 30 ke next mein 40 ka node connect karo.
         *
         * Ab:
         *
         * 10 -> 20 -> 30 -> 40
         */
        head.next.next.next = obj.new ListNode(40);


        /*
         * 40 ke next mein 50 ka node connect karo.
         *
         * Final LinkedList:
         *
         * 10 -> 20 -> 30 -> 40 -> 50 -> null
         */
        head.next.next.next.next = obj.new ListNode(50);


        /*
         * Ab Solution class ka object create karenge.
         *
         * Is object ki help se middleNode() method call karenge.
         */
        Solution solution = obj.new Solution();


        /*
         * Middle node find karne ke liye
         * middleNode() method ko call kar rahe hain.
         *
         * head ko method mein pass kar rahe hain,
         * kyunki method ko LinkedList ka starting point chahiye.
         */
        ListNode middle = solution.middleNode(head);


        /*
         * Middle node milne ke baad
         * uski value print karenge.
         *
         * Hamari LinkedList:
         *
         * 10 -> 20 -> 30 -> 40 -> 50
         *
         * Middle node = 30
         */
        System.out.println("Middle Node: " + middle.val);
    }
}


