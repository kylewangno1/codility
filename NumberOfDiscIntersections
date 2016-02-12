import java.util.Arrays;

// O(n*lgn), sort start index, then use binary search to find the end point's index in start point list
	public int solution(int[] A){
		int count = 0;
		int length = A.length;
		if(length <= 1) return 0;
		double[] startPoint = new double[length];
		double[] endPoint = new double[length];
		for (int i = 0; i < length; i++) {
			startPoint[i] = i - A[i];
			endPoint[i] = i + A[i];
		}
		Arrays.sort(startPoint);
		Arrays.sort(endPoint);
		for (int i = 0; i < length; i++) {
			int index = Arrays.binarySearch(startPoint, endPoint[i]+0.5);
			int insertIdx = -(index + 1);
			System.out.println("insert: "+insertIdx);
			count += (insertIdx -i -1);
			System.out.println("count: "+count);
			if(count > 10000000) return -1;
		}
		return count;
	}
