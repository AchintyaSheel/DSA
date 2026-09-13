public class ReverseLinkedListDataIteratively{

// Node ka blueprint
class Node {
    int data;       // Node ke andar value store hogi
    Node next;      // next Node ka reference/address rakhega

public Node(int data) {
    this.data = data;   // jo value mili, usko data mein store karo
            // next by default null hota hai
    }
}

    Node head;      // head = first Node
    Node tail;      // tail = last Node
    int size;       // size = total kitne Nodes hain

    // LinkedList banate time ye constructor chalega
    public ReverseLinkedListDataIteratively(){
        this.head = null;   // starting mein koi Node nahi hai
        this.tail = null;   // starting mein last Node bhi nahi hai
        this.size = 0;      // starting mein 0 Nodes hain
    }

    // LinkedList ke END mein new Node add karna
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

        // Returns the node present at the given index
    public Node getNodeAt(int idx){

        // Start from the first node
        Node temp=head;

        // Check whether the given index is valid
        if(idx<0 || idx>=size){

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

    /*public void revLL(){
        int i=0;
        int j=size-1;
        while(i<j){
            Node nodeAtI=getNodeAt(i);
            Node nodeAtJ=getNodeAt(j);

            int dataAtI=nodeAtI.data;
            int dataAtJ=nodeAtJ.data;

            //swap
            nodeAtI.data=dataAtJ;
            nodeAtJ.data=dataAtI;
            i++;
            j--;
            
        }
    }*/
   //prefer this(similar to Array)
   public void revLL() {
    int i = 0;
    int j = size - 1;

    while (i < j) {
        Node nodeAtI = getNodeAt(i);
        Node nodeAtJ = getNodeAt(j);

        // Swap data
        int temp = nodeAtI.data;
        nodeAtI.data = nodeAtJ.data;
        nodeAtJ.data = temp;

        i++;
        j--;
    }
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
        System.out.println();
    }
}


class ReverseLinkedListDataIterativelyMain {
    public static void main(String[] args) {

        // Ek empty LinkedList banao
        ReverseLinkedListDataIteratively ll = new ReverseLinkedListDataIteratively();

        // End mein 5 add karo
        ll.addToLast(5);

        // End mein 10 add karo
        ll.addToLast(10);

        // End mein 15 add karo
        ll.addToLast(15);

        // End mein 20 add karo
        ll.addToLast(20);

        // LinkedList ko print karo
        ll.displayList();

        ll.revLL();
        ll.displayList();
    }
    
}
