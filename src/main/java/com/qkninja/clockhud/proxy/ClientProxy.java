package com.qkninja.clockhud.proxy;

import com.qkninja.clockhud.client.gui.GuiClock;
import com.qkninja.clockhud.client.gui.GuiDayCount;
import com.qkninja.clockhud.client.settings.KeyBindings;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{

    private Minecraft mc = Minecraft.getMinecraft();

    @Override
    public void registerRenderers()
    {
        MinecraftForge.EVENT_BUS.register(new GuiClock(mc));
        MinecraftForge.EVENT_BUS.register(new GuiDayCount(mc));
    }

    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(KeyBindings.TOGGLE);
    }
}
