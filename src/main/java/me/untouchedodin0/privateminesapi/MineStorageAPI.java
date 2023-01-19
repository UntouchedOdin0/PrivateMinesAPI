package me.untouchedodin0.privateminesapi;

import me.untouchedodin0.kotlin.mine.storage.MineStorage;
import me.untouchedodin0.privatemines.mine.Mine;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.UUID;

public class MineStorageAPI {

    MineStorage mineStorage = PrivateMinesAPI.getMineStorage();

    /**
     * Gets the storage where the mines are kept
     * @return MineStorage
     */
    public MineStorage getMineStorage() {
        return mineStorage;
    }

    /**
     *
     * @param uuid The UUID of the player receiving the mine
     * @param mine The mine to add to the storage.
     */
    public void addMine(UUID uuid, Mine mine) {
        mineStorage.addMine(uuid, mine);
    }

    /**
     *
     * @param uuid The UUID of the player loosing the mine
     */
    public void removeMine(UUID uuid) {
        mineStorage.removeMine(uuid);
    }

    /**
     *
     * @param player The player
     * @return The players mine
     */
    public Mine get(Player player) {
        return mineStorage.get(player);
    }

    /**
     *
     * @param uuid The uuid of the player
     * @return The mine linked to the uuid
     */
    public Mine get(UUID uuid) {
        return mineStorage.get(uuid);
    }

    /**
     *
     * @param location The location to search for mines nearby
     * @return A mine object if a mine is found
     */
    public Mine getClosest(Location location) {
        return mineStorage.getClosest(location);
    }

    /**
     *
     * @param player The player to check if they own a mine
     * @return true if a player owns a mine else false
     */
    public boolean hasMine(Player player) {
        return mineStorage.hasMine(player);
    }

    /**
     *
     * @param uuid The uuid to check if they own a mine
     * @return true if a uuid owns a mine else false
     */
    public boolean hasMine(UUID uuid) {
        return mineStorage.hasMine(uuid);
    }
}
