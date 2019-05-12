package com.texasholdem;

import junit.framework.TestCase;
import org.junit.Test;

public class CardSuitEnumTest extends TestCase {

    @Test
    public void testGetName() {

        CardSuitEnum cardSuit1 = CardSuitEnum.HEARTS;
        CardSuitEnum cardSuit2 = CardSuitEnum.DIAMONDS;
        CardSuitEnum cardSuit3 = CardSuitEnum.SPADES;
        CardSuitEnum cardSuit4 = CardSuitEnum.CLUBS;

        assertEquals(cardSuit1.getName(), "H");
        assertEquals(cardSuit2.getName(), "D");
        assertEquals(cardSuit3.getName(), "S");
        assertEquals(cardSuit4.getName(), "C");
    }

}
