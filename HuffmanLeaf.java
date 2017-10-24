package HuffmanEncoding;

public class HuffmanLeaf extends HuffmanTree{

    //leaf hold the actual character whereas node are just used to provide a structure & connect leafs with codes
    private char value; //its leaf so no children by definition

    public HuffmanLeaf(int freq) {
        super(freq);
    }

    public HuffmanLeaf(int frequency,char value){
        super(frequency);
        this.value=value;
    }


    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}
