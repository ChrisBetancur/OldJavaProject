package com.example.demo.dao;

import com.example.demo.model.Node;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("Dao")
public class NodeDataAccessService implements NodeDAO{
    private Node head;
    @Override
    public int append(UUID id, Node curr) {
        if(head==null){
            head=curr;
            head.setId(id);
            return 0;
        }
        Node temp=head;
        Node previous=null;
        while(temp.getNext()!=null){
            temp=temp.getNext();
            if(temp.getNext().getNext()==null){
                previous=new Node(temp.getData(),temp.getId());
            }
        }
        temp.setNext(curr);
        temp.getNext().setId(id);
        temp.setPrev(previous);
        return 0;
    }

    @Override
    public Node getHead() {
        return head;
    }

    @Override
    public List<Integer> LinkedToList() {
        List<Integer> list=new ArrayList<>();
        Node temp=head;
        Node tempNext=null;
        while(temp!=null){
            list.add(temp.getData());
            temp=temp.getNext();
        }
        return list;
    }
}
