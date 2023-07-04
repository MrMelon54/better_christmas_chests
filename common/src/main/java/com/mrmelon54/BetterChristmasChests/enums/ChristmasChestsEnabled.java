package com.mrmelon54.BetterChristmasChests.enums;

public enum ChristmasChestsEnabled {
    ALWAYS("Always"),
    AT_CHRISTMAS("Only At Christmas"),
    NEVER("Never");

    private final String name;

    ChristmasChestsEnabled(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
