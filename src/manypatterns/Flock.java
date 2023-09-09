package manypatterns;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable{
    private List<Quackable> quackers;

    public Flock() {
        quackers = new ArrayList<>();
    }

    public void add(Quackable duck) {
        quackers.add(duck);
    }
    @Override
    public void quack() {
        if (!quackers.isEmpty()) {
            Quackable firstDuck = quackers.get(0);
                firstDuck.quack();
                firstDuck.quack();
                firstDuck.quack();
            }
            for (int i = 1; i < quackers.size(); i++) {
                quackers.get(i).quack();
            }
        }

}
