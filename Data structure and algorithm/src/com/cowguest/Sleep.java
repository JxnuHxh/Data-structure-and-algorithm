package com.cowguest;

import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int cLength = sc.nextInt();//这节课的时长：分钟数
            int lLength = sc.nextInt();//提醒一次能清醒的分钟数
            int [] sumAll = new int[cLength + 1];//表示每分钟所有兴趣点相加
            int [] sumBefore = new int[cLength + 1];//表示有效(醒着)的兴趣值相加
            int maxInterst = 0;//叫醒后产生的最大听课效益
            int sub;//表示 叫醒后lLength分钟的兴趣点 - 之前 llength分钟xing'qu'dia
            int[] intrests = new int[cLength];
            int[] isSleep = new int[cLength];
            for (int i = 0; i < cLength; i++) {
                intrests[i] = sc.nextInt();
                sumAll[i + 1] += intrests[i] + sumAll[i];
            }

            for (int k = 0; k < cLength; k++) {
                isSleep[k] = sc.nextInt();
                if (isSleep[k] == 1)
                    sumBefore[k+1] += sumBefore[k] + intrests[k];
                else
                    sumBefore[k+1] =sumBefore[k];
            }
            /*以上为输入环节*/

            //边界条件
            if(lLength >= cLength) {
                System.out.println(sumAll[cLength]);
                return;
            }
            if(lLength < 1){
                System.out.println( sumBefore[cLength]);
                return;
            }

            // 1<= llength <clength
            for (int i = 0 ;i < cLength; i++){
                // 提醒后 清醒的时间段 在上课时间内，就是提醒效果在上课时间内有效
                if (i + lLength -1 < cLength && isSleep[i] == 0){
                    sub = (sumAll[i +lLength] - sumAll[i]) - (sumBefore[i +lLength] - sumBefore[i]);
                    if(sub > maxInterst)
                        maxInterst = sub;
                    //提醒效果还有，但是已经下课了。
                }else if (i + lLength -1 >= cLength && isSleep[i] == 0){
                    sub = (sumAll[cLength] - sumAll[i]) - (sumBefore[cLength] - sumBefore[i]);
                    if(sub > maxInterst)
                        maxInterst = sub;
                }
            }
            System.out.println(maxInterst + sumBefore[cLength]);
        }
}
