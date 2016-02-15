	public int solution(int[] A){
		int length = A.length;
		int[] stack = new int[length];
		int index = 0, leader = -1, count = 0;
		for (int i = 0; i < length; i++) {
			if (index == 0) 
				stack[index ++] = A[i];
			else {
				if (A[i] != stack[index - 1]) {
					index --;
					continue;
				}else {
					stack[index ++] = A[i];
				}
			}
		}
		if (index == 0) return 0;
		else {
			leader = stack[0];
			for (int i = 0; i < length; i++) {
				if(A[i] == leader) count++;
			}
		}
		if (count > length / 2) {
			int equiLeaderNum = 0, tempCount = 0;
			for (int i = 0; i < length; i++) {
				if (A[i] == leader ) {
					tempCount ++;
				}
				if (tempCount > (i+1)/2 && (count - tempCount)>(length - i - 1)/2) {
					equiLeaderNum ++;
				}
			}
			return equiLeaderNum;
		}
		else {
			return 0;
		}
	}
