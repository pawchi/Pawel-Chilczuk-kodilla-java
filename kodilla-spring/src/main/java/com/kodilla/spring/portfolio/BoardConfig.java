package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import java.util.ArrayList;

@Configuration
class BoardConfig{
    @Autowired
    @Bean
    @Scope("prototype")
    public TaskList taskList(){
        return new TaskList(new ArrayList<>());
    }

    @Bean
    public Board board(){
        return new Board(taskList(),taskList(),taskList());
    }
}
