package nl.lolmewn.stats.stat.impl;

import nl.lolmewn.stats.player.StatMetaData;
import nl.lolmewn.stats.stat.Stat;

import java.util.Collection;
import java.util.List;

public class BedsEnteredStat extends Stat {

    public BedsEnteredStat() {
        super("Beds entered", "Amount of times entered a bed");
    }

    @Override
    public Collection<StatMetaData> getMetaData() {
        return List.of(new StatMetaData("world", String.class, true));
    }
}