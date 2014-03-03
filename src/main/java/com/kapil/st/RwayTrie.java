package com.kapil.st;

/**
 * @author Kapil Raju
 */
public class RwayTrie<Value> implements StringST<Value> {

    private static final int R = 256;//ASCII characters

    private TrieNode<Value>root = new TrieNode<Value>();

    @Override
    public void put(String key, Value value) {
        root = put(root, key, value, 0);
    }

    private TrieNode put(TrieNode n, String key, Value value, int d) {

        if (n == null) n = new TrieNode();

        if (d == key.length()){
            n.value = value;
            return n;
        }
        char c = key.charAt(d);
        n.next[c] = put(n.next[c], key, value, d+1);
        return n;

    }

    @Override
    public Value get(String key) {
        TrieNode<Value> n = get(root, key, 0);
        return (n == null) ? null : n.value;
    }

    private TrieNode get(TrieNode<Value> n, String key, int d) {
        if(n == null) return null;
        if (key.length() == d) return n;
        char c = key.charAt(d);

        return get(n.next[c], key, d+1);
    }

    private class TrieNode<Value> {
        private Value value;
        private TrieNode[] next;

        private TrieNode() {
            next = new TrieNode[R];
        }
    }


}
