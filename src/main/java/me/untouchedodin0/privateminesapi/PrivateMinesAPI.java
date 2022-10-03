package me.untouchedodin0.privateminesapi;

import me.untouchedodin0.kotlin.mine.storage.MineStorage;
import me.untouchedodin0.kotlin.mine.storage.PregenStorage;
import me.untouchedodin0.privatemines.PrivateMines;
import me.untouchedodin0.privatemines.factory.MineFactory;
import me.untouchedodin0.privatemines.factory.PregenFactory;
import me.untouchedodin0.privatemines.mine.MineTypeManager;

public class PrivateMinesAPI {

    public static PrivateMines privateMines = PrivateMines.getPrivateMines();
    public static MineStorage mineStorage = privateMines.getMineStorage();
    public static MineFactory mineFactory = privateMines.getMineFactory();
    public static MineTypeManager mineTypeManager = privateMines.getMineTypeManager();
    public static PregenStorage pregenStorage = privateMines.getPregenStorage();

    public static PregenFactory pregenFactory = new PregenFactory();

    public static PrivateMines getPrivateMines() {
        return privateMines;
    }

    public static MineStorage getMineStorage() {
        return mineStorage;
    }

    public static MineFactory getMineFactory() {
        return mineFactory;
    }

    public static MineTypeManager getMineTypeManager() {
        return mineTypeManager;
    }

    public static PregenStorage getPregenStorage() {
        return pregenStorage;
    }

    public static PregenFactory getPregenFactory() {
        return pregenFactory;
    }
}
