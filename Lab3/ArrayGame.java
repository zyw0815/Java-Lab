public class ArrayGame {
    public static boolean canWin(int[] game, int leap, int pos, boolean[] visited) {
        if (pos >= game.length) {
            return true;                     // 跳出数组，赢
        }
        if (pos < 0 || game[pos] == 1 || visited[pos]) {
            return false;                    // 出界 / 踩到 1 / 走过
        }

        visited[pos] = true;

        return canWin(game, leap, pos + leap, visited)     // 跳
            || canWin(game, leap, pos + 1, visited)        // 前进
            || canWin(game, leap, pos - 1, visited);       // 后退
    }

    public static void main(String[] args) {
        int[] game1 = {0, 0, 0, 1, 1, 1};
        boolean[] v1 = new boolean[game1.length];        System.out.println(canWin(game1, 5, 0, v1) ? "Yes" : "No");

        int[] game2 = {0, 1, 0};
        boolean[] v2 = new boolean[game2.length];
        System.out.println(canWin(game2, 1, 0, v2) ? "Yes" : "No");
    }
}
