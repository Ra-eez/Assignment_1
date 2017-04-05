// Slightly changed version of Hussein Suleman's BinarySearchTree
// 03 April 2017
// Moegamat Ra-eez Stenekamp
package assignment1.cs2009f;

public class BinarySearchTree<String extends Comparable<? super String>> extends BinaryTree<String>
{
   public void insert ( String k, String d )
   {  
      if (root == null)
         root = new BinaryTreeNode<String> (k, d, null, null);
      else
         insert (k, d, root);
   }
   public void insert ( String k, String d, BinaryTreeNode<String> node )
   {
      if (k.compareTo (node.key) <= 0)
      {
         if (node.left == null)
            node.left = new BinaryTreeNode<String> (k, d, null, null);
         else
            insert (k, d, node.left);
      }
      else
      {
         if (node.right == null)
            node.right = new BinaryTreeNode<String> (k, d, null, null);
         else
            insert (k, d, node.right);
      }
   }
   
   public BinaryTreeNode<String> find ( String d )
   {
      if (root == null)
         return null;
      else
         return find (d, root);
   }
   public BinaryTreeNode<String> find ( String d, BinaryTreeNode<String> node )
   {
      if (d.compareTo (node.data) == 0) 
         return node;
      else if (d.compareTo (node.data) < 0)
         return (node.left == null) ? null : find (d, node.left);
      else
         return (node.right == null) ? null : find (d, node.right);
   }
   //see if the key is the same and if so return data
   public String findKey(String d){
       if (root==null)
           return null;
       else
           return findKey(d,root);
       }
   
   public String findKey(String d, BinaryTreeNode<String> node){
       
       if (d.compareTo(node.key) == 0){
           return node.data;
       }
       else if (d.compareTo(node.key) < 0){
           return (node.left == null) ? null : findKey (d, node.left);
       }
       else
           return (node.right == null) ? null : findKey(d, node.right);
       
   }
   
   public void delete ( String d )
   {
      root = delete (d, root);
   }   
   public BinaryTreeNode<String> delete ( String d, BinaryTreeNode<String> node )
   {
      if (node == null) return null;
      if (d.compareTo (node.data) < 0)
         node.left = delete (d, node.left);
      else if (d.compareTo (node.data) > 0)
         node.right = delete (d, node.right);
      else if (node.left != null && node.right != null )
      {
         node.data = findMin (node.right).data;
         node.right = removeMin (node.right);
      }
      else
         if (node.left != null)
            node = node.left;
         else
            node = node.right;
      return node;
   }
   
   public BinaryTreeNode<String> findMin ( BinaryTreeNode<String> node )
   {
      if (node != null)
         while (node.left != null)
            node = node.left;
      return node;
   }

   public BinaryTreeNode<String> removeMin ( BinaryTreeNode<String> node )
   {
      if (node == null)
         return null;
      else if (node.left != null)
      {
         node.left = removeMin (node.left);
         return node;
      }
      else
         return node.right;
   }
   
}
