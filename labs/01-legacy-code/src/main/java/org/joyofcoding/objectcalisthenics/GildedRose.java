package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<item> makeItems() {
        List<item> items = new ArrayList<item>();

        items.add(new armor("+5 Dexterity Vest", 10, 20));
        items.add(new food("Aged Brie", 2, 0));
        items.add(new potion("Elixir of the Mongoose", 5, 7));
        items.add(new potion("Conjured Mana Cake", 3, 6));
        items.add(new weapon("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new ticket("Backstage passes to a TAFKAL80ETC concert", 15, 20));

        return items;
    }

    public void updateQuality(List<item> items) {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).updateQuality();
        }
    }
}
