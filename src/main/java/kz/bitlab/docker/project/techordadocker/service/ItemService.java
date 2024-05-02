package kz.bitlab.docker.project.techordadocker.service;

import kz.bitlab.docker.project.techordadocker.model.Item;
import kz.bitlab.docker.project.techordadocker.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public void addItem(Item item){
        itemRepository.save(item);
    }
}
