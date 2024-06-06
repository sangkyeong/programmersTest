package programmersTest;

import java.util.*;

public class test240606_1236_LV2_AllPossibleFullBinaryTrees {

	public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
	private static Map<Integer, List<TreeNode>> memo = new HashMap<>();
    public static List<TreeNode> solution(int n) {

		//짝수의 경우는 자식노드의 0또는 2만을 취급한다는 조건을 위반하므로 빈값을 반환
		if (n % 2 == 0) {
			return new ArrayList<TreeNode>();
		}

		//노드가 하나라면 하나의 루트노드만 반환
		if (n == 1) {
			return Arrays.asList(new TreeNode());
		}

		if (memo.containsKey(n)) {
			return memo.get(n);
		}

		List<TreeNode> res = new ArrayList<TreeNode>();
		for (int i = 1; i < n; i += 2) {
			List<TreeNode> left = solution(i);

			//전체노드 - 왼쪽노드 - 루트노드
			List<TreeNode> right = solution(n - i - 1);

			for (TreeNode l : left) {
				for (TreeNode r : right) {
					TreeNode root = new TreeNode(0, l, r);
					res.add(root);
				}
			}
		}

		memo.put(n, res);
		return res;
	}

	public static void main(String[] args){
		int new_id = 7;
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
