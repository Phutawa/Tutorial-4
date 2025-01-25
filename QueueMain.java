package Practice.ADT;
/*
 * 672115037
 * Phutawan mueangma
 * ADT tutorial 4
 */
public class QueueMain {
    public static void main(String[] args) {
        QueueClass queue = new QueueClass(5);

        queue.enqueue("John");
        queue.PrintQ() ;

        queue.enqueue("Man");
        queue.PrintQ() ;

        queue.enqueue("Pree");
        queue.PrintQ() ;

        queue.dequeue();
        queue.PrintQ ();
    }
}
