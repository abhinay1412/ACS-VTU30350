class Solution {
    private int matchingNodeCount = 0;

    public int averageOfSubtree(TreeNode root) {
        matchingNodeCount = 0;
        calculateSubtreeStats(root);
        return matchingNodeCount;
    }

    // Returns an array: [subtree_sum, node_count]
    private int[] calculateSubtreeStats(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        // 1. Traverse left and right subtrees (Post-Order)
        int[] leftStats = calculateSubtreeStats(node.left);
        int[] rightStats = calculateSubtreeStats(node.right);

        // 2. Combine results for the current node
        int currentSum = leftStats[0] + rightStats[0] + node.val;
        int currentCount = leftStats[1] + rightStats[1] + 1;

        // 3. Check if node's value equals the floor average of its subtree
        if (node.val == (currentSum / currentCount)) {
            matchingNodeCount++;
        }

        return new int[]{currentSum, currentCount};
    }
}