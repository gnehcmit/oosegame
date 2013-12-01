package com.oose.chessgame.chinesechessman;

import android.graphics.BitmapFactory;

import com.oose.chessgame.ChessMan;
import com.oose.game.OOSEGame;
import com.oose.game.R;

public class RedCar extends ChessMan{

	public RedCar(int x, int y, int belong) {
		super(x, y, belong);
		this.icon = BitmapFactory.decodeResource(OOSEGame.getRes(), R.drawable.red_car);
	}
	@Override
	public boolean moveValid(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

}