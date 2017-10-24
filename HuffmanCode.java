package HuffmanEncoding;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class HuffmanCode {


    public HuffmanTree buildTree(int[] charFrequencies){
        //first we need to initialize leafs
        //then we need to keep them in sorted order..so that we can begin our connecting process
        //connect leafs till u make a tree with single node
        PriorityQueue<HuffmanTree>queue=new PriorityQueue<>();

        //making the table..with char & its freq
        for(int i=0;i<charFrequencies.length;i++){
            if(charFrequencies[i]>0){
                queue.add(new HuffmanLeaf(charFrequencies[i],(char)i)); //at the bigining all. nodes are leafs
            }
        }

        while(queue.size()>1){
            HuffmanTree tree1=queue.poll();
            HuffmanTree tree2=queue.poll();

            queue.add(new HuffmanNode(tree2,tree1)); //we keep merging/connecting..until we are left with single item in queue..root
        }

        return queue.poll();//returning the root after all conecting
    }

    //if leaf then print..else explore left & right
    public void printCodes(HuffmanTree tree,StringBuilder prefix){

        if(tree instanceof HuffmanLeaf){
            HuffmanLeaf leaf=(HuffmanLeaf)tree; //casting it
            System.out.println(leaf.getValue()+" "+leaf.getFrequency()+" "+prefix);

        }else{

            //if its not leaf it had to be node
            HuffmanNode node=(HuffmanNode)tree;

            //visit its left & right subtrees
            prefix.append("0");//0 becuz left tree is being visited
            printCodes(node.getLeftTree(),prefix);
            prefix.deleteCharAt(prefix.length()-1); //we remove this as we are now visiting right..so backtrack

            prefix.append("1");
            printCodes(node.getRightTree(),prefix);
            prefix.deleteCharAt(prefix.length()-1);

        }

    }



}
