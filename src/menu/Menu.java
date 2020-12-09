package menu;

import javax.swing.*;
import java.util.Scanner;

public class Menu {

    public void showMainMenu(){

        Scanner scan = null;

        try {

            scan = new Scanner(System.in);

            while (true) {

                System.out.println("_TimeManager_");
                System.out.println("<<Main menu>>");

                System.out.println("1.View events");

                System.out.println("2.Create event");
                System.out.println("3.Delete event");

                System.out.println("0.Close application");

                int userInput = scan.nextInt();

                if (userInput >= 0 && userInput <= 3) {

                    switch (userInput) {
                        case 0:
                            System.out.println("Program Completed, you leave TimeManager.");
                            return;
                        case 1:
                            showViewEventMenu(scan);
                            break;
                        case 2:
                            showEventCreationMenu(scan);
                            break;
                        case 3:
                            showDeleteEventMenu(scan);
                            break;
                    }
                } else {
                    System.out.println("Input Error, choose right number!");
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (scan != null)
                scan.close();
        }

    }

    public void showViewEventMenu(Scanner scan){

        try {

            while (true) {

                System.out.println("_TimeManager_");
                System.out.println("<<Event view menu>>");

                System.out.println("1.View events by time period");
                System.out.println("2.View events by importance");
                System.out.println("3.View events by location");
                System.out.println("4.View overdue events");

                System.out.println("0.Exit to Main menu");

                int userInput = scan.nextInt();

                if (userInput >= 0 && userInput <= 4) {

                    switch (userInput) {
                        case 0:
                            System.out.println("Returning to Main menu completed.");
                            return;
                        case 1:
                            System.out.println("View events by time period");
                            break;
                        case 2:
                            System.out.println("View events by importance");
                            break;
                        case 3:
                            System.out.println("View events by location");
                            break;
                        case 4:
                            System.out.println("View overdue events");
                            break;
                    }
                } else {
                    System.out.println("Input Error, choose right number!");
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void showEventCreationMenu(Scanner scan){

        try {

            while (true) {

                System.out.println("_TimeManager_");
                System.out.println("<<Event creation menu>>");

                System.out.println("1.Enter event information");

                System.out.println("0.Exit to Main menu");

                int userInput = scan.nextInt();

                if (userInput >= 0 && userInput <= 1) {

                    switch (userInput) {
                        case 0:
                            System.out.println("Returning to Main menu completed.");
                            return;
                        case 1:
                            System.out.println("Enter event information");
                            break;
                    }
                } else {
                    System.out.println("Input Error, choose right number!");
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void showDeleteEventMenu(Scanner scan){

        try {

            while (true) {

                System.out.println("_TimeManager_");
                System.out.println("<<Delete event menu>>");

                System.out.println("1.View events");

                System.out.println("2.Delete event by id");

                System.out.println("0.Exit to Main menu");

                int userInput = scan.nextInt();

                if (userInput >= 0 && userInput <= 2) {

                    switch (userInput) {
                        case 0:
                            System.out.println("Returning to Main menu completed.");
                            return;
                        case 1:
                            System.out.println("View events");
                            break;
                        case 2:
                            System.out.println("Delete event by id");
                            break;
                    }
                } else {
                    System.out.println("Input Error, choose right number!");
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
