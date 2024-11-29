package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GetItems {

    public List<main.Item> response;

    public GetItems (String name) {

        if (Objects.equals(name, "")) {
            this.response = new ArrayList<>(main.Items.AllItems.values());
        } else {

            main.Item result = main.Items.AllItems.get(name);
            this.response = new ArrayList<>();
            this.response.add(result);

        }
    }

}
