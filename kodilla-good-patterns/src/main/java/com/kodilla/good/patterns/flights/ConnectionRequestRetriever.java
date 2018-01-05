package com.kodilla.good.patterns.flights;
import java.time.LocalDateTime;

public class ConnectionRequestRetriever {

    public ConnectionRequest retrieve(){

        ConnectionRequest connectionRequest = new ConnectionRequest("John Smith","Berlin","Rome","London", LocalDateTime.of(2018,1,10,8,50));

        return connectionRequest;
    }
}
