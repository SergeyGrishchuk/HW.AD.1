package HomeWork1.barrier;

import HomeWork1.character.Character;

public class Treadmill implements Barrier{
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public void justDoIt(Character c) {
        c.run(dist);
    }
}
