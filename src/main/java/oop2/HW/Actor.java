package oop2.HW;

public abstract class Actor implements ActorBehaviour {
    protected String name;

    protected boolean makeOrder;
    protected boolean takeOrder;

    public void setName(String name) {
        this.name = name;
    }

    abstract String getName();

    @Override
    public boolean getMakeOrder() {
        return makeOrder;
    }

    @Override
    public boolean getTakeOrder() {
        return takeOrder;
    }
}
