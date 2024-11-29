package main;

import java.util.*;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Items")
public class GetItemsController {

    main.Items storage = new main.Items();

    @GetMapping
    public main.GetItems getResponse (@RequestParam(value="name", required=false, defaultValue="") String name) {
            return new main.GetItems(name);
    }

    @PostMapping
    public main.PostItems postResponse (@RequestBody main.Item request) {
        return new main.PostItems(request);
    }

    @PutMapping
    public main.PutItems putResponse (@RequestBody main.Item request) {
        return new main.PutItems(request);
    }

    @DeleteMapping
    public void deleteResponse (@RequestBody main.Item request) {

        String name = request.getName();
        main.Item target = main.Items.AllItems.get(name);

        if (target == null) {
            throw new main.ItemNotFoundException("Item not found");
        }else{
            main.Items.AllItems.remove(name);
        }

    }
}
