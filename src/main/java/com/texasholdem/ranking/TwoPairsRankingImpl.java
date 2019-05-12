package com.texasholdem.ranking;

import com.texasholdem.Player;
import com.texasholdem.RankingEnum;

import java.util.Iterator;
import java.util.Map;

 //解析玩家手中的牌是不是两对(2+2+1)

public class TwoPairsRankingImpl extends AbstractRanking {

    protected RankingResult doResolve(Player player) {

        RankingResult result = null;
        Map<Integer, Integer> rankCount = player.getCardsRankCountMap();

        boolean hasTwo = false;

        if (rankCount.size() == 3) {
            Iterator<Map.Entry<Integer, Integer>> it = rankCount.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, Integer> next = it.next();
                if (next.getValue() == 2 || next.getValue() == 1) {
                    hasTwo = true;
                    break;
                }
            }
        }

        if (hasTwo) {
            result = new RankingResult();
            result.setRankingEnum(RankingEnum.TWO_PAIR);
        }

        return result;
    }

}
