package oop2.HW;

public class Human extends Actor implements ActorBehaviour {

    public Human(String name) {
        this.name = name;
    }


    @Override
    String getName() {
        return name;
    }


    @Override
    public void setMakeOrder() {
        this.makeOrder = isMakeOrder();
    }

    @Override
    public void setTakeOrder() {
        this.takeOrder = isTakeOrder();
    }

    @Override
    public boolean isMakeOrder() {
        return true;
    }

    @Override
    public boolean isTakeOrder() {
        return true;
    }

    @Override
    public String toString() {
        return "Human " + this.name + "\nсделал(а) заказ: " + this.makeOrder + "\nзабрал(а): " + this.takeOrder + "\n";
    }
}
