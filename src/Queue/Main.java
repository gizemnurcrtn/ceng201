package Queue;

public class Main {
    public static void main(String[] args) {
        Queue qA = new Queue();
        Queue qB = new Queue();
        Queue qC = new Queue();

        //enqueue
        qA.enqueue(10);
        qA.enqueue(20);
        qA.enqueue(30);

        qB.enqueue(10);
        qB.enqueue(20);
        qB.enqueue(30);

        qC.enqueue(10);
        qC.enqueue(30);
        qC.enqueue(20);

        qA.display();
        qB.display();
        qC.display();
        System.out.println();

        //equal
        System.out.println("is qA and qB the same? " + qA.areEqual(qA,qB));
        System.out.println("is qA and qc the same? " + qA.areEqual(qA,qC));

        qC.enqueue(40);
        System.out.println("New size of qC size: " + qC.size);
        System.out.println("is qA and qc the same? " + qA.areEqual(qA,qC));
        System.out.println();

        //remove
        int dequeuedVal = qA.dequeue();
        System.out.println("dequeuedVal: " + dequeuedVal);
        qA.display();

        dequeuedVal = qB.dequeue();
        System.out.println("dequeuedVal: " + dequeuedVal);

        System.out.println("is qA and qB the same? " + qA.areEqual(qA,qB));
    }
}
