package com.gyawalirajiv.redismessagesystem.service;

import com.gyawalirajiv.redismessagesystem.domain.Message;
import com.gyawalirajiv.redismessagesystem.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<Message> findAll() {
        return messageRepository.findAll();
    }


    public Message findOne(Integer id) {
        return messageRepository.findById(id);
    }


    public Message save(Message message) {
        return messageRepository.save(message);
    }


    public String remove(Integer id) {
        return messageRepository.delete(id);
    }
}
