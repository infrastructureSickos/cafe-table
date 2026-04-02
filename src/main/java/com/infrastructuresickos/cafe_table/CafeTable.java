package com.infrastructuresickos.cafe_table;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CafeTable.MOD_ID)
public class CafeTable {
    public static final String MOD_ID = "cafe_table";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public CafeTable() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("CafeTable initialized");
    }
}
