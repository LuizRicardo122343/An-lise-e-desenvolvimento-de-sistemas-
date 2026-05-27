package arvores;
public class Stack {

    public static void main(String[] args) {
        ArvoreAVL avl = new ArvoreAVL();
        avl.add(7);//raiz
        avl.add(8);
        avl.add(2);
        avl.add(5);
        avl.add(8);
        avl.add(3);
        avl.add(5);
        avl.add(10);
        avl.add(4);

        
        avl.inOrdem();
        System.out.println();
        avl.remove(2);
        avl.inOrdem();
        System.out.println();
        avl.remove(10);
        avl.inOrdem();
        System.out.println();


        avl.busca(7);
    }
}
