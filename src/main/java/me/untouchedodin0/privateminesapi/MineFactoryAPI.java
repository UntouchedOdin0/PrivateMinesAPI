package me.untouchedodin0.privateminesapi;

import me.untouchedodin0.kotlin.mine.type.MineType;
import me.untouchedodin0.privatemines.factory.MineFactory;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.UUID;

public class MineFactoryAPI {

    MineFactory mineFactory = PrivateMinesAPI.getMineFactory();

    public MineFactory getMineFactory() {
        return mineFactory;
    }

    /**
     *
     * @param player    The player receiving the mine
     * @param location  The location to paste the mine
     * @param mineType  The mine type of which the mine should inherit from
     * @param paste     Should we paste the schematic?
     */
    public void createMine(Player player, Location location, MineType mineType, boolean paste) {
        mineFactory.create(player, location, mineType, paste);
    }

    /**
     *
     * @param uuid      The uuid of the player receiving the mine
     * @param location  The location to paste the mine
     * @param mineType  The mine type of which the mine should inherit from
     * @param paste     Should we paste the schematic?
     */
    public void createMine(UUID uuid, Location location, MineType mineType, boolean paste) {
        mineFactory.create(Bukkit.getOfflinePlayer(uuid).getPlayer(), location, mineType, paste);
    }
}

