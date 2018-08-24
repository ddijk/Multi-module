package nl.dijkrosoft.multimod.backend;

import static org.junit.Assert.*;


import org.junit.Test;


public class DatabaseTest {

    Database database = new Database();

    @Test
    public void count() {


        assertEquals(42, database.count());


    }
}