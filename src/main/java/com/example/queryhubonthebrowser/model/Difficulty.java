package com.example.queryhubonthebrowser.model;

public enum Difficulty {
    EASY,
    MEDIUM,
    HARD,
    EXTREME,
    IMPOSSIBLE,

    HOLY_SMOKES;

    static final Difficulty[] difficulties;
    static {
        difficulties = values();
    }


    public static Difficulty[] difficulties() {
        return difficulties;
    }


}
