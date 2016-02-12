// max counter

public int[] solution(int N, int[] A){
	int[] result = new int[N];
	int max = 0 , min = 0, curPosition;
	for (int i = 0; i < A.length; i++) {
		curPosition = A[i] - 1;
		if(A[i] != N+1){
			if (result[curPosition] <= min) {
					result[curPosition] = min + 1;
			}
			else {
				result[curPosition]++;
			}
			if (result[curPosition] > max) {
				max = result[curPosition];
			}
		}
		else 
			min = max;
	} 
	for (int i = 0; i < result.length; i++) {
		if (result[i] < min) {
			result[i] = min;
		}
	}
	return result;
}
