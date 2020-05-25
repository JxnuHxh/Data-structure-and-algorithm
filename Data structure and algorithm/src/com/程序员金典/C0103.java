package com.程序员金典;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.程序员金典
 * @date 2020/5/25 18:43
 */
public class C0103 {
    public String replaceSpaces(String S, int length) {
        char[] chs = S.toCharArray();
        int i = length-1, j = S.length()-1;
        while(i>=0){
            if(chs[i]==' '){
                chs[j--] = '0';
                chs[j--] = '2';
                chs[j--] = '%';
            }else{
                chs[j--] = chs[i];
            }
            i--;
        }
        return String.valueOf(chs,j+1, S.length()-j-1);
    }
}
