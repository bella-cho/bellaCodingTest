package Condition;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){


        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();

a
        if(a%4==0){
            if (a%400==0){
                System.out.println("1");
            } else if (a%100==0) {
                System.out.println("0");
            } else {
                System.out.println("0");
                //if .. else if.. else 로 마무리해야함
            }
        } else {
            System.out.println("0");
        }




    }
}

