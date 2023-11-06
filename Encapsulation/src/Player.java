public class Player {

    private String name;
    private int health;
    private String weapon;

    public Player(String name) {
        this(name,50,"Gun");
        this.name = name;
    }

    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health < 0){
            health = 0;
        } else if (health > 100) {
            health =100;
        }else {
            this.health = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        health = health - damage;
        if(damage > health){
            System.out.println("GameOver");
        }else{
            System.out.println("Your health = " + health +"%");
        }

    }
    public void restoreHealth(int extraHealth){
        health =health + extraHealth;
if(health > 100){
    health = 100;
}
        System.out.println("New health = " + health +"%");
    }
    public int healthReamaining(){
        return health;
    }
}
