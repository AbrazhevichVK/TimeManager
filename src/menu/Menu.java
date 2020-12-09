package menu;

public class Menu {

    public void showMainMenu(){

        System.out.println("_TimeManager_");
        System.out.println("<<Main menu>>");

        System.out.println("1.View events");
        System.out.println("2.Create event");
        System.out.println("3.Delete event");
        System.out.println("4.Close application");

    }

    public void showViewEventMenu(){

        System.out.println("_TimeManager_");
        System.out.println("<<Event view menu>>");

        System.out.println("1.View events by time period");
        System.out.println("2.View events by importance");
        System.out.println("3.View events by location");
        System.out.println("4.View overdue events");
        System.out.println("5.Exit to Main menu");

    }

    public void showEventCreationMenu(){

        System.out.println("_TimeManager_");
        System.out.println("<<Event creation menu>>");

        System.out.println("1.Enter event information");
        System.out.println("2.Exit to Main menu");

    }

    public void showDeleteEventMenu(){

        System.out.println("_TimeManager_");
        System.out.println("<<Delete event menu>>");

        System.out.println("1.View events");
        System.out.println("2.Delete event by id");
        System.out.println("3.Exit to Main menu");

    }

}
