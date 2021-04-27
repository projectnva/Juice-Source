package net.minecraft.client.gui;

import java.io.IOException;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.resources.I18n;
import net.minecraft.realms.RealmsBridge;


public class GuiCapeMenu extends GuiScreen{
	
	public boolean getMonkies = false;
	private int field_146445_a;
    private int field_146444_f;
	private GuiCapeMenu GuiCapeMenu;
	
	public void initGui() {
        this.buttonList.clear();
        int i = -16;
        int j = 98;
        
        this.buttonList.add(new GuiButton(301, this.width / 2 - 100, this.height / 4 + 24 + i, I18n.format("Back to Game", new Object[0])));
        this.buttonList.add(new GuiButton(4, this.width / 2 - 100, this.height / 4 + 48 + i, I18n.format("Monkies Cape", new Object[0])));
        this.buttonList.add(new GuiButton(5, this.width / 2 - 100, this.height / 4 + 72 + i, I18n.format("Floyd's Cape", new Object[0])));
        this.buttonList.add(new GuiButton(1, this.width / 2 - 100, this.height / 4 + 120 + i, I18n.format("Quit to Main Menu", new Object[0])));
        
	}

	public void updateScreen() {
	        super.updateScreen();
	}
	
	public void onGuiClosed()
    {
        Keyboard.enableRepeatEvents(false);
    }
	
	protected void actionPerformed(GuiButton button) throws IOException {
		switch (button.id)
        {
            case 1:
            	
            	boolean flag1 = this.mc.func_181540_al();
                boolean flag = this.mc.isIntegratedServerRunning();
                button.enabled = false;
                this.mc.theWorld.sendQuittingDisconnectingPacket();
                this.mc.loadWorld((WorldClient)null);
                
                if (flag)
                {
                    this.mc.displayGuiScreen(new GuiMainMenu());
                } else if (flag1) 
                {
                	RealmsBridge realmsbridge = new RealmsBridge();
                    realmsbridge.switchToRealms(new GuiMainMenu());
                } else
                {
                    this.mc.displayGuiScreen(new GuiMultiplayer(new GuiMainMenu()));
                }
            case 301:
                this.mc.displayGuiScreen((GuiScreen)null);
                this.mc.setIngameFocus();
                break;
            case 4:
            	getMonkies = true;
                
        }
	}
	
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.format("menu.game", new Object[0]), this.width / 2, 40, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}

