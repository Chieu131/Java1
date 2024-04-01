package com.dt;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = input.nextLine();

        ValidateUtils utils = new ValidateUtils();
        String message = utils.checkEmail( email );

        System.out.println(message);
    }
}
