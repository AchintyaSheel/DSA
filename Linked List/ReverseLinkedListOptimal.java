public class ReverseLinkedListOptimal{

    // Node ka blueprint
    class Node{
        int data;       // Node ke andar value store hogi
        Node next;      // Next Node ka reference/address

        // Node banate time ye constructor chalega
        public Node(int data){
            this.data=data;
            // next by default null hota hai
        }
    }
    
    Node head;      // LinkedList ka first Node
    Node tail;      // LinkedList ka last Node
    int size;       // LinkedList mein total Nodes ki count

    // LinkedList ka constructor
    public ReverseLinkedListOptimal(){
        this.head=null;    // Starting mein koi Node nahi hai
        this.tail=null;    // Starting mein koi last Node nahi hai
        this.size=0;       // Starting mein 0 Nodes hain
    }
    
    // LinkedList ko display/print karne ka method
    public void displayList(){

        // Traversal head se start karenge
        Node temp=head;

        // Jab tak temp null nahi hai,
        // tab tak Nodes ko print karte rahenge
        while(temp!=null){

            // Current Node ka data print karo
            System.out.print(temp.data+",");

            // Current Node ka next Node nikalo
            Node tempKaNext=temp.next;

            // temp ko next Node par move karo
            temp=tempKaNext;
        }

        // Next output ko new line mein print karne ke liye
        System.out.println();
    }

    // LinkedList ke last mein new Node add karna
    public void addLast(int val){

        // Given value ka new Node banao
        Node newNode=new Node(val);

        // Agar head null hai, matlab LinkedList empty hai
        if(head==null){//0 nodes

            // New Node hi first Node banega
            head=newNode;

            // New Node hi last Node bhi banega
            tail=newNode;
        }

        else{

            // Purane last Node ke next mein new Node ko connect karo
            tail.next=newNode;

            // Ab new Node hi last Node hai
            tail=newNode;
        }

        // Ek Node add hua, isliye size 1 se increase karo
        this.size++;
    }


    // LinkedList ko iteratively reverse karne ka method
    public void revLLOptimal(){

        // Starting mein previous Node nahi hai
        Node prev=null;

        // Reversal head se start hoga
        Node current=head;

        // Jab tak current null nahi hai,
        // tab tak reversal karte rahenge
        while(current!=null){

            // Current ka next Node pehle save kar lo
            // Taaki next Node ka reference lose na ho
            Node currentKaNext=current.next;

            // Current ka next ab previous Node ko point karega
            // Yahin par actual link reverse ho raha hai
            current.next=prev;

            // Prev ko current Node par move karo
            prev=current;

            // Current ko saved next Node par move karo
            current=currentKaNext;
        }

        // Reversal ke baad purana head last Node ban gaya
        tail=head;

        // Prev ab new head ko point kar raha hai
        head=prev;
    }


}


// Main class
class RevLinkedListOptimalMain{
    public static void main(String[] args) {

        // Empty LinkedList create karo
        ReverseLinkedListOptimal ll=new ReverseLinkedListOptimal();

        // LinkedList mein Nodes add karo
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        // Display the complete LinkedList
        ll.displayList();

        // LinkedList ko reverse karo
        ll.revLLOptimal();

        // Reversed LinkedList ko display karo
        ll.displayList();

        
    }
}
