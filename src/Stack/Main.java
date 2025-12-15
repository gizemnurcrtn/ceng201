package Stack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println("---Stack Uygulaması Başlatılıyor---");
        stack.printList();
        System.out.println();

        //push
        stack.push(10);
        stack.printList();
        stack.push(20);
        stack.printList();
        stack.push(30);
        stack.printList();
        stack.push(40);
        stack.printList();
        stack.push(50);
        stack.printList();

        //pop
        int popped = stack.pop();
        System.out.println("Deleted Node(Pop): " + popped);
        stack.printList();

        //delete middle node
        int deleted = stack.deleteMiddle();
        System.out.println("Deleted Node(Delete): " + deleted);
        stack.printList();
    }
}
