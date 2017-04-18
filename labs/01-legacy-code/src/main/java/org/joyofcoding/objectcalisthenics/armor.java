package org.joyofcoding.objectcalisthenics;

public class armor implements item {
    private String name;
    private int sellIn;
    private int quality;

    public armor(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSellIn() {
        return sellIn;
    }

    @Override
    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    @Override
    public int getQuality() {
        return quality;
    }

    @Override
    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public void increaseQaulity(){
        this.quality += 1;
    }

    @Override
    public void decreaseQaulity(){
        this.quality += 1;
    }

    @Override
    public void resetQuality(){
        this.quality = 0;
    }

    @Override
    public void decreaseSellIn(){
        this.sellIn -= 1;
    }

    public void updateQuality(){
        if(quality > 0){
            this.decreaseQaulity();
        }

        this.decreaseSellIn();

        if (quality > 0 && sellIn < 0) {

            this.decreaseQaulity();
        }
    }

}
