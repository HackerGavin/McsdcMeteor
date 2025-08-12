package com.mcsdc.addon.gui;

import meteordevelopment.meteorclient.gui.GuiThemes;
import meteordevelopment.meteorclient.gui.WindowScreen;

public class LoginScreen extends WindowScreen {
    WindowScreen parent;

    public LoginScreen(WindowScreen parent) {
        super(GuiThemes.get(), "Login");
        this.parent = parent;
    }

    @Override
    public void initWidgets() {
        // Skip login completely by returning to parent immediately
        mc.setScreen(parent);
        parent.reload();
    }
}
