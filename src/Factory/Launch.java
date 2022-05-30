package Factory;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        EnemyShipFactory factory = new EnemyShipFactory();

        EnemyShip ship;

        Scanner userInput = new Scanner(System.in);

        String enemyShipOption = "";

        System.out.println("What type of ship? (U / R / B)");

        if (userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        // logic of if statements has been moved to factory to deal with and simply return correct ship type or null
        // at run time.

        ship = factory.makeShip(enemyShipOption);

        if (ship != null) {
            doStuffEnemy(ship);
        }
        else {
            System.out.println("Next time input one of U / R / B.");
        }

    }

    public static void doStuffEnemy(EnemyShip ship) {
        ship.displayEnemy();
        ship.followHeroShip();
        ship.shootHeroShip();
    }


}
