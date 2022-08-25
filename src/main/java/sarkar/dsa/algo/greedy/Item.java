package sarkar.dsa.algo.greedy;

public class Item implements Comparable<Item> {

    int wt;
    int val;

   public Item(int w, int v) {
        wt = w;
        val = v;
    }

    @Override
    public int compareTo(Item i) {
        return wt * i.val - val * i.wt;
    }

    @Override
    public String toString() {
        return "Item{" +
                "wt=" + wt +
                ", val=" + val +
                '}';
    }
}
