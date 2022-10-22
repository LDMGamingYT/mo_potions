
package net.ldm.mopotions.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.ldm.mopotions.world.inventory.PotionInfuserGUIMenu;
import net.ldm.mopotions.network.PotionInfuserGUIButtonMessage;
import net.ldm.mopotions.MoPotionsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PotionInfuserGUIScreen extends AbstractContainerScreen<PotionInfuserGUIMenu> {
	private final static HashMap<String, Object> guistate = PotionInfuserGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PotionInfuserGUIScreen(PotionInfuserGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mo_potions:textures/screens/potion_infuser_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mo_potions:textures/screens/potion_infuser_gui_quarter_size.png"));
		this.blit(ms, this.leftPos + 72, this.topPos + 29, 0, 0, 29, 44, 29, 44);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Potion Infusing", 6, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 110, this.topPos + 7, 56, 20, new TextComponent("Infuse"), e -> {
			if (true) {
				MoPotionsMod.PACKET_HANDLER.sendToServer(new PotionInfuserGUIButtonMessage(0, x, y, z));
				PotionInfuserGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
