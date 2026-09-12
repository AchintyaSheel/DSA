public class RemoveNodeAt {
    // Node class represents one node of the LinkedList
    class Node {
        int data;       // Stores the value
        Node next;      // Stores the address/reference of the next node

        // Constructor to create a new node
        public Node(int data) {
            this.data = data;
        }

    }

    Node head;  // Points to the first node
    Node tail;  // Points to the last node
    int size;   // Stores the number of nodes

    // Constructor for LinkedList
    public RemoveNodeAt() {
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }

    // Displays all the elements of the LinkedList
    public void displayList() {

        // Start from the first node
        Node temp = head;

        // Continue until temp becomes null
        while (temp != null) {

            // Print the data of current node
            System.out.print(temp.data + ",");

            // Move temp to the next node
            Node tempKaNext = temp.next;
            temp = tempKaNext;
        }

        // Move to the next line after displaying the list
        System.out.println();
    }

    // Adds a new node at the end of the LinkedList
    public void addLast(int val) {

        // Create a new node with the given value
        Node newNode = new Node(val);

        // Check if there are 0 nodes in the LinkedList
        if (head == null) {

            // New node becomes the first node
            head = newNode;

            // New node also becomes the last node
            tail = newNode;
        }
        else {

            // Connect the current last node to the new node
            tail.next = newNode;

            // Make the new node the last node
            tail = newNode;
        }

        // Increase the size by 1
        this.size++;
    }

     public void removeFirst() {

    // If head is null, there is no node to remove
    if (head == null) {
        System.out.println("No node to remove, Linked List is empty");
    }

    // If head and tail are the same,
    // it means there is only one node
    else if (head == tail) {

        // Remove the only node
        head = null;
        tail = null;
    }

    // If there are more than one nodes
    else {
        // Store the second node (head's next node)
        // in a temporary variable
        Node headKaNext=head.next;
        // Make the second node the new head
        // So the old first node is removed
        head=headKaNext; 

        // One node was removed
        this.size--;
    }
}
    // Adds a new node at the given index
    public void removeNodeAt(int idx, int val) {

        // Check whether the given index is valid
        if (idx < 0 || idx > size) {

            // Index is invalid, so print an error message
            System.out.println("Index out of bound exception");
            return;
        }

        // If index is 0, add the node at the beginning
        else if (idx == 0) {

            // Call addFirst() because index 0 means first position
            removeFirst(val);
            return;
        }

        // Create a new node with the given value
        Node newNode = new Node(val);

        // Get the node just before the position where we want to insert
        Node prevNode = getNodeAt(idx - 1);

        // Store the node that currently comes after prevNode
        Node nextNode = prevNode.next;

        // Break the connection between prevNode and nextNode
        prevNode.next = null;

        // Connect prevNode to the new node
        prevNode.next = newNode;

        // Connect the new node to nextNode
        newNode.next = nextNode;

        // Increase the size by 1
        this.size++;

    }

    // Returns the node present at the given index
    public Node getNodeAt(int idx) {

        // Start from the first node
        Node temp = head;

        // Check whether the given index is valid
        if (idx < 0 || idx > size) {

            // If index is invalid, print error message
            System.out.println("Index out of Bound Exception");
            return null;
        }
        else {

            // Move temp until we reach the required index
            for (int i = 0; i < idx; i++) {

                // Get the next node
                Node tempKaNext = temp.next;

                // Move temp to the next node
                temp = tempKaNext;
            }
        }

        // Return the node at the given index
        return temp;

    }

}

// Main class
class AddNextAtMain {
    public static void main(String[] args) {

        // Create a LinkedList object
        AddNodeAt ll = new AddNodeAt();

        // Add elements to the LinkedList
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        // Display the complete LinkedList
        ll.displayList();

        // Add 5 at index 2
        // Before: 10 -> 20 -> 30 -> 40 -> 50
        // After:  10 -> 20 -> 5 -> 30 -> 40 -> 50
        ll.addNodeAt(2, 5);

        // Display the list after insertion
        ll.displayList();

        // Add 33 at index 4
        // Inserts 33 between the nodes at index 3 and index 4
        ll.addNodeAt(4, 33);

        // Display the list after insertion
        ll.displayList();

        // Try to add 1 at index 55
        // Since 55 is greater than the current size,
        // the index is invalid and an error message is printed
        ll.addNodeAt(55, 1);

        // Display the list
        ll.displayList();

    }
}

    

