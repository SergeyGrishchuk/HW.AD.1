package HomeWork1;

import HomeWork1.barrier.Barrier;
import HomeWork1.barrier.Treadmill;
import HomeWork1.barrier.Wall;
import HomeWork1.character.Cat;
import HomeWork1.character.Character;
import HomeWork1.character.Human;
import HomeWork1.character.Robot;

public class Main {

    public static void main(String[] args) {
        Character[] characters = {
                new Human("Jack", 500, 7),
                new Cat("Shifu", 400, 5),
                new Robot("T-1000", 1300, 13)
        };

        Barrier[] barriers = {
                new Treadmill(399),
                new Wall(6),
        };
        for (Character c : characters) {
            for (Barrier b : barriers) {
                b.justDoIt(c);
                if (!c.isOnDistanse()) {
                    break;
                }
            }
        }
        for (Character character : characters) {
            character.info();
        }
    }
}
