package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.response.CustomResponseBody;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomResponseBody handleGetAllItems(){
        final Map<String, Object> bodyObject = new HashMap<>();
        bodyObject.put("items", itemService.getAllItems());
        return new CustomResponseBody(200,  bodyObject);
    }

    @RequestMapping(value = "/addUpdate", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomResponseBody addItem(@RequestBody final Item item){
        final Map<String, Object> bodyObject = new HashMap<>();
        bodyObject.put("item",itemService.createOrUpdateEmployee(item));
        return new CustomResponseBody(200, bodyObject);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomResponseBody deleteItem(@RequestBody final int id){
        itemService.deleteEmployee(id);
        return new CustomResponseBody(200, id);
    }

}
