package com.wesleyreisz.rockpaperscissors.GameTypes;

import com.wesleyreisz.rockpaperscissors.Game.GameResult;
import com.wesleyreisz.rockpaperscissors.Game.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by Frosty on 9/27/2015.
 */
public class ScissorsGameTypeImpl implements GameType {

    @Override
    public GameResult eval(Integer opponentChoice) {
        GameResult result = new GameResult();
        if (opponentChoice== R.id.btnSpock){
            result.setWinner(R.id.btnSpock);
            result.setTextResult(GameUtils.SMASHES);
            result.setLoser(R.id.btnScissors);
            result.setStatus(GameUtils.LOSES);
        }else if (opponentChoice==R.id.btnPaper){
            result.setWinner(R.id.btnScissors);
            result.setTextResult(GameUtils.CUTS);
            result.setLoser(R.id.btnPaper);
            result.setStatus(GameUtils.WINS);
        }else if (opponentChoice==R.id.btnRock){
            result.setWinner(R.id.btnRock);
            result.setTextResult(GameUtils.CRUSHES);
            result.setLoser(R.id.btnScissors);
            result.setStatus(GameUtils.LOSES);
        }else if (opponentChoice==R.id.btnLizard){
            result.setWinner(R.id.btnScissors);
            result.setTextResult(GameUtils.DECAPITATES);
            result.setLoser(R.id.btnLizard);
            result.setStatus(GameUtils.WINS);
        }
        else{
            result.setWinner(R.id.btnScissors);
            result.setTextResult(GameUtils.TIES);
            result.setLoser(R.id.btnScissors);
            result.setStatus(GameUtils.PUSH);
        }
        return result;
    }
}
