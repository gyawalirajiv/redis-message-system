package com.gyawalirajiv.redismessagesystem.repository;

import com.gyawalirajiv.redismessagesystem.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageRepository {

    public static final String HASH_KEY = "Message";

    @Autowired
    RedisTemplate redisTemplate;

    public Message save(Message message){
        redisTemplate.opsForHash().put(HASH_KEY, message.getId(), message);
        return message;
    }

    public List<Message> findAll(){
        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public Message findById(int id){
        return (Message) redisTemplate.opsForHash().get(HASH_KEY, id);
    }

    public String delete(int id){
        return "removed";
    }

}
