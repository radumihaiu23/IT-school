package session_15_java_oop_recap.practice.change_runtime_behavior;

public class GameTest {

    public static void main(String[] args) {

        GameCharacter gameCharacter =  new GameCharacter(new Sword());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Bow());
        gameCharacter.attack();

    }
}
