package com.kapil.st;

/**
 * The root interface in the String Symbol Table hierarchy.
 *
 * @author Kapil Raju
 */
public interface StringST <Value>{

    public void put(String key, Value value);

    public Value get(String key);
}
