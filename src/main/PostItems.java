package main;

import java.util.ArrayList;
import java.util.List;

public class PostItems {

    public List<main.Item> response;

    public PostItems(main.Item request){
        String name = request.getName();
        String description = request.getDescription();
        int price = request.getPrice();
        boolean available = request.getAvailable();

        main.Item target = main.Items.AllItems.get(name);

        if (target == null) {
            throw new main.ItemNotFoundException("Item not found");
        }else{
            target.setDescription(description);
            target.setPrice(price);
            target.setAvailable(available);

            main.Items.AllItems.put(name, target);
        }
        this.response = new ArrayList<>(main.Items.AllItems.values());
    }
}
