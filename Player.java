package Nim2;

public abstract class Player {
    protected String name;

    public String getName() {
        return name;
    }

    abstract int move(Pile p);

    abstract String result(Pile p);


}

