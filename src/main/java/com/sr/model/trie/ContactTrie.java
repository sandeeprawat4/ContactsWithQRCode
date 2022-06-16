package com.sr.model.trie;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ContactTrie {
    TrieNode root;
    ArrayList<String> allNames = new ArrayList<>();
    public ContactTrie(){
        this.root = new TrieNode();
    }
    public void insert(String name){
        TrieNode node = root;
        for(Character c : name.toCharArray()){
            if(!node.trie.containsKey(c)){
                node.trie.put(c, new TrieNode());
            }else
                node = node.trie.get(c);
        }
        node.end = true;
    }

    public ArrayList<String> getAll() {
        TrieNode node = root;
        getAllNames(node);
        return allNames;
    }

    public void getAllNames(TrieNode node){

    }
}
