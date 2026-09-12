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

    // Removes the first node from the LinkedList
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
            Node headKaNext = head.next;

            // Make the second node the new head
            // So the old first node is removed
            head = headKaNext;

            // One node was removed
            this.size--;
        }
    }

    // Removes the last node from the LinkedList
    public void removeLast() {

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

            // Start from the first node
            Node temp = head;

            // Move temp until it reaches
            // the node just before the last node
            while (temp.next != tail) {

                // Go to the next node
                Node tempKaNext = temp.next;
                temp = tempKaNext;
            }

            // Remove the last node by making
            // the second-last node point to null
            temp.next = null;

            // Now second-last node becomes the new tail
            tail = temp;

            // One node was removed
            this.size--;
        }
    }

    // Removes the node at the given index
    public void removeNodeAt(int idx) {

        // Check whether the given index is valid
        if (idx < 0 || idx > size) {

            // Index is invalid, so print an error message
            System.out.println("Index out of bound exception");
            return;
        }

        // If index is 0, remove the node at the beginning
        if (idx == 0) {

            // Call removeFirst() because index 0 means first position
            removeFirst();
            return;
        }

        // If index is equal to size,
        // call removeLast() to remove the last node
        else if (idx == size) {

            // Call removeLast() because index size means last position
            removeLast();
            return;
        }

        // For removing a node from the middle
        else {

            // Get the node just before the node we want to remove
            Node previousNode = getNodeAt(idx - 1);

            // Get the node that we want to delete
            Node nodeToDelete = previousNode.next;

            // Store the node that comes after the node to delete
            Node nextNode = nodeToDelete.next;

            // Break the connection between previousNode and nodeToDelete
            previousNode.next = null;

            // Connect previousNode directly to nextNode
            // This removes nodeToDelete from the LinkedList
            previousNode.next = nextNode;
        }

        // Decrease the size by 1
        this.size--;

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
class RemoveNodeAtMain {
    public static void main(String[] args) {

        // Create a LinkedList object
        RemoveNodeAt ll = new RemoveNodeAt();

        // Add elements to the LinkedList
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        // Display the complete LinkedList
        ll.displayList();

        // Remove the node at index 2
        // 10 -> 20 -> 30 -> 40 -> 50
        // 10 -> 20 -> 40 -> 50
        ll.removeNodeAt(2);
        ll.displayList();

        // Try to remove the node at index 4
        ll.removeNodeAt(4);
        ll.displayList();

        // Try to remove the node at index 10
        // Since this index is out of bounds, an error is displayed
        ll.removeNodeAt(10);
        ll.displayList();
        
    }
}
