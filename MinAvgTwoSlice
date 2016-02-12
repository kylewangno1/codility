	/**
	 * 
	The key to solve this task is these two patterns:  
	(1) There must be some slices, with length of two or three, having the minimal average value among all the slices. 
	(2) And all the longer slices with minimal average are built up with these 2-element and/or 3-element small slices.
	
	 prove: http://codesays.com/2014/solution-to-min-avg-two-slice-by-codility/
	 * 
	 * */
	public int solution(int[] A){
		int length = A.length;
		double curMin = Double.MAX_VALUE;
		int minIdx = 0;
		double cur;
		for (int i = 0; i < length - 1; i++) {
			cur = (A[i] + A[i+1])/2.0;
			if( cur < curMin){
				curMin = cur;
				minIdx = i;
			}
			if(i+2 <= length - 1){
				cur = (cur * 2 + A[i+2])/3.0;
				if (cur < curMin) {
					curMin = cur;
					minIdx = i;
				}
			}
		}
		return minIdx;
	}
