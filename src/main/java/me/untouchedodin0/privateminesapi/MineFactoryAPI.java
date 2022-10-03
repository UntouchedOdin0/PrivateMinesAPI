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

    public void createMine(Player player, Location location, MineType mineType) {
        mineFactory.create(player, location, mineType);
    }

    public void createMine(UUID uuid, Location location, MineType mineType) {
        mineFactory.create(Bukkit.getOfflinePlayer(uuid).getPlayer(), location, mineType);
    }
}

