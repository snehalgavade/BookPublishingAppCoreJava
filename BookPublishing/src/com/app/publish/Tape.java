package com.app.publish;

import java.time.LocalDate;

public class Tape extends Publication {
    private int playingTime;

	

	public Tape(String title, double price, LocalDate publishDate, int ratings, int playingTime) {
		super(title, price, publishDate, ratings);
		this.playingTime = playingTime;
	}

	public int getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}

	@Override
	public String toString() {
		return "Tape [playingTime=" + playingTime + "]";
	}
    
}
