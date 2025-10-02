package com.String.Basic;

public class ConvertToDollar {
    public static void toDollar(String s) {
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                ch[i + 1] = '$';
            }
        }

        System.out.println(new String(ch));
    }

    public static void main(String[] args) {
        toDollar("Bossess"); // Output: Bos$e$s
    }
}
