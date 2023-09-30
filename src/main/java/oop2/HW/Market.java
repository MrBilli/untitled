package oop2.HW;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    protected List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<Actor>();
    }

    public List<Actor> getQueue() {
        return this.queue;
    }

    @Override
    public void acceptToMarket(Actor actor) {
//        if (this.queue.isEmpty()) actor.setTakeOrder();
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        releaseFromQueue();
    }

    @Override
    public void update() {
        if (!queue.get(queue.size() - 1).takeOrder) {
            queue.get(queue.size() - 1).setMakeOrder();
            queue.get(queue.size() - 1).setTakeOrder();
            System.out.println(this);
        }
        if (queue.get(queue.size() - 1).takeOrder) {
            queue.get(queue.size() - 1).setMakeOrder();
            queue.get(queue.size() - 1).setTakeOrder();
            queue.get(queue.size() - 2).setMakeOrder();
            System.out.println(this);
        }
        releaseFromMarket(queue);
        giveOrders();
        takeOrders();
        System.out.println(this);
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        if (queue.size() >= 2) queue.get(queue.size() - 1).setMakeOrder();
        else queue.get(queue.size() - 1).setTakeOrder();
    }

    @Override
    public void giveOrders() {
        queue.get(queue.size() - 1).setTakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        queue.remove(queue.get(queue.size() - 1));
    }

    @Override
    public String toString() {
        String str = "Cостояние очереди:\n";
        for (int i = 0; i < this.queue.size(); i++) {
            str += "\n" + this.queue.get(i);
        }
        return str;
    }
}
