package Practice.ADT;
/*
 * 672115037
 * Phutawan mueangma
 * ADT tutorial 4
 */
public class QueueClass {

    private static int FrontPointer     ;
    private static int EndPointer       ;
    private static int Capacity         ;
    public  static String[] QueueArray  ;

    public QueueClass(int Capacity){

        FrontPointer    = 0         ;
        EndPointer      = 0         ;
        this.Capacity   = Capacity  ;
        QueueArray = new String[Capacity];

    }

    public static void InitalizeQueue() {
        for(int i = 0 ; i < QueueArray.length ; i++){
            QueueArray[i] = null;
        }
    }

    public void enqueue(String value){
        if (isFull()){
            System.out.println("the queue is full can't enqueue !!");
        } else {
            QueueArray[EndPointer++] = value ;
            System.out.println("Enqueue " + value);
        }

    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("the queue is empty can't dequeue !!");
        } else {
            String ElementDequeue = " ";
            ElementDequeue = QueueArray[FrontPointer];
            System.out.println("Dequeue " + ElementDequeue);
            FrontPointer++;
        }
    }

    public int size(){
        int result = EndPointer - FrontPointer ;
        return result ;
    }

    public static boolean isFull(){
        return EndPointer == Capacity ;
    }

    public static boolean isEmpty(){
        return FrontPointer == EndPointer ;
    }

    public void PrintQ(){
        System.out.print("[");
        for (int i = FrontPointer ; i < Capacity ; i++){
            System.out.print(QueueArray[i] + ",");
        }
        System.out.print("]");
        System.out.println("[First : " +  FrontPointer + " ,rear : "+  EndPointer + " ,length : " + size() + "]"  );
        System.out.println();
    
    }
}
