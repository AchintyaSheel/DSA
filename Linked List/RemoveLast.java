public class RemoveLast {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }

    }

        Node head;
        Node tail;
        int size;
        public RemoveLast(){
            this.head=head;
            this.tail=tail;
            this.size=0;

        }
       public void remLast() {

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
        size--;
    }
}


         public void addToLast(int val) {

        // val ki value ka ek naya Node banao
        Node newNode = new Node(val);

       // Agar head null hai, matlab LinkedList empty hai
        if (head == null) {

            // New Node hi first Node banega
            head = newNode;

            // New Node hi last Node bhi banega
            tail = newNode;
        }

        else {

            // Purane last Node ke next mein new Node ko connect karo
            tail.next = newNode;

            // Ab new Node hi last Node hai
            tail = newNode;
        }

        // Ek Node add hua, isliye size 1 se badhao
        this.size++;
    }


    // Ye function LinkedList ko print karega
    public void displayList() {

        // Temporary variable ko first Node (head) par rakho
        Node temp = head;

        // Jab tak temp(which holds the value of head) null nahi hai,
        // tab tak Nodes ko print karte raho
        while (temp != null) {

            // Current Node ki value print karo
            System.out.print(temp.data + ", ");
            //Find next(temp ka next kisko point kar raha hai/kiska address to point kar raha hai)
            Node tempKaNext=temp.next;
            // Ab temp ko next Node(tempKaNext) par le jao
            temp = tempKaNext;
        }
         System.out.println(); // Move to a new line
    }
}
   

class removelastMain{
    public static void main(String[] args) {
        RemoveLast ll=new RemoveLast();
          ll.addToLast(5);

        // End mein 10 add karo
        ll.addToLast(10);

        // End mein 15 add karo
        ll.addToLast(15);

        // End mein 20 add karo
        ll.addToLast(20);

        // LinkedList ko print karo
        ll.displayList();

        ll.remLast();
        ll.displayList();

         ll.remLast();
        ll.displayList();

         ll.remLast();
        ll.displayList();

        ll.remLast();
        ll.displayList();

         ll.remLast();
        ll.displayList();

    }
}
