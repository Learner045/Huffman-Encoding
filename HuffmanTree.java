package HuffmanEncoding;

public class HuffmanTree implements Comparable<HuffmanTree> {

    protected int frequency;

    public HuffmanTree(int freq){
        this.frequency=freq; //we need to assign a frequency to character
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public int compareTo(HuffmanTree otherTree) {
        //we need to tell java how we want to compare huffmantree...based on what val
        return Integer.compare(this.frequency,otherTree.getFrequency());
    }
}
