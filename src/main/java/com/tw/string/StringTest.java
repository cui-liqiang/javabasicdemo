package com.tw.string;

import java.lang.String;

public class StringTest {
    public static void main(String[] args) {
        //point to the same memory space for same strings
        String str1 = "abcd";
        String str2 = "abcd";

        //allocate memory again for new string
        String str3 = str1 + str2;

        //use StringBuffer to build string
        StringBuffer sb = new StringBuffer("");
        sb.append("first line");
        sb.append("first second");

        System.out.println(sb.toString());
    }
}