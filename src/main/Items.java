package main;

import java.util.HashMap;
import java.util.Map;

public class Items {

    public static Map<String, main.Item> AllItems;

    public Items() {
        AllItems = new HashMap<>();
        AllItems.put("SampleName", new main.Item("SampleName", "", 0, false));
        AllItems.put("name2", new main.Item("name2", "", 1, false));

    }

}
