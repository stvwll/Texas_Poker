package com.texasholdem.ranking;

import com.texasholdem.Player;
import com.texasholdem.RankingEnum;

 //默认实现, 返回HighCard类型

public class DefaultRankingImpl extends AbstractRanking {

    protected RankingResult doResolve(Player player) {

        RankingResult result = new RankingResult();
        result.setRankingEnum(RankingEnum.HIGH_CARD);

        return result;
    }

}
