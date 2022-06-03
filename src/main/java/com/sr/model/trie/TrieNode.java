package com.sr.model.trie;

import java.util.HashMap;

public class TrieNode {
    HashMap<Character, TrieNode> trie;
    boolean end;
    public TrieNode(){
        trie = new HashMap<>();
        end = false;
    }
}
