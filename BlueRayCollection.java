public class BlueRayCollection {
    private Node head = null;
    public void add (BlueRayDisk disk) {

        Node temp = new Node(disk);

        temp.next = null;
        if (head == null) {
            head = temp;
        }
        else {
            Node current = head;

            while(current.next != null) {
                current = current.next;
            }
            current.next = temp;

        }
    }
    public void show_all () {
        Node temp = head;

        while (temp!=null) {
            System.out.println (temp.data);
            temp = temp.next;
        }
    }

}
