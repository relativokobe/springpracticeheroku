package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems(){
        final List<Item> itemList = itemRepository.findAll();
        return itemList.size() > 0 ? itemList : new ArrayList<>();
    }

    public Item createOrUpdateEmployee(final Item item){
        return itemRepository.save(item);
    }

    public void deleteEmployee(final int id){
        itemRepository.deleteById(id);
    }
}
