package com.sr.model.trie;

public class ContactTrie {
    TrieNode root;
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
}
