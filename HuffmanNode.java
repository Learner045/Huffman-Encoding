package HuffmanEncoding;

public class HuffmanNode extends HuffmanTree {

    //node is used to connect 2 huffman trees..left & right tree...
    private HuffmanTree rightTree;
    private HuffmanTree leftTree;  //our node will hold 2 trees

    public HuffmanNode(HuffmanTree rightTree,HuffmanTree leftTree) {
        super(rightTree.getFrequency()+leftTree.getFrequency()); //when we connect 2 trees..parent should hold its sum of freq
        this.rightTree=rightTree;
        this.leftTree=leftTree;
    }

    public HuffmanTree getRightTree() {
        return rightTree;
    }

    public void setRightTree(HuffmanTree rightTree) {
        this.rightTree = rightTree;
    }

    public HuffmanTree getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(HuffmanTree leftTree) {
        this.leftTree = leftTree;
    }
}
