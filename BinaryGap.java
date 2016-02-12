public int solution(int N){
		// transfer integer to binary represented string
		// using N & 1 as bit and N /= 2 for next loop until N = 0 , result is in reverse order
		// gap count only after first 1 e.g.  1100 gap = 0,  1101 gap = 1, 1100101 gap = 2
		
		StringBuilder sb = new StringBuilder();
		int maxGap = 0, gap = 0;
		boolean flag = false;
		System.out.println();
		while(N>0){	
			if ((N & 1) == 1) {
				flag = true;
				maxGap = Math.max(maxGap, gap);
				gap = 0;
				sb.append(1);
			}
			else {
				if (flag) {
					gap ++;
				}
				sb.append(0);
			}			
			N = N >> 1;
		}
		return maxGap;
	}
