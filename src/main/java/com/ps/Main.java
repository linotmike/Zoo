package com.ps;
import java.util.Scanner;

public class Main {
        static Scanner scanner = new Scanner(System.in);
        Zoo [] animals = new Zoo[10];
    public static void main(String[] args) {
        int mainMenuCommand;

        do{
            System.out.println("Hello What would you like to do today?");
            System.out.println("1) Add animal");
            System.out.println("2) Display animal");
            System.out.println("0) Exit");
            mainMenuCommand = scanner.nextInt();
            switch(mainMenuCommand){
                case 1:
//                    addAnimal();
                    break;
                case 2:
//                    displayAnimal();
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("command not found");
            }

        }while(mainMenuCommand != 0);




    }
}