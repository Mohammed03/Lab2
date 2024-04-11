/**
 * @author Mohammed Mohideen
 */

class Node{
   int value;
   Node left, right;
   
   public Node(int value){
      this.value = value;
      left = null;
      right = null;
   }

}

class BinarySearchTree{

   Node root;
   
   
   /*
   recursive insert method
   */
   public Node insert(Node root, int value){
      //base case
      if(root == null){
         root = new Node(value);
         return root;
      }
      
      //recursive step
      if(value < root.value){
         root.left = insert(root.left, value); 
      }else{
         root.right = insert(root.right, value);
      }
      
      return root;
   }
   
   
   
   /**

   pre-order traversal
   @param root Root of the tree
   */
   public void preOrderTraversal(Node root){
      //base case
      if(root == null){
         return;
      }

      System.out.print(root.value+" ");
      //go left recursively
      preOrderTraversal(root.left);
      //go right recursively
      preOrderTraversal(root.right);
   }
   }



   /**

    in-order traversal
    @param root Root of the tree
    */
   public void inOrderTraversal(Node root){
      //base case
      if(root == null){
         return;
      }

      //go left recursively
      inOrderTraversal(root.left);
      //process the root
      System.out.print(root.value+" ");
      //go right recursively
      inOrderTraversal(root.right);
   }
   }



   /**

    post-order traversal
    @param root Root of the tree
    */
   public void postOrderTraversal(Node root){
        //base case
        if(root == null){
        return;
        }

        //go left recursively
        postOrderTraversal(root.left);
        //go right recursively
        postOrderTraversal(root.right);
        //process the root
        System.out.print(root.value+" ");
        }



   /**
   a method to find the node in the tree
   with a specific value
    @param root Root of the tree
    @param key Index to find

    @return boolean
   */
   public boolean find(Node root, int key){
	  //implement me
      return false;           
   }



   /**
   a method to find the node in the tree
   with a smallest key
    @param root Root of the tree
    @return int Minimum number in tree
   */
   public int getMin(Node root){
      //implement me
   }



   /**
   a method to find the node in the tree
   with a largest key
    @param root Root of the tree
    @return int returns max number in tree
   */
   public int getMax(Node root){
	  //implement me
   }
   
   
   
   /*
   this method will not compile until getMax
   is implemented
   */
   public Node delete(Node root, int key){
      
      if(root == null){
         return root;
      }else if(key < root.value){
         root.left = delete(root.left, key);
      }else if(key > root.value){
         root.right = delete(root.right, key);
      }else{
         //node has been found
         if(root.left==null && root.right==null){
            //case #1: leaf node
            root = null;
         }else if(root.right == null){
            //case #2 : only left child
            root = root.left;
         }else if(root.left == null){
            //case #2 : only right child
            root = root.right;
         }else{
            //case #3 : 2 children
            root.value = getMax(root.left);
            root.left = delete(root.left, root.value);
         }
      }
      return root;  
   }
   
   
   
}



public class TreeDemo{
   public static void main(String[] args){
      BinarySearchTree t1  = new BinarySearchTree();
      t1.insert(24);
      t1.insert(80);
      t1.insert(18);
      t1.insert(9);
      t1.insert(90);
      t1.insert(22);
            
      System.out.print("in-order :   ");
      t1.inOrderTraversal(t1.root);
      System.out.println();
           
      
   }  
}