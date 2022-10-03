package me.untouchedodin0.privateminesapi;

import me.untouchedodin0.privatemines.mine.MineTypeManager;

public class MineTypeManagerAPI {

    MineTypeManager mineTypeManager = PrivateMinesAPI.getMineTypeManager();

    public MineTypeManager getMineTypeManager() {
        return mineTypeManager;
    }
}
