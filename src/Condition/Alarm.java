package Condition;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args){


        Scanner sc= new Scanner(System.in);
        int h= sc.nextInt();
        int min= sc.nextInt();
        sc.close();


        if (min<45){
            h --; // 시 감소
            min= 60-(45-min); // 분 감소
            if(h<0){
                h=23;
            }
            System.out.println(h + " "+ min);
        } else {
            System.out.println(h + " " + (min-45));
        }


    }
}

