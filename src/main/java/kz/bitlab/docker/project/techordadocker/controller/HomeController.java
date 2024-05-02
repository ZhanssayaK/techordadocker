package kz.bitlab.docker.project.techordadocker.controller;

import kz.bitlab.docker.project.techordadocker.model.Item;
import kz.bitlab.docker.project.techordadocker.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ItemService itemService;

    @GetMapping(value = "/")
    public String getIndexPage(Model model){
        model.addAttribute("items", itemService.getAllItems());
        return "index";
    }

    @PostMapping(value = "/addItem")
    public String addItem(@RequestParam(value = "name") String name,
                          @RequestParam(value = "price") int price){
        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        itemService.addItem(item);
        return "redirect:/";
    }
}
