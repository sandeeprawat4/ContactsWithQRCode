package com.sr.model.trie;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ContactTrie {
    TrieNode root;
    ArrayList<String> allNames = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public ContactTrie(){
        this.root = new TrieNode();
    }
    public void insert(String name){
        TrieNode node = root;
        for(Character c : name.toCharArray()){
            if(!node.trie.containsKey(c)){
                node.trie.put(c, new TrieNode());
                node = node.trie.get(c);
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
        if(node.end){
            //sb.append(node.trie.keySet().);
            allNames.add(sb.toString());
            sb = new StringBuilder();
            return;
        }
        for(Character c : node.trie.keySet()){
            if(node.trie.containsKey(c)){
                sb.append(c);
                getAllNames(node.trie.get(c));
            }
        }
    }
}
