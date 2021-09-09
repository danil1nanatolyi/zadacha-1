package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = 0;
        boolean a= false;

        while(true) {
            String string = sc.nextLine();
            char[] charArray = string.toCharArray();

            for(char ch : charArray) {
                if(ch == ' ') b++;
                if(ch == '.') a = true;
            }

            if(a) break;
        }

        System.out.println(b);
    }
}


