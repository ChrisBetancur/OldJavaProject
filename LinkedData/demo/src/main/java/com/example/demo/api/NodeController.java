package com.example.demo.api;

import com.example.demo.model.Node;
import com.example.demo.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/Linked")
@RestController
public class NodeController {

    private final NodeService nodeService;

    @Autowired
    public NodeController(NodeService nodeService) {
        this.nodeService = nodeService;
    }

    @PostMapping
    public void appendNode(@RequestBody Node node){
        nodeService.appendNode(node);
    }

    @GetMapping
    public Node getAll(){
        return nodeService.getHead();
    }

    /*@GetMapping
    public List<Integer> getList(){
        return nodeService.getList();
    }*/

}
