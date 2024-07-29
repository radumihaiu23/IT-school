package session_15_java_oop_recap.practice.change_runtime_behavior;

public class GameCharacter {

    private Weapon weapon;

    public GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void attack(){
        weapon.use();
    }


}
