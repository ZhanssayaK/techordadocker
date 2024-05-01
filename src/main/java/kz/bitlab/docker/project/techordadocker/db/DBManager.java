package kz.bitlab.docker.project.techordadocker.db;

import kz.bitlab.docker.project.techordadocker.model.Item;

import java.util.ArrayList;
import java.util.List;

public class DBManager {

    public static List<Item> itemsList = new ArrayList<>();
    private static Long id = 5L;

    static {
        itemsList.add(new Item(1L, "Iphone 15 Pro Max", 500000));
        itemsList.add(new Item(2L, "Iphone 13 Pro Max", 400000));
        itemsList.add(new Item(3L, "Iphone 12 Pro Max", 300000));
        itemsList.add(new Item(4L, "Iphone 11 Pro Max", 100000));
    }

    public static List<Item> getItems(){
        return itemsList;
    }

    public static void addItem(Item item){
        item.setId(id);
        itemsList.add(item);
        id++;
    }
}
