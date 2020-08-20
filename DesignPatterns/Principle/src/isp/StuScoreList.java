package isp;
/**
 * 
 * @author 刁秀泽
 * 实现类
 */
public class StuScoreList implements InputModule, CountModule, PrintModule {

	
	private StuScoreList() {
	}
	
	public static InputModule getInputModule() {
		return (InputModule) new StuScoreList();
	}
	
	public static CountModule getCountModule() {
		return (CountModule) new StuScoreList();
	}
	
	public static PrintModule getPrintModule() {
		return (PrintModule) new StuScoreList();
	}
	
	
	@Override
	public void printStuInfo() {
		System.out.println("输出模块CCC：print()");
	}

	@Override
	public void queryStuInfo() {
		System.out.println("输出模块CCC：query()");
	}

	@Override
	public void countTotalScore() {
		System.out.println("统计模块BBB：Total()");
	}

	@Override
	public void countAverage() {
		System.out.println("统计模块BBB：average()");
	}

	@Override
	public void insert() {
		System.out.println("输如模块AAA：insert()");
	}

	@Override
	public void delete() {
		System.out.println("输如模块AAA：delete()");
	}

	@Override
	public void modify() {
		System.out.println("输如模块AAA：modify()");
	}

}
