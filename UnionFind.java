
public class UnionFind {
    private int[] parent;
    private int[] depth;
    private int rootX, rootY;
    private int length;
 
    UnionFind(int length) {
        this.length = length;
        parent = new int[length];
        for (int i = 0; i < length; i++) {
            parent[i] = i;
        }
        depth = new int[length];
    }
 
    private int getRoot(int x) {
        if (parent[x] == x) {
            return x;
        } else {
            return parent[x] = getRoot(parent[x]);
        }
    }
 
    void makeSame(int x, int y) {
        rootX = getRoot(x);
        rootY = getRoot(y);
        if (rootX == rootY) {
            return;
        } else if (depth[rootX] > depth[rootY]) {
            parent[rootY] = parent[rootX];
        } else {
            parent[rootX] = parent[rootY];
            if (depth[rootX] == depth[rootY]) {
                depth[rootY]++;
            }
        }
    }
 
    boolean isSame(int x, int y) {
        return getRoot(x) == getRoot(y);
    }    
}
