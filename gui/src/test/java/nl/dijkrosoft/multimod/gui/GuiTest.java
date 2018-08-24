package nl.dijkrosoft.multimod.gui;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuiTest {

    @Test
    public void render() {

        Gui gui = new Gui();

        assertEquals(20, gui.render());
    }
}