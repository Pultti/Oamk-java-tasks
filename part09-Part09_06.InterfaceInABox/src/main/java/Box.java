import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(Packable item) {
        if (item == this) {
            System.out.println("A box can't contain itself.");
            return;
        }

        if (this.weight() + item.weight() <= maxCapacity) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}