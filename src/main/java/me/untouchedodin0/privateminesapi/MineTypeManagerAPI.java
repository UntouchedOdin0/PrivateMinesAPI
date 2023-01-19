package me.untouchedodin0.privateminesapi;

import me.untouchedodin0.kotlin.mine.type.MineType;
import me.untouchedodin0.privatemines.mine.MineTypeManager;

public class MineTypeManagerAPI {

    MineTypeManager mineTypeManager = PrivateMinesAPI.getMineTypeManager();

    public MineTypeManager getMineTypeManager() {
        return mineTypeManager;
    }

    public void registerMineType(MineType mineType) {
        mineTypeManager.registerMineType(mineType);
    }

    public MineType getMineType(String string) {
        return mineTypeManager.getMineType(string);
    }

    public MineType getDefaultMineType() {
        return mineTypeManager.getDefaultMineType();
    }

    public MineType getNextType(MineType current) {
        return mineTypeManager.getNextMineType(current);
    }
}
