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
    public static void addAnimals(){

    }
    public static void displayAnimals(){
        int subMenuCommand;
        do{
            System.out.println("Please enter an option: ");
            System.out.println("1) Display All");
            System.out.println("2) Display publicly available");
            System.out.println("3) Search by name");
            System.out.println("4) Search by type");
            System.out.println("5) Search by age range");
            System.out.println("6) Search by origin");
            subMenuCommand = scanner.nextInt();


        }while(subMenuCommand != 0);

    }

}