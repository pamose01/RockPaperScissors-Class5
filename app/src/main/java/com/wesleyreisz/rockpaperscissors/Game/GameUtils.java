package com.wesleyreisz.rockpaperscissors.Game;

import android.graphics.Color;

import com.wesleyreisz.rockpaperscissors.GameTypes.GameType;
import com.wesleyreisz.rockpaperscissors.GameTypes.LizardGameTypeImpl;
import com.wesleyreisz.rockpaperscissors.GameTypes.PaperGameTypeImpl;
import com.wesleyreisz.rockpaperscissors.GameTypes.RockGameTypeImpl;
import com.wesleyreisz.rockpaperscissors.GameTypes.ScissorsGameTypeImpl;
import com.wesleyreisz.rockpaperscissors.GameTypes.SpockGameTypeImpl;
import com.wesleyreisz.rockpaperscissors.R;

import java.util.Random;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class GameUtils {
    public static final String WINS = "You Win!!!";
    public static final String LOSES = "You Lose!!!";
    public static final String PUSH = "It's a push. Go Again.";
    //----
    public static final String TIES = "ties";
    public static final String CUTS = "cuts";
    public static final String COVERS = "covers";
    public static final String POISONS = "poisons";
    public static final String SMASHES = "smashes";
    public static final String EATS = "eats";
    public static final String VAPORIZES = "vaporizes";
    public static final String CRUSHES = "crushes";
    public static final String DISPROVES = "disproves";
    public static final String DECAPITATES = "decapitates";

    public static Integer getComputerChoice(){
        Integer selectedValue;
        Random r = new Random(System.currentTimeMillis());

        selectedValue = r.nextInt(5);//
        if(selectedValue==0){
            return R.id.btnRock;
        }else if (selectedValue==1){
            return R.id.btnPaper;
        }else if (selectedValue==2){
            return R.id.btnScissors;
        }else if (selectedValue==3){
            return R.id.btnLizard;
        }else{
            return R.id.btnSpock;
        }
    }

    public static Integer convertButtonToImage(Integer buttonChoice) {
        if(buttonChoice==R.id.btnRock){
            return R.drawable.rock;
        }else if (buttonChoice==R.id.btnPaper){
            return R.drawable.paper;
        }else if (buttonChoice==R.id.btnLizard){
            return R.drawable.lizard;
        }else if (buttonChoice==R.id.btnSpock){
            return R.drawable.spock;
        }else {
            return R.drawable.scissors;
        }
    }


    public static GameResult evaluateWinner(Integer playerSelectedChoice, Integer computerSelectedChoice) {
        GameType gameType;

        if (playerSelectedChoice==R.id.btnRock){
            gameType = new RockGameTypeImpl();
        }else if  (playerSelectedChoice==R.id.btnPaper){
            gameType = new PaperGameTypeImpl();
        }else if  (playerSelectedChoice==R.id.btnSpock){
            gameType = new SpockGameTypeImpl();
        }else if  (playerSelectedChoice==R.id.btnLizard){
            gameType = new LizardGameTypeImpl();
        }else{
            gameType = new ScissorsGameTypeImpl();
        }
        return gameType.eval(computerSelectedChoice);
    }

    public static int defineTextColor(String msg) {
        if(GameUtils.LOSES.equalsIgnoreCase(msg)){
            return Color.RED;
        }else if(GameUtils.WINS.equalsIgnoreCase(msg)){
            return Color.GREEN;
        }else{
            return Color.BLACK;
        }
    }

}

