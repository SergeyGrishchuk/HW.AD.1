package HomeWork1.barrier;

import HomeWork1.character.Character;

public class Wall implements Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void justDoIt(Character c) {
        c.jump(height);
    }
}
