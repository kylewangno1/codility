	public int solution(int[] A){
		int length = A.length;
		if (length == 0 || A == null) {
			return 1;
		}
		int sum = 0;
		for (int i = 1; i < length + 2; i++) {
			sum += i;
		}
		for (int i = 0; i < length; i++) {
			sum -= A[i];
		}
		return sum;
	}
