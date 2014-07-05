package com.indecisive.meshidoko.managers;

import java.io.Serializable;

public class VoteManager implements Serializable{
	private static final long serialVersionUID = -4734049795992977745L;
	private int[] voteTotals = new int[3];
	private int voteNum;
	private int voteCount = 0;

	public VoteManager(int peopleNum) {
		voteNum = peopleNum;
	}

	// restaurantId is 0 ~ 2 for now because there are only 3 restaurants
	public void vote(int restaurantId) {
		voteTotals[restaurantId]++;
		voteCount++;
	}
	
	public int getVoteTotalOfRestaurant(int restaurantId) {
		return voteTotals[restaurantId];
	}

	public boolean isVoteFinished() {
		if (voteCount < voteNum) {
			return false;
		} else {
			return true;
		}
	}
}
