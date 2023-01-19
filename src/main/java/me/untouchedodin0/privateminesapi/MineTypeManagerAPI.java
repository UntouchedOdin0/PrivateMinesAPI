package me.untouchedodin0.privateminesapi;

import me.untouchedodin0.kotlin.mine.type.MineType;
import me.untouchedodin0.privatemines.mine.MineTypeManager;

public class MineTypeManagerAPI {

    MineTypeManager mineTypeManager = PrivateMinesAPI.getMineTypeManager();

    /**
     *
     * @return The MineTypeManager instance
     */
    public MineTypeManager getMineTypeManager() {
        return mineTypeManager;
    }

    /**
     * Registers a mine type into the system
     * @param mineType The mine type to register
     */
    public void registerMineType(MineType mineType) {
        mineTypeManager.registerMineType(mineType);
    }

    /**
     *
     * @param string The mine type to get from the manager
     * @return MineType object linked to the name
     */
    public MineType getMineType(String string) {
        return mineTypeManager.getMineType(string);
    }

    /**
     * Gets the default mine type
     * @return MineType
     */
    public MineType getDefaultMineType() {
        return mineTypeManager.getDefaultMineType();
    }

    /**
     * Gets the next mine type in the order
     * @param current The current mine type
     * @return the next mine type in the order
     */
    public MineType getNextType(MineType current) {
        return mineTypeManager.getNextMineType(current);
    }
}
