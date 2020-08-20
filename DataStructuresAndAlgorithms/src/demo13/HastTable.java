package demo13;

import java.util.Arrays;

public class HastTable {

	private StuInfo[] data = new StuInfo[100];

	/**
	 * 向散列列表中添加元素
	 * 
	 * @param stuInfo
	 */
	public void put(StuInfo stuInfo) {
		// 调用散列函数获取存储位置
		int index = stuInfo.hashCode();
		// 添加元素
		data[index] = stuInfo;
	}

	public StuInfo get(StuInfo stuInfo) {
		return data[stuInfo.hashCode()];
	}

	@Override
	public String toString() {
		return "HastTable [data=" + Arrays.toString(data) + "]";
	}
}