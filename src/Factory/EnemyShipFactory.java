package Factory;

public class EnemyShipFactory {

    public EnemyShip makeShip (String shipType) {
        return switch (shipType) {
            case "U" -> new UFOEnemyShip();
            case "R" -> new RocketEnemyShip();
            case "B" -> new BigUFOEnemyShip();
            default -> null;
        };
    }
}
