package com.texasholdem.ranking;

import com.texasholdem.Card;
import com.texasholdem.RankingEnum;

//牌型解析接口的返回值

public class RankingResult {

    private Card highCard; // 5张牌中最大的值
    private RankingEnum rankingEnum; // 牌型

    public Card getHighCard() {
        return highCard;
    }

    public void setHighCard(Card highCard) {
        this.highCard = highCard;
    }

    public RankingEnum getRankingEnum() {
        return rankingEnum;
    }

    public void setRankingEnum(RankingEnum rankingEnum) {
        this.rankingEnum = rankingEnum;
    }

    @Override
    public String toString() {
        return "RankingResult{" +
                "rankingEnum=" + rankingEnum.getType() +
                '}';
    }
}
