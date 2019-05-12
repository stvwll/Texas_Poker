package com.texasholdem;

// Enum {@code RankingEnum} 牌型的规则排列大小类型
public enum RankingEnum {
    HIGH_CARD("散排 ", 100),
    ONE_PAIR("对子", 200),
    TWO_PAIR("两对", 300),
    THREE_OF_THE_KIND("三条", 400),
    STRAIGHT("顺子", 500),
    FLUSH("同花", 600),
    FULL_HOUSE("葫芦", 700),
    FOUR_OF_THE_KIND("铁支", 800),
    STRAIGHT_FLUSH("同花顺", 900);

    private String type;
    private int priority;

    RankingEnum(String type, int priority) {
        this.type = type;
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
