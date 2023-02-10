// Daniel Isaksson
// Daniel.isaksson90@gmail.com
package Nim;
public abstract class Player {

    protected String name;

    public String getName() {
        return name;
    }

    abstract int move(Pile pile);

    abstract String result(Pile pile);


}

