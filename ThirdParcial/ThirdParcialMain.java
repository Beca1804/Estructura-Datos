package ThirdParcial;

public class ThirdParcialMain {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(100);
        list.insert(200);
        list.insert(300);

        System.out.println("List forward:");
        list.displayForward();

        System.out.println("List backward:");
        list.displayBackward();

        System.out.println("Is 200 in the list? " + list.search(200));

        list.delete(200);

        System.out.println("After deleting 200:");
        list.displayForward();
    }
}

    

