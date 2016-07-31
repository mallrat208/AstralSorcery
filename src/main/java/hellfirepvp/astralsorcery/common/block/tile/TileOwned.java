package hellfirepvp.astralsorcery.common.block.tile;

import net.minecraft.nbt.NBTTagCompound;

import java.util.UUID;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: TileOwned
 * Created by HellFirePvP
 * Date: 31.07.2016 / 10:47
 */
public class TileOwned extends TileEntitySynchronized {

    private UUID ownerUUID;

    @Override
    public void readCustomNBT(NBTTagCompound compound) {
        super.readCustomNBT(compound);

        if(compound.hasKey("owner")) {
            this.ownerUUID = compound.getUniqueId("owner");
        }
    }

    @Override
    public void writeCustomNBT(NBTTagCompound compound) {
        super.writeCustomNBT(compound);

        if(ownerUUID != null) {
            compound.setUniqueId("owner", ownerUUID);
        }
    }

}