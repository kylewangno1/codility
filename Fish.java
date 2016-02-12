public int solution(int[] A, int[] B){ 
		int length = B.length;
		int count = 0;
		int[] downFish = new int[length]; //Stack
		int downNum = 0;
		for (int i = 0; i < length; i++) {
			if (B[i] == 1) { // down fish, never meet previous fish
				downFish[downNum++] = A[i]; // record the down fish's size
			}
			else { // up fish will meet all the previous down fish until it's eaten or eat all the down fish
				while(downNum!= 0){
					if (downFish[downNum - 1] < A[i]){
						downNum--;		
					}
					else{ 
						break;
					}
				}
				if (downNum == 0) {
					count ++;
				}
			}
		}
		count += downNum;
		return count;
	}
