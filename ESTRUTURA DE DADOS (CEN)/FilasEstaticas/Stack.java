package FilasEstaticas;

public class Stack {
    public static void main(String[] args) {

        Fila f = new Fila(10);

        System.out.println(f.isFull());
        System.out.println(f.isEmpty());

        f.enqueue(8);//0
        f.enqueue(24);//1
        f.enqueue(47);//2
        f.enqueue(78);//3
        f.enqueue(91);//4

        f.enqueue(6);//5
        f.enqueue(9);//6
        f.enqueue(12);//7
        f.enqueue(15);//8
        f.enqueue(18);//9


        System.out.println(f.isEmpty());
        System.out.println(f.isFull());

        System.out.println(f.dequeue());
        System.out.println(f.dequeue());



        System.out.println(f.peek());



        







        
        







        
    

    }
    
}
