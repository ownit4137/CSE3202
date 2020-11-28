package finalterm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fruit implements Comparable<Fruit> {
    private String name;
    private int price;

    public Fruit(String n, int p) {
        name = n;
        price = p;
    }

    @Override
    public int compareTo(Fruit o) {
        return Integer.compare(price, o.price);
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
}

class ExpensiveFruit {
    public List<Fruit> fruits;
    public ExpensiveFruit() {
        fruits = new ArrayList<>();
        System.out.println(Thread.currentThread().getName() + " ExpensiveFruit()");
    }
    public void accumulate(Fruit f){
        fruits.add(f);
        System.out.println(Thread.currentThread().getName() + " accumulate()");
    }
    public void combine(ExpensiveFruit ef){
        fruits.addAll(ef.fruits);
        System.out.println(Thread.currentThread().getName() + " combine()");
    }
}

public class Week13_ForkJoin {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("Apple", 1000),
                new Fruit("Orange", 5000),
                new Fruit("Banana", 3000),
                new Fruit("Strawberry", 500),
                new Fruit("Watermelon", 17000),
                new Fruit("Kiwi", 4000)
        );

        ExpensiveFruit ExpensiveList = fruits.parallelStream()
                .filter(e -> e.getPrice() >= 4000)
                //.collect(ExpensiveFruit::new, ExpensiveFruit::accumulate, ExpensiveFruit::combine);
                .collect(() -> new ExpensiveFruit(), (x, y) -> x.accumulate(y), (x, y) -> x.combine(y));
    }
}


