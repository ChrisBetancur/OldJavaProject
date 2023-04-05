package com.example.demo.service;

import com.example.demo.dao.NodeDAO;
import com.example.demo.model.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeService {
    private final NodeDAO nodeDAO;

    @Autowired
    NodeService(@Qualifier("Dao") NodeDAO nodeDAO){
        this.nodeDAO=nodeDAO;
    }

    public int appendNode(Node node){
        return nodeDAO.append(node);
    }

    public Node getHead(){
        return nodeDAO.getHead();
    }
    public List<Integer> getList(){
        return nodeDAO.LinkedToList();
    }
}
