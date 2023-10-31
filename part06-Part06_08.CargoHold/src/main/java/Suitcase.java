import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int currentWeight = 0;

        for (Item existingItem : items) {
            currentWeight += existingItem.getWeight();
        }

        if(currentWeight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
    
        for (Item item : items) {
            currentWeight += item.getWeight();
        }
    
        return currentWeight;
    }


    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null; // Return null if the suitcase is empty
        }
    
        Item heaviest = items.get(0); // Assume the first item is the heaviest
    
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item; // Update heaviest if a heavier item is found
            }
        }

        return heaviest;
    }


    @Override
    public String toString() {
        int currentWeight = 0;
        int itemCount = items.size();
    
        for (Item item : items) {
            currentWeight += item.getWeight();
        }
    
        if (itemCount == 0) {
            return "no items (" + currentWeight + " kg)";
        } else if (itemCount == 1) {
            return "1 item (" + currentWeight + " kg)";
        } else {
            return itemCount + " items (" + currentWeight + " kg)";
        }
    }

}


