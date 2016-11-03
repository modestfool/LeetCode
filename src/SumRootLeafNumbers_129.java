/**
 * @author: basavakanaparthi
 * on 28,Oct,2016 at 8:04 PM.
 */
/*
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.
 */
public class SumRootLeafNumbers_129 {
    public static int sumNumbers(TreeNode root)
    {
        if (root == null)
            return 0;
        int decimal = 0;
        return sumNumbers(root, 0);
    }
    public static int sumNumbers(TreeNode root, int sumTill)
    {
        if (root == null)
            return sumTill;
        if (root.left == null && root.right == null)
            return sumTill*10 + root.val;
        sumTill = sumTill*10 + root.val;
        int Lsum = 0;
        int Rsum = 0;
        if (root.left != null)
            Lsum = sumNumbers(root.left, sumTill);
        if (root.right != null)
            Rsum = sumNumbers(root.right, sumTill);
        return Lsum + Rsum;
    }

    public static void main(String[] args) {
        Integer[] treeNodes = {3,9,20,null,null,15,7};
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
        System.out.println(sumNumbers(root));
    }
}
