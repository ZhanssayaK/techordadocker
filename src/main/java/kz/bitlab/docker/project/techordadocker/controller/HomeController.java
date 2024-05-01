package kz.bitlab.docker.project.techordadocker.controller;

import kz.bitlab.docker.project.techordadocker.db.DBManager;
import kz.bitlab.docker.project.techordadocker.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping(value = "/home")
    public String homePage(Model model){
        model.addAttribute("items", DBManager.getItems());
        return "index";
    }

    @PostMapping(value = "/addItem")
    public String addItem(@RequestParam(value = "name") String name,
                          @RequestParam(value = "price") int price){
        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        DBManager.addItem(item);
        return "redirect:/home";
    }
}
