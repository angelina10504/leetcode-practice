/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int cameras=0;
    public int minCameraCover(TreeNode root) {
        if(solve(root)==-1) cameras++; //root not covered
        return cameras;
    }
    private int solve(TreeNode node){
        if (node ==null )return 1; //null=covered

        int left = solve(node.left);
        int right = solve(node.right);

        //any child not covered=camera placed
        if(left ==-1||right ==-1){
            cameras++;
            return 0;//node has camera
        }
        //child has camera->covered
        if(left==0||right==0){
            return 1; //node covered
        }

        return -1;
    }
}