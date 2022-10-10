package Practical4;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        Queue q = new Queue(10);


        s.display();
        q.display();

        s.enqueue(20);
        q.enqueue(20);

        s.display();
        q.display();

        System.out.println(s.dequeue());
        System.out.println(q.dequeue());

        s.display();
        q.display();

        s.getSize();
        q.getSize();
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}
