package chap13_brain;

/**
 * Created by xing on 4/30/17.
 * 你和你的朋友正在玩棋子跳格子的游戏，而棋盘是一个由n个格子组成的长条，
 * 你们两人轮流移动一颗棋子，每次可以选择让棋子跳1-3格，先将棋子移出棋盘的人获得胜利。
 * 我们知道你们两人都会采取最优策略，现在已知格子数目，并且初始时棋子在第一格由你操作。
 * 请你计算你是否能获胜。
 * <p>
 * 给定格子的数目n(n为不超过300的正整数)。返回一个整数，1代表能获胜，0代表不能获胜。
 * <p>
 * 测试样例：
 * 3
 * 返回：1
 *
 * 注：
 *   经典博弈问题。需要采用逆向思维，如果对方移动n个，那么我移动4-n个，即可。
 *   如果对4取余得m，那么第一次取m个，然后后来每次根据对方的个数取4-n个就可以了。这时候保证最后能赢。
 */

import java.util.*;

public class Jump {
    public int checkWin(int n) {
        // write code here
        return (n - 1) % 4 == 0 ? 0 : 1;
    }
}