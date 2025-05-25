import java.util.*;

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        boolean[] vis = new boolean[leaves + 1]; // 1-based indexing
        Set<Integer> seen = new HashSet<>();
        int count = leaves;

        for (int i = 0; i < N; i++) {
            int jump = frogs[i];

            // Skip if already processed this jump or if jump > leaves
            if (jump == 0 || jump > leaves || seen.contains(jump)) continue;
            seen.add(jump);

            for (int pos = jump; pos <= leaves; pos += jump) {
                if (!vis[pos]) {
                    vis[pos] = true;
                    count--;
                }
            }
        }

        return count;
    }
}
