package p129;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NotRecursionQuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 7, 6, 5, 3, 2, 8, 1 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int startIndex, int endIndex) {
		// ��һ������ջ������ݹ�ĺ���ջ
		Stack<Map<String, Integer>> quickSortStack = new Stack<Map<String, Integer>>();
		// �������е���ֹ�±�,�Թ�ϣ����ʽ��ջ
		Map rootParam = new HashMap();
		rootParam.put("startIndex", startIndex);
		rootParam.put("endIndex", endIndex);
		quickSortStack.push(rootParam);

		// ѭ����������:ջΪ��ʱ
		while (!quickSortStack.isEmpty()) {
			// ջ��Ԫ�س�ջ,�õ���ֹ�±�
			Map<String, Integer> param = quickSortStack.pop();
			// �õ���׼Ԫ��λ��
			int pivotIndex = partition(arr, param.get("startIndex"), param.get("endIndex"));
			// ���ݻ�׼Ԫ�ط�Ϊ������,��ÿһ���ֵ���ֹ�±���ջ
			if (param.get("startIndex") < pivotIndex - 1) {
				HashMap<String, Integer> leftParam = new HashMap<String, Integer>();
				leftParam.put("startIndex", param.get("startIndex"));
				leftParam.put("endIndex", pivotIndex - 1);
				quickSortStack.push(leftParam);
			}
			if (pivotIndex + 1 < param.get("endIndex")) {
				HashMap<String, Integer> rightparam = new HashMap<String, Integer>();
				rightparam.put("startIndex", pivotIndex + 1);
				rightparam.put("endIndex", param.get("endIndex"));
				quickSortStack.push(rightparam);
			}
		}
	}

	/**
	 * (����)����ѭ����
	 * 
	 * @param arr
	 *            ������������
	 * @param startIndex
	 *            ��ʼ�±�
	 * @param endIndex
	 *            �����±�
	 * @return
	 */
	private static int partition(int[] arr, Integer startIndex, Integer endIndex) {
		// ȡ��1��λ��(Ҳ����ѡ�����λ��)��Ԫ����Ϊ��׼Ԫ��
		int pivot = arr[startIndex];
		int mark = startIndex;

		for (int i = startIndex + 1; i <= endIndex; i++) {
			if (arr[i] < pivot) {
				mark++;
				int temp = arr[mark];
				arr[mark] = arr[i];
				arr[i] = temp;
			}
		}
		arr[startIndex] = arr[mark];
		arr[mark] = pivot;
		return mark;
	}

}
