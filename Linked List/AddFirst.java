public class AddFirst {

    // Node ka blueprint
    class Node {
        int data;       // Node ke andar value store hogi
        Node next;      // Next Node ka reference/address rakhega

        public Node(int data) {
            this.data = data;   // Jo value mili, usko data mein store karo
            // next by default null hota hai
        }
    }

    Node head;      // head = first Node
    Node tail;      // tail = last Node
    int size;       // size = total kitne Nodes hain

    // LinkedList banate time ye constructor chalega
    public AddFirst() {
        this.head = null;   // Starting mein koi Node nahi hai
        this.tail = null;   // Starting mein koi last Node nahi hai
        this.size = 0;      // Starting mein 0 Nodes hain
    }

   // LinkedList ke START mein new Node add karna
public void addToFirst(int val) {

    // val ki value ka ek naya Node banao
    Node newNode = new Node(val);

    // Agar head null hai, matlab LinkedList empty hai
    if (head == null) {

        // New Node hi first Node banega
        head = newNode;

        // Kyunki ye first aur only Node hai,
        // isliye ye last Node (tail) bhi hoga
        tail = newNode;
    }

        else {

            // New Node ko purane head se connect karo
            newNode.next = head;

            // Ab new Node hi first Node hai
            head = newNode;
        }

        // Ek Node add hua, isliye size 1 se badhao
        this.size++;
    }


    // Ye function LinkedList ko print karega
    public void displayList() {

        // Temporary variable ko first Node (head) par rakho
        Node temp = head;

        // Jab tak temp null nahi hai,
        // tab tak Nodes ko print karte raho
        while (temp != null) {

            // Current Node ki value print karo
            System.out.print(temp.data + ", ");

            // Current Node ka next kis Node ko point kar raha hai,
            // uska reference tempKaNext mein store karo
            Node tempKaNext = temp.next;

            // Ab temp ko next Node (tempKaNext) par le jao
            temp = tempKaNext;
        }
    }
}


class AddFirstMain{
    public static void main(String[] args) {

        // Ek empty LinkedList banao
        AddFirst ll = new AddFirst();

        // Start mein 5 add karo
        ll.addToFirst(5);

        // Start mein 10 add karo
        ll.addToFirst(10);

        // Start mein 15 add karo
        ll.addToFirst(15);

        // Start mein 20 add karo
        ll.addToFirst(20);

        // LinkedList ko print karo
        ll.displayList();
    }
}

    

