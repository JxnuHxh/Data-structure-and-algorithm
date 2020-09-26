package com.面试笔试;
//36进制转10进制
import java.util.Scanner;
public class Main02 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String  str = sc.nextLine();
        char[] chars=str.toCharArray();
        long result = 0,p=0;
        for(int i = chars.length-1;i>=0;i--){
            if((chars[i]>='0'&&chars[i]<='9')){
                result  = (long) (result +((chars[i]-'0')*(Math.pow(36,p))));
            }else if(chars[i]>='a'&&chars[i]<='z') {
                result  = (long) (result +(((chars[i] - 'a')+10)*(Math.pow(36,p))));
            }else{
                System.out.println(0);
                return ;
            }
            p++;
        }
        System.out.println(result);
    }
}