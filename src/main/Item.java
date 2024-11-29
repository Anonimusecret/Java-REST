package main;

public class Item {

    String name;
    String description;
    int price;
    boolean available;

    public Item(String name, String description, int price, boolean available){
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = available;

        if (price < 0){
            this.price = 0;
        }

    }

    public Item(){
        this.name = "blank";
        this.description = "";
        this.price = 0;
        this.available = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    }