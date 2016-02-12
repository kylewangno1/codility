	public int solution(int[] A) {
        int length = A.length;
        if (length == 0 || A == null) 
			return -1;
		long lSum = 0, rSum = 0;
		int index = 0;
		while(index < length)
			rSum += A[index++];
		for (int i = 0; i < length; i++) {
			rSum -= A[i];				
			if (lSum == rSum) 
				return i;	
			lSum += A[i];
		}
        return -1;
    }
