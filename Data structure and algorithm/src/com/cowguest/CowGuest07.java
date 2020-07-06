package com.cowguest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CowGuest07 {
    private static char[] chs;
    private static int i = 0;
    private static String exp() {
        StringBuilder sb = new StringBuilder();
        sb.append(term());
        while (i < chs.length) {
            if (chs[i] == '+' || chs[i] == '-') {
                char c = chs[i++];
                sb.append(term());
                sb.append(c);
            } else break;
        }
        return sb.toString();
    }

    private static String term() {
        StringBuilder sb = new StringBuilder();
        sb.append(num());
        while (i < chs.length) {
            if (chs[i] == '*' || chs[i] == '/') {
                char c = chs[i++];
                sb.append(num());
                sb.append(c);
            } else break;
        }
        return sb.toString();
    }

    private static String num() {
        return String.valueOf(chs[i++]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        chs = bf.readLine().toCharArray();
        System.out.println(exp());
    }
}