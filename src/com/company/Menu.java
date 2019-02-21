package com.company;
import java.util.*;



public class Menu {
    Customer customer;
    Mall mall;
    Store shoeStore;
    Store gameStore;
    Store bookStore;
    Scanner sc = new Scanner(System.in);

    Item boots;
    Item trainers;
    Item socks;
    Item derby;
    Item pump;

    Item gta;
    Item mortalCombat;
    Item injustice;
    Item battlfield;
    Item callOfDuty;

    Item harryPotter;
    Item oneHundredYears;
    Item wutheringHeights;
    Item prideAndPrejudice;
    Item resurrection;


    public Menu(){
        Clear();

        customer = new Customer("Alice");
        mall = new Mall("Big Mall");
        shoeStore = new Store("Kimex", 0);
        gameStore = new Store("Meloman", 1);
        bookStore = new Store("Flibusta", 2);

        mall.addStore(shoeStore);
        mall.addStore(gameStore);
        mall.addStore(bookStore);

        boots = new Item("Boots", 1, 100);
        trainers = new Item("Trainers", 2, 150);
        socks = new Item("Socks", 3, 60);
        derby = new Item("Derby", 4, 100);
        pump = new Item("Pump", 5, 190);

        gta = new Item("Grand The Auto 5", 6, 250);
        mortalCombat = new Item("Mortal Combat", 7, 270);
        injustice = new Item("Injustice: among the gods", 8, 270);
        battlfield = new Item("Battlefield 6", 9, 270);
        callOfDuty = new Item("Call of duty: modern warfare", 10, 170);

        harryPotter = new Item("Harry Potter", 11, 10);
        oneHundredYears = new Item("One hundred years", 12, 23);
        wutheringHeights = new Item("Wuthering Heights", 13, 3);
        prideAndPrejudice = new Item("Pride and Prejudice", 14, 15);
        resurrection = new Item("Resurrection", 15, 34);

    }

    public void Start(){
        Clear();


        System.out.println("Welcome to " + mall.toString()+ " " + customer.name + "\n");
        System.out.println("Tip: type 1 to go to " + shoeStore.name);
        System.out.println("1." + shoeStore.name + "   " + "2." + gameStore.name + "   " + "3." + bookStore.name + "   " +
                "4." + "Go to Cart" + "   " + "5." + "exit");

        String ans = sc.next();

        switch (ans) {
            case  ("1"):
                ShoeStore();
                break;
            case ("2"):
                GameStore();
                break;
            case ("3"):
                BookStore();
                break;
            case ("4"):
                Cart();
                break;
            case ("5"):
                Exit();
                break;
            default:
                Start();
                break;
        }

    }

    public void ShoeStore(){
        Clear();

        System.out.println("Welcome to " + shoeStore.name + " " + customer.name + "\n");
        System.out.println("Press any number to add good to youre ShoppingCart");

        System.out.println("1." + boots.name + " " +boots.price + "$   " + "2." + trainers.name + " " +trainers.price + "$   " + "3." + socks.name + " " +socks.price + "$   " +
                "4." + derby.name + " " +derby.price + "$   " + "5." + pump.name + " " + pump.price + "$   " + "6." + "Go to Cart" + "   " + "7." + "main menu");

        String ans1 = sc.next();

        switch (ans1) {
            case  ("1"):
                customer.shoppingCart.addItem(boots);
                ShoeStore();
                break;
            case ("2"):
                customer.shoppingCart.addItem(trainers);
                ShoeStore();
                break;
            case ("3"):
                customer.shoppingCart.addItem(socks);
                ShoeStore();
                break;
            case ("4"):
                customer.shoppingCart.addItem(derby);
                ShoeStore();
                break;
            case ("5"):
                customer.shoppingCart.addItem(pump);
                ShoeStore();
                break;
            case ("6"):
                Cart();
                break;
            case ("7"):
                Start();
                break;
            default:
                ShoeStore();
                break;
        }
    }

    public void GameStore(){
        Clear();

        System.out.println("Welcome to " + gameStore.name + " " + customer.name + "\n");
        System.out.println("Press any number to add good to youre ShoppingCart");

        System.out.println("1." + gta.name + " " +gta.price + "$   " + "2." + mortalCombat.name + " " +mortalCombat.price + "$   " + "3." + injustice.name + " " +injustice.price + "$   " +
                "4." + battlfield.name + " " +battlfield.price + "$   " + "5." + callOfDuty.name + " " +callOfDuty.price + "$   " + "6." + "Go to Cart" + "   " + "7." + "main menu");

        String ansG = sc.next();

        switch (ansG) {
            case  ("1"):
                customer.shoppingCart.addItem(gta);
                GameStore();
                break;
            case ("2"):
                customer.shoppingCart.addItem(mortalCombat);
                GameStore();
                break;
            case ("3"):
                customer.shoppingCart.addItem(injustice);
                GameStore();
                break;
            case ("4"):
                customer.shoppingCart.addItem(battlfield);
                GameStore();
                break;
            case ("5"):
                customer.shoppingCart.addItem(callOfDuty);
                GameStore();
                break;
            case ("6"):
                Cart();
                break;
            case ("7"):
                Start();
                break;
            default:
                GameStore();
                break;
        }
    }


    public void BookStore(){
        Clear();

        System.out.println("Welcome to " + bookStore.name + " " + customer.name + "\n");
        System.out.println("Press any number to add good to youre ShoppingCart");

        System.out.println("1." + harryPotter.name + " " +harryPotter.price + "$   " + "2." + oneHundredYears.name + " " +oneHundredYears.price + "$   " + "3." + wutheringHeights.name + " " +wutheringHeights.price + "$   " +
                "4." + prideAndPrejudice.name + " " +prideAndPrejudice.price + "$   " + "5." + resurrection.name + " " +resurrection.price + "$   " + "6." + "Go to Cart" + "   " + "7." + "main menu");

        String ansG = sc.next();

        switch (ansG) {
            case  ("1"):
                customer.shoppingCart.addItem(harryPotter);
                BookStore();
                break;
            case ("2"):
                customer.shoppingCart.addItem(oneHundredYears);
                BookStore();
                break;
            case ("3"):
                customer.shoppingCart.addItem(wutheringHeights);
                BookStore();
                break;
            case ("4"):
                customer.shoppingCart.addItem(prideAndPrejudice);
                BookStore();
                break;
            case ("5"):
                customer.shoppingCart.addItem(resurrection);
                BookStore();
                break;
            case ("6"):
                Cart();
                break;
            case ("7"):
                Start();
                break;
            default:
                BookStore();
                break;
        }

    }

    public void Cart(){
        System.out.println( customer.name + ", you have following items in youre Shopping Cart" + "\n");

        System.out.println(customer.shoppingCart.toString());

        System.out.println( "Press any key to go to main menu");

        String ansc = sc.next();
        Start();

    }

    public void Exit(){
        System.exit(0);
    }

    public void Clear(){
        for(int i = 0; i < 50; i++){
            System.out.println("");
        }
    }
}
