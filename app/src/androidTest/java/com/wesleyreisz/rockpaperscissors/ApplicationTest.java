package com.wesleyreisz.rockpaperscissors;

import android.app.Application;
import android.test.ApplicationTestCase;

import com.wesleyreisz.rockpaperscissors.Game.GameUtils;

import junit.framework.Assert;

/*
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testScissors(){
        Integer player = R.id.btnScissors;

        Assert.assertEquals(GameUtils.CUTS,GameUtils.evaluateWinner(player,R.id.btnPaper));
        Assert.assertEquals(GameUtils.DECAPITATES,GameUtils.evaluateWinner(player,R.id.btnLizard));
        /*Assert.assertEquals(GameUtils.CRUSHED_BY,GameUtils.evaluateWinner(player,R.id.btnRock));
        Assert.assertEquals(GameUtils.SMASHED_BY,GameUtils.evaluateWinner(player,R.id.btnSpock));*/

        Assert.assertEquals(GameUtils.TIES, GameUtils.evaluateWinner(player, R.id.btnScissors));
    }


    public void testRock() {
        Integer player = R.id.btnRock;

        Assert.assertEquals(GameUtils.CRUSHES, GameUtils.evaluateWinner(player, R.id.btnScissors));
        Assert.assertEquals(GameUtils.CRUSHES, GameUtils.evaluateWinner(player, R.id.btnLizard));
       /* Assert.assertEquals(GameUtils.VAPORIZED_BY, GameUtils.evaluateWinner(player, R.id.btnSpock));
        Assert.assertEquals(GameUtils.COVERED_BY, GameUtils.evaluateWinner(player, R.id.btnPaper));*/

        Assert.assertEquals(GameUtils.TIES, GameUtils.evaluateWinner(player, R.id.btnRock));
    }

    public void testPaper(){
        Integer player = R.id.btnPaper;

        Assert.assertEquals(GameUtils.COVERS,GameUtils.evaluateWinner(player,R.id.btnRock));
        Assert.assertEquals(GameUtils.DISPROVES,GameUtils.evaluateWinner(player,R.id.btnSpock));
        /*Assert.assertEquals(GameUtils.CUT_BY,GameUtils.evaluateWinner(player,R.id.btnScissors));
        Assert.assertEquals(GameUtils.EATEN_BY,GameUtils.evaluateWinner(player,R.id.btnLizard));*/

        Assert.assertEquals(GameUtils.TIES, GameUtils.evaluateWinner(player, R.id.btnPaper));
    }

    public void testLizard(){
        Integer player = R.id.btnLizard;

        Assert.assertEquals(GameUtils.EATS,GameUtils.evaluateWinner(player,R.id.btnPaper));
        Assert.assertEquals(GameUtils.POISONS,GameUtils.evaluateWinner(player,R.id.btnSpock));
        /*Assert.assertEquals(GameUtils.CRUSHED_BY,GameUtils.evaluateWinner(player,R.id.btnRock));
        Assert.assertEquals(GameUtils.DECAPITATED_BY,GameUtils.evaluateWinner(player,R.id.btnScissors));*/

        Assert.assertEquals(GameUtils.TIES, GameUtils.evaluateWinner(player, R.id.btnLizard));

    }

    public void testSpock(){
        Integer player = R.id.btnSpock;

        Assert.assertEquals(GameUtils.SMASHES,GameUtils.evaluateWinner(player,R.id.btnScissors));
        Assert.assertEquals(GameUtils.VAPORIZES,GameUtils.evaluateWinner(player,R.id.btnRock));
        /*Assert.assertEquals(GameUtils.POISONED_BY,GameUtils.evaluateWinner(player,R.id.btnLizard));
        Assert.assertEquals(GameUtils.DISPROVED_BY,GameUtils.evaluateWinner(player,R.id.btnPaper));*/

        Assert.assertEquals(GameUtils.TIES, GameUtils.evaluateWinner(player, R.id.btnSpock));

    }

}