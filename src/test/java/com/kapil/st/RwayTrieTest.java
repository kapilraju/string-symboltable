package com.kapil.st;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * @author Kapil Raju
 */
public class RwayTrieTest {

    @Test
    public final void testPositive() {
        StringST<Integer> rwayTrie = new RwayTrie<Integer>();

        rwayTrie.put("car", 1);
        rwayTrie.put("cart", 2);
        rwayTrie.put("cash", 3);
        rwayTrie.put("camp", 4);


        assertEquals( new Integer(1), rwayTrie.get("car"));
        assertEquals( new Integer(2), rwayTrie.get("cart"));
        assertEquals( new Integer(3), rwayTrie.get("cash"));
        assertEquals( new Integer(4), rwayTrie.get("camp"));

    }

    @Test
    public final void testNegative() {
        StringST<Integer> rwayTrie = new RwayTrie<Integer>();

        rwayTrie.put("car", 1);
        rwayTrie.put("cart", 2);
        rwayTrie.put("cash", 3);
        rwayTrie.put("camp", 4);

        assertEquals(null, rwayTrie.get("card"));

    }
}
