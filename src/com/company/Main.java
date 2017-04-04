package com.company;

import java.util.Scanner;

public class Main {

    int fibonacci(int until) {
        if (until==0){
            return 0;
        }else if (until==1||until==2){
            return 1;
        }else {
            return fibonacci(until-1)+fibonacci(until-2);
        }

    }
    public static void main(String[] args) {
        // write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("how many values of Fibonacci sequence would you like to see?");
        int length=input.nextInt();
        int i=0;
        while (i<=length){
            System.out.print(new Main().fibonacci(i));
            i++;
            if (i<=length)
                System.out.print(",");
        }
    }
}
