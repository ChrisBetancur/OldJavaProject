package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Node {
    private Node next;
    private Node prev;
    private int data;
    private UUID id;
    public Node(@JsonProperty("data") int data,
                @JsonProperty("id") UUID id){
        this.data=data;
        this.id=id;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public UUID getId() {
        return id;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
