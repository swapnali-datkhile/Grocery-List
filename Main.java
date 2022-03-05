package SwapnaliLearnsJava.com;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }



    }
    public static void printInstructions(){

        System.out.println( "0. print instructions \n"+
                "1. print items in grocery list \n"+
                "2. add item to list \n"+
                "3. modify item \n"+
                "4. remove item \n"+
                "5. search item \n"+
                "6. Quit ");
    }
    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(itemNo,newItem);
        System.out.println("Item modified successfully");


    }

    public static void removeItem(){
        System.out.println("Enter item to be removed: ");
        String itemNo = scanner.nextLine();
        if(groc)
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) >=0 ){
            System.out.println("Found "+ searchItem + " in our grocery list");
        }else {
            System.out.println(searchItem + " is not found in the list");
        }
    }
}
