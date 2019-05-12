package com.texasholdem.ranking;

import com.texasholdem.Card;
import com.texasholdem.Player;
import com.texasholdem.RankingEnum;

import java.util.List;

//解析玩家手中的牌是不是同花(花色连续一样)
 
public class FlushRankingImpl extends AbstractRanking {

    protected RankingResult doResolve(Player player) {

        RankingResult result = null;

        List<Card> cards = player.getCards();
        if (this.isSameSuit(cards)) { // 如果是同色
            result = new RankingResult();
            result.setRankingEnum(RankingEnum.FLUSH);
        }

        return result;
    }

}
