public class Main {
    public static void main(String[] args) {
        RedBlackTree node = new RedBlackTree();

        node.insert(10);
        node.incorder();
        System.out.println("\n");
        node.insert(20);
        node.incorder();
        System.out.println("\n");
        node.insert(40);
        node.incorder();
        System.out.println("\n");
        node.insert(-30);
        node.incorder();
        System.out.println("\n");
        node.insert(-46);
        node.incorder();
        System.out.println("\n");
        node.insert(-555);
        node.incorder();
        System.out.println("\n");
        node.insert(-5555);
        node.incorder();
        System.out.println("\n");
        node.insert(552355);
        node.incorder();
        System.out.println("\n");
    }
}