package com.example.demo.dao;

import com.example.demo.model.Node;

import java.util.*;

public interface NodeDAO {
    int append(UUID id, Node node);

    default int append(Node node){
        UUID id=UUID.randomUUID();
        return append(id,node);
    }

    Node getHead();

    List<Integer> LinkedToList();
}
