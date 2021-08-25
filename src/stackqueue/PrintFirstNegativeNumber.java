package stackqueue;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFirstNegativeNumber {

	public long[] printFirstNegativeInteger(long A[], int N, int K) {

		Map<Integer, Long> map = new LinkedHashMap<Integer, Long>();

		for (int i = 0; i < K; i++) {
			if (A[i] < 0) {
				map.put(i, A[i]);
			}
		}
		int index = 0;

		long[] arr = new long[N - K + 1];

		if (map.size() > 0) {
			arr[index++] = map.get(map.keySet().iterator().next());
			map.remove(0);
		} else {
			arr[index++] = 0;
		}

		for (int i = K; i < N; i++) {
			if (A[i] < 0)
				map.put(i, A[i]);
			if (map.size() == 0) {
				arr[index++] = 0;
			} else {
				arr[index++] = map.get(map.keySet().iterator().next());
			}
			map.remove(index - 1);
		}

		return arr;

	}

}
