	public int solution(int[] H){
	
		// greedy strategy: only add stone when previous one is higher than current
		// build first stone on first position
		// when previous one is lower, we trace back to the same height one than use same stone to build current
		// or it is the lowest one we add one stone
		int length = H.length;
		int[] preHeights = new int[length];
		int stoneNum = 0, preNum = 0;
		for (int i = 0; i < length; i++) {
			while(preNum > 0 && preHeights[preNum-1] > H[i])
				preNum --;	
			if(preNum > 0 && preHeights[preNum-1] == H[i])
				continue;
			else {				
				preHeights[preNum++] = H[i];
				stoneNum ++;
			}
		}		
		return stoneNum;
	}
