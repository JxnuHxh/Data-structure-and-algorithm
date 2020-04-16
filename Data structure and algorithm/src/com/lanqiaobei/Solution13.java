package com.lanqiaobei;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/4/16 22:48
 */
public class Solution13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strA = input.next();
        String strB = input.next();
        game(strA, strB);
    }
    /**
     * 游戏开始
     * @param strA
     * @param strB
     */
    private static void game(String strA, String strB) {
        Stack<String> stack = new Stack<String>();
        while(true){
            while(true){
                String a = strA.substring(0, 1);  //取出一张牌
                strA = strA.substring(1);   //剩余的牌
                String temp = isWin(stack, a, strA);  //判断是否可赢牌
                if(temp.equals(strA)){   //如果没赢牌，自己的牌不会发生变化，轮到对手
                    break;
                }else{
                    strA = temp;    //如果赢牌了，自己还将继续游戏
                }
            }
            if(strA.length() == 0 ){    //当自己的牌变为0张的时候，结束比赛，对手无需再下牌
                break;
            }
            while(true){
                String b = strB.substring(0, 1);
                strB = strB.substring(1);
                String temp = isWin(stack, b, strB);
                if(temp.equals(strB)){
                    break;
                }else{
                    strB = temp;
                }
            }
            if(strB.length() == 0){
                break;
            }
        }

        if(strA.length() > strB.length()){   //输出手中有牌选手的手牌
            System.out.println(strA);
        }else{
            System.out.println(strB);
        }
    }
    /**
     * 判断是否可赢牌
     * @param stack
     * @param a
     * @param str
     * @return
     */
    private static String isWin(Stack stack, String a, String str) {
        if(stack.search(a)>0){   //如果存在和a一样的牌
            str += a;    //把a牌放在最后一位
            while(true){
                String temp = (String)stack.pop();
                str += temp;    //把桌面上的牌倒着一张张放到最后的位置
                if(temp.equals(a)){   //一直放到和a牌一样的牌为止
                    break;
                }
            }
        }else{
            stack.push(a);   //没有和a牌一样的牌，放在桌面牌的最后位置
        }
        return str;   //返回自己的牌
    }
}