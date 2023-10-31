import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        int newWeight = this.currentWeight + suitcase.totalWeight();
        if (newWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.currentWeight = newWeight;
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }



    @Override
    public String toString() {
        int suitcaseCount = suitcases.size();
        return suitcaseCount + (suitcaseCount == 1 ? " suitcase " : " suitcases ") + "(" + this.currentWeight + " kg)";
    }
}