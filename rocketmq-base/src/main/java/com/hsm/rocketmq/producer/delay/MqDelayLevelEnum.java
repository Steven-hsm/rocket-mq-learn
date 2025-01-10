package com.hsm.rocketmq.producer.delay;

public enum MqDelayLevelEnum {
    LEVEL_1(1, "1s"),
    LEVEL_2(2, "5s"),
    LEVEL_3(3, "10s"),
    LEVEL_4(4, "30s"),
    LEVEL_5(5, "1m"),
    LEVEL_6(6, "2m"),
    LEVEL_7(7, "3m"),
    LEVEL_8(8, "4m"),
    LEVEL_9(9, "5m"),
    LEVEL_10(10, "6m"),
    LEVEL_11(11, "7m"),
    LEVEL_12(12, "8m"),
    LEVEL_13(13, "9m"),
    LEVEL_14(14, "10m"),
    LEVEL_15(15, "20m"),
    LEVEL_16(16, "30m"),
    LEVEL_17(17, "1h"),
    LEVEL_18(18, "2h"),
    LEVEL_19(19, "3h"),
    LEVEL_20(20, "4h"),
    LEVEL_21(21, "5h"),
    LEVEL_22(22, "6h"),
    LEVEL_23(23, "7h"),
    LEVEL_24(24, "8h"),
    LEVEL_25(25, "9h"),
    LEVEL_26(26, "10h"),
    LEVEL_27(27, "12h"),
    LEVEL_28(28, "1d"),
    LEVEL_29(29, "2d"),
    LEVEL_30(30, "3d");

    private final int level;
    private final String description;

    MqDelayLevelEnum(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public static MqDelayLevelEnum fromLevel(int level) {
        for (MqDelayLevelEnum delayLevel : MqDelayLevelEnum.values()) {
            if (delayLevel.getLevel() == level) {
                return delayLevel;
            }
        }
        throw new IllegalArgumentException("Invalid delay level: " + level);
    }
}
