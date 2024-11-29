package main;

import java.util.ArrayList;
import java.util.List;

public class PutItems {

    public List<main.Item> response;

    public PutItems(main.Item request){

        String name = request.getName();
        String description = request.getDescription();
        int price = request.getPrice();
        boolean available = request.getAvailable();

        main.Item target = main.Items.AllItems.get(name);

        if (target != null) {
            throw new main.ItemNotFoundException("Item already exists");
        }else{
            main.Items.AllItems.put(name, new main.Item(name, description, price, available));
            this.response = new ArrayList<>(main.Items.AllItems.values());
        }
    }
}
