public int solution(int[] A){ // time O(n), space: O(1)
		// use a count and index as the stack, different values count --, same ++, index to current count value to
		// find the max number's  value's index
		int dominator = -1;
		int count = 0, index = 0, pre = 0;
		for (int i = 0; i < A.length; i++) {
			if (count == 0) { // case1: beginning , case2: count turn to 0 again
				index = i;			
				count++;
				pre = A[i];
			}
			else {
				if (A[i]!= pre) {
					count --;
				}
				else {
					count ++;
				}
			}
		}
		if (count != 0) {
			int num = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[i] == A[index]) {
					num ++;
				}
			}
			if (num > A.length / 2) {
				dominator = index;
			}
		}
		return dominator;
	}

	public int solution2(int[] A){ // time O(n), space O(n)
		int dominator = -1;
		int length = A.length;
		if (length == 0) {
			return -1;
		}
		int [] stack = new int[length];
		int index = 0;
		for (int i = 0; i < length; i++) {
			if (index != 0 && stack[index - 1] != A[i]) 
				index --;		
			else 
				stack[index++] = A[i];
		}		
		if (index > 0) {
			int count = 0;
			for (int i = 0; i < length; i++) {
				if (A[i] == stack[0])
					count++;
			}
			if (count > length/2) {
				dominator = stack[0];
			}
		}
		return dominator;
	}
