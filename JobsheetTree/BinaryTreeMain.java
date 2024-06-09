package JobsheetTree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

       
        System.out.print("Hasil Traverse PreOrder:");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.print("Hasil Traverse InOrder:");
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.print("Hasil Traverse PostOrder:");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.print("Cari data dengan nilai 5:");
        System.out.println(" Find " + bt.find(5));

        System.out.print("Hapus data dengan nilai 8:");
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.print("Data pada Leaf: ");
        bt.printLeaf(bt.root);
        System.out.println(" ");

        System.out.println("Jumlah Leaf: " + bt.countLeaf(bt.root));
    }
}
