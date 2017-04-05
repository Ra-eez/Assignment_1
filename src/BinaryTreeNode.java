// Slightly changed version of Hussein Suleman's Binary Tree
// 03 April 2017
// Moegamat Ra-eez Stenekamp
package assignment1.cs2009f;

public class BinaryTreeNode<String>
{
   String data;
   String key;
   BinaryTreeNode<String> left;
   BinaryTreeNode<String> right;
   
   public BinaryTreeNode ( String k, String d, BinaryTreeNode<String> l, BinaryTreeNode<String> r )
   {
      key = k;
      data = d;
      left = l;
      right = r;
   }
 
   BinaryTreeNode<String> getLeft () { return left; }
   BinaryTreeNode<String> getRight () { return right; }
}
