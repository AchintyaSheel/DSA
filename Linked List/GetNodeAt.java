public class GetNodeAt{

    // Node class represents one node of the LinkedList
    class Node{
        int data;       // Stores the value
        Node next;      // Stores the address of the next node

        // Constructor to create a new node
        public Node(int data){
            this.data=data;
        }

    }

    Node head;  // Points to the first node
    Node tail;  // Points to the last node
    int size;  // Stores the number of nodes

    // Constructor for LinkedList
    public GetNodeAt(){
        this.head=head;
        this.tail=tail;
        this.size=0;
    }

    // Displays all the elements of the LinkedList
    public void displayList(){

        // Start from the first node
        Node temp=head;

        // Continue until temp becomes null
        while(temp!=null){

            // Print the data of current node
            System.out.print(temp.data+",");

            // Move temp to the next node
            Node tempKaNext=temp.next;
            temp=tempKaNext;
        }

        System.out.println();
    }

    // Adds a new node at the end of the LinkedList
    public void addLast(int val){

        // Create a new node with the given value
        Node newNode=new Node(val);

        // 0 nodes in the LinkedList
        if(head==null){

            // New node becomes the first node
            head=newNode;

            // New node also becomes the last node
            tail=newNode;
        }
        else{

            // Connect the current last node to the new node
            tail.next=newNode;

            // Make the new node the last node
            tail=newNode;
        }

        // Increase the size by 1
        this.size++;
    }

    // Returns the node present at the given index
    public Node getNodeAt(int idx){

        // Start from the first node
        Node temp=head;

        // Check whether the given index is valid
        if(idx<0 || idx>size){

            // If index is invalid, print error message
            System.out.println("Index out of Bound Exception");
            return null;
        }
        else{

            // Move temp until we reach the required index
            for(int i=0;i<idx;i++){

                // Get the next node
                Node tempKaNext=temp.next;

                // Move temp to the next node
                temp=tempKaNext;
            }
        }

        // Return the node at the given index
        return temp;

    }

}

// Main class
class getNodeAtMain{
    public static void main(String[] args) {

        // Create a LinkedList object
        GetNodeAt ll=new GetNodeAt();

        // Add elements to the LinkedList
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        // Display the complete LinkedList
        ll.displayList();

        // Get the node at index 2 and print its data
        System.out.println(ll.getNodeAt(2).data);

    }
}
