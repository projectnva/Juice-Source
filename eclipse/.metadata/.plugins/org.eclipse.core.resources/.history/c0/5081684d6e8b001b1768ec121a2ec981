package YourClientName.mods.impl.togglesprintsneak;

import YourClientName.gui.hud.ScreenPosition;
import YourClientName.mods.ModDraggable;

public class ModToggleSprintSneak extends ModDraggable {
	
	//Settings below
	public boolean flyBoost = false;
	public float flyBoostFactor = 1;
	public int keyHoldTicks = 7;
	public boolean shiftToggled = false;
	
	@Override
	public int getWidth() {
		return font.getStringWidth(mc.thePlayer.movementInput.getDisplayText());
	}

	@Override
	public int getHeight() {
		return font.FONT_HEIGHT;
	}

	@Override
	public void render(ScreenPosition pos) {
		String textToRender = mc.thePlayer.movementInput.getDisplayText();
		font.drawString(textToRender, pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
	}
	
	@Override
	public void renderDummy(ScreenPosition pos) {
		String textToRenderDummy = "[Sprinting (Toggled)]";
		font.drawString(textToRenderDummy, pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
	}

}
