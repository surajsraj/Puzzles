/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        return root?.let {
            root.left?.let { left -> left.`val` < root.`val` } ?: true
                    && root.right?.let { right -> right.`val` > root.`val` } ?: true
                    && isValidBST(root.left)
                    && isValidBST(root.right)
        } ?: true
    }
}