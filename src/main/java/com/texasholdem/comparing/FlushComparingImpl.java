package com.texasholdem.comparing;

import com.texasholdem.Player;


 // 同花顺的大小比较(比较最大牌即可)

public class FlushComparingImpl extends AbstractComparing {

    public int compare(Player o1, Player o2) {
        return this.seqComparing(o1, o2);
    }

}
