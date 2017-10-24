package HuffmanEncoding;

public class HuffmanTest {

    public static void main(String[] args) {

        int frequencies[]=new int[256];
        String text=" My namea is Joiiii";

        for(char c:text.toCharArray()){
            ++frequencies[c];
        }

        HuffmanCode code=new HuffmanCode();
        HuffmanTree tree=code.buildTree(frequencies);

        code.printCodes(tree,new StringBuilder());

        //first..find frequencies of each char & store it in frequencies table
        //build tree using the freq table
        //trace the tree from root


}
}
