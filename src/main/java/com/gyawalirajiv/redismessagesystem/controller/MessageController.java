package com.gyawalirajiv.redismessagesystem.controller;

import com.gyawalirajiv.redismessagesystem.domain.Message;
import com.gyawalirajiv.redismessagesystem.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping
    public List<Message> findAll(){
        return messageService.findAll();
    }

    @GetMapping("{id}")
    public Message findOne(@PathVariable Integer id){
        return messageService.findOne(id);
    }

    @PostMapping
    public Message save(@RequestBody Message message){
        return messageService.save(message);
    }

    @DeleteMapping("{id}")
    public String remove(@PathVariable Integer id){
        return messageService.remove(id);
    }

}
