package com.wesleyreisz.rockpaperscissors.GameTypes;

import com.wesleyreisz.rockpaperscissors.Game.GameResult;

/**
 * Created by Frosty on 9/27/2015.
 */
public interface GameType {
    public GameResult eval(Integer opponentChoice);
}
