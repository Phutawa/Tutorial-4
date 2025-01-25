package Practice.ADT;

import java.util.Scanner;

/*
 * 672115037
 * Phutawan mueangma
 * ADT tutorial 4
 */
public class QueueMain {
    public static void main(String[] args) {
        QueueClass queue = new QueueClass(5);
        Scanner Name =new Scanner(System.in);

        boolean Quit = false;
        while (Quit != true) {
            System.out.println("Please input names (Enter " + "quit" + " if you want to exit the program.) : ");
            String Input = Name.nextLine();

            if ((Input).toLowerCase().equals("quit")){
                Quit = true;
            } else {
                queue.enqueue(Input);
                queue.PrintQ();
            }
        }
        queue.dequeue();
        queue.PrintQ();
        
    }
}
