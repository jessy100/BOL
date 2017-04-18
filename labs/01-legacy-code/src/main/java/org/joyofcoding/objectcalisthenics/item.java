package org.joyofcoding.objectcalisthenics;

/**
 * Created by jessyvisch on 27-03-17.
 */
public interface item {
    String getName();

    int getSellIn();

    void setSellIn(int sellIn);

    int getQuality();

    void setQuality(int quality);

    void decreaseSellIn();

    void increaseQaulity();

    void decreaseQaulity();

    void resetQuality();

    void updateQuality();

}
