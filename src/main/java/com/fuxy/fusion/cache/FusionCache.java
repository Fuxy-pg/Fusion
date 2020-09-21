package com.fuxy.fusion.cache;

import java.util.Arrays;

/**
 * 缓存管理类，用来缓存Fusion聚合过程中查询的结果，针对同一查询结果，在短时间内，
 * 两次请求的结果相同，且第二次的请求数据不会再去进行查询操作，而是直接使用第一次
 * 的查询结果。
 *
 * <p>目前的缓存设计是采用的内存+redis的二级缓存策略</p>
 *
 * {@link }
 *
 *
 * @author JasonFuxy
 */
public class FusionCache {
    private static final int UNCOLORED = 0;
    private static final int RED = 1;
    private static final int GREEN = 2;
    private int[] color;
    private boolean valid;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        valid = true;
        color = new int[n];
        Arrays.fill(color, UNCOLORED);
        for (int i = 0; i < n && valid; ++i) {
            if (color[i] == UNCOLORED) {
                dfs(i, RED, graph);
            }
        }
        return valid;
    }

    public void dfs(int node, int c, int[][] graph) {
        color[node] = c;
        int cNei = c == RED ? GREEN : RED;
        for (int neighbor : graph[node]) {
            if (color[neighbor] == UNCOLORED) {
                dfs(neighbor, cNei, graph);
                if (!valid) {
                    return;
                }
            } else if (color[neighbor] != cNei) {
                valid = false;
                return;
            }
        }
    }

}
