package me.untouchedodin0.privateminesapi;

import me.untouchedodin0.kotlin.mine.storage.MineStorage;
import me.untouchedodin0.privatemines.mine.Mine;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.UUID;

public class MineStorageAPI {

    MineStorage mineStorage = PrivateMinesAPI.getMineStorage();

    public MineStorage getMineStorage() {
        return mineStorage;
    }

    public void addMine(UUID uuid, Mine mine) {
        mineStorage.addMine(uuid, mine);
    }

    public void removeMine(UUID uuid) {
        mineStorage.removeMine(uuid);
    }

    public Mine get(Player player) {
        return mineStorage.get(player);
    }

    public Mine get(UUID uuid) {
        return mineStorage.get(uuid);
    }

    public Mine getClosest(Location location) {
        return mineStorage.getClosest(location);
    }

    public boolean hasMine(Player player) {
        return mineStorage.hasMine(player);
    }

    public boolean hasMine(UUID uuid) {
        return mineStorage.hasMine(uuid);
    }
}
