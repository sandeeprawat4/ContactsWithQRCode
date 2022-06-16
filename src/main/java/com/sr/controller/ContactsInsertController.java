package com.sr.controller;

import com.sr.model.trie.ContactTrie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ContactsInsertController {
    @Autowired
    ContactTrie contactTrie;

    @PostMapping ("/insert")
    public void insertContact(@RequestParam(name = "val") String s){
        contactTrie.insert(s);
    }

    @GetMapping ("getAll")
    public ArrayList<String> getAll(){
        return contactTrie.getAll();
    }
}
