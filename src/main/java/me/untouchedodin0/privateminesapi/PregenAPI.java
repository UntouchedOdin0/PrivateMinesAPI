package me.untouchedodin0.privateminesapi;

import me.untouchedodin0.privatemines.factory.PregenFactory;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;

public class PregenAPI {

    PregenFactory pregenFactory = PrivateMinesAPI.getPregenFactory();

    public PregenFactory getPregenFactory() {
        return pregenFactory;
    }

    public void generate(Player player, int amount) {
        pregenFactory.generate(player, amount);
    }

    public List<Location> getGeneratedLocations() {
        return pregenFactory.getGeneratedLocations();
    }
}
