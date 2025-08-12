package com.mcsdc.addon.gui;

import meteordevelopment.meteorclient.gui.GuiThemes;
import meteordevelopment.meteorclient.gui.WindowScreen;
import net.minecraft.client.gui.screen.Screen;

public class TicketIDScreen extends WindowScreen {
    private Screen parent;

    public TicketIDScreen(Screen parent) {
        super(GuiThemes.get(), "TicketID");
        this.parent = parent;
    }

    @Override
    public void initWidgets() {
        // Immediately skip TicketID input and return to parent screen
        mc.setScreen(parent);
    }

    @Override
    public void close() {
        this.client.setScreen(parent);
    }
}
