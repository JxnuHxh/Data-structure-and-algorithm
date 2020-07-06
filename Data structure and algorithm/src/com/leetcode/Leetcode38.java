package com.leetcode;
//外观数列
//就java来讲，可以借助StringBuilder来实现对前一项的描述。可以得到如下描述步骤：
//
//使用指针 i 和 指针 j 来对需要描述的字符 str 进行遍历，指针 i 指向 指针 j 的下一个位置，即 i = j + 1
//若 str.charAt(i) == str.charAt(j)时，指针 i 继续移动
//若 str.charAt(i) != str.charAt(j), 则把描述添加到StringBuilder中，stringBuilder.append(i -j).append(str.charAt(j))，其中 i - j 表示str.charAt(j) 元素的个数，并且指针 j 进行跳转，j = i
//推出循环后，还需要对末尾字符进行描述
//当前项的描述完成后，str = stringBuilder.toString()，将 j 回退为 0 以便对新的字符串进行描述 ，并且StringBuilder清空
//因为只需要知道前一个就可以进行描述 — 要得到n项, 只需要知道n-1项，所以也可以使用递归来进行求解。结束条件为 n = 1时，返回 "1"。代码也附在了后面。

public class Leetcode38 {
    public String countAndSay(int n) {
        // 只需要知道前一个就可以进行描述 - 要得到n项, 只需要知道n-1项
        String str = "1"; // 存储前一项所描述的信息
        StringBuilder stringBuilder = new StringBuilder();
        int i, j = 0;
        for(int k = 1; k < n; k++){
            for(i = j + 1; i < str.length(); i++){
                if (str.charAt(i) != str.charAt(j)){
                    // 进行添加
                    stringBuilder.append(i - j).append(str.charAt(j));
                    j = i;
                }
            }
            // 处理只有一个元素和最后一个元素
            stringBuilder.append(i - j).append(str.charAt(j));
            j = 0;
            str = stringBuilder.toString();
            stringBuilder.delete(0, stringBuilder.length());
        }
        System.out.println(str);
        return str;
    }
}

