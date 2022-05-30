package Factory;

public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getAmtDamage() {return amtDamage;}
    public void setAmtDamage(double amtDamage) {this.amtDamage = amtDamage;}

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero.");
    }

    public void displayEnemy() {
        System.out.println(getName() + " is being displayed.");
    }

    public void shootHeroShip(){
        System.out.println(getName() + " is shooting at hero ship.");
    }

}
