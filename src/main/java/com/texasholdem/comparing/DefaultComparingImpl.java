package com.texasholdem.comparing;

import com.texasholdem.Player;


 //默认的大小比较(按顺序比较)
 
public class DefaultComparingImpl extends AbstractComparing {

    public int compare(Player o1, Player o2) {
        return this.seqComparing(o1, o2);
    }

}
