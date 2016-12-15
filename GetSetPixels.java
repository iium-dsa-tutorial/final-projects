

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.List;
import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;




public class GetSetPixels{
	
	static ArrayList<Node> nodes=new ArrayList<Node>();
	static class Node 
	{ 
		int data; 
		boolean visited; 
		Node(int data) 
		{ 
			this.data=data; 
			}
		}
	
  public static void main(String args[])throws IOException{
	  
	  Node node40 =new Node(40);
	  nodes.add(node40);
	  
	  
    BufferedImage img = null;  //BufferedImage.TYPE_INT_ARGB;
    File f = null;

    //read image
    try{
      f = new File("C:\\Users\\Taufiq syahmi\\Desktop\\rainbow.jpg");
      img = ImageIO.read(f);
    }catch(IOException e){
      System.out.println(e);
    }

    int k;
    int t;
    //get image width and height
    int z = img.getWidth();
    int x = img.getHeight();

    //get pixel value
    int p = img.getRGB(0,0);

    

    
    System.out.println(z);
    System.out.println(x);
    int[][] array1=new int[z][x];
    for( k=0;k<z;k++){
    	for(t=0;t<x;t++){
			array1[k][t] = (Math.abs(img.getRGB(k,t))); // or whatever
    	     System.out.print(array1[k][t]+" ");
    	    
    	}
    	System.out.println();
    }//ending of loop

    GetSetPixels getsetpixels= new  GetSetPixels();
    
    System.out.println("The DFS traversal of the graph using stack "); 
    getsetpixels.dfsUsingStack(array1, node40 ); 
    
  }
    
    
  
	//main() ends here

  //use dfs graph
  
  
private void dfsUsingStack( int array1 [][], Node node40) {
	
	Stack<Node> stack=new Stack<Node>(); 
	stack.add(node40); 
	node40.visited=true;
	while (!stack.isEmpty())
	{ 
		Node element=stack.pop(); 
		System.out.print(element.data + "\t");
		ArrayList<Node> neighbours=findNeighbours(array1,element);
		for (int i = 0; i < neighbours.size(); i++) {
			Node n=neighbours.get(i);
			if(n!=null && !n.visited) 
			{
				stack.add(n); n.visited=true; 
				}
			}
		
	
	
	
	
}






}

	private ArrayList<Node> findNeighbours(int[][] array1, Node x) {
	
		int nodeIndex=-1;
		ArrayList<Node> neighbours=new ArrayList<Node>(); 
		for (int i = 0; i < nodes.size(); i++) {
			if(nodes.get(i).equals(x)) 
			{ 
				nodeIndex=i; break; 
				} }
		if(nodeIndex!=-1) 
		{
			for (int j = 0; j < array1[nodeIndex].length; j++) { 
				if(array1[nodeIndex][j]==1) 
				{
					neighbours.add(nodes.get(j)); 
					} 
				}
			} return neighbours; 
			}
	
	
}//class ends here   


