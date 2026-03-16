package com.quest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    @Test
    void testNextScene() {

        GameService service = new GameService();

        int result = service.nextScene(1,1);

        assertEquals(2,result);
    }

    @Test
    void testEscapePath() {

        GameService service = new GameService();

        int result = service.nextScene(1,2);

        assertEquals(3,result);
    }
}