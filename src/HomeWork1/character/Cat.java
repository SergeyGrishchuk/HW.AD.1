package HomeWork1.character;

public class Cat implements Character {
    private String name;

    private int maxRunDistanse;
    private int maxJumpHeight;
    private boolean onDistance;

    public Cat (String name, int maxRunDistanse, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistanse = maxRunDistanse;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Cat (String name) {
        this(name, 250, 3);
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistanse){
            System.out.println(name + " пробежал " + dist + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + dist + " метров");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул стену высотой " + height + " метров");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой "+ height + " метров");
        }
    }

    @Override
    public boolean isOnDistanse() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " " + onDistance);
    }
}

