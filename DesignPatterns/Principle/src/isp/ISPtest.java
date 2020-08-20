package isp;
/**
 * 
 * @author 刁秀泽
 * 
 * 不同点：		  
 * 		单一职责原则注重的是职责			主要约束类，它针对程序中的实现和细节   			如：大学学生工作管理程序
 * 		接口隔离原则注重的是对接口依赖的隔离	主要约束接口，主要针对抽象和对程序整体框架的构建	如：学生成绩管理程序
 * 
 * 共同点：
 * 		要为各个类建立需要他们的专用接口，而不要建立一个很庞大的接口供所有依赖它的类去调用。
 * 
 * 		都是为了提高类的内聚性，减低他们的耦合性，体现了封装的思想
 */
public class ISPtest {
	
	public static void main(String[] args) {
		
		InputModule input = StuScoreList.getInputModule();
		CountModule count = StuScoreList.getCountModule();
		PrintModule print = StuScoreList.getPrintModule();
		
		input.insert();
		input.delete();
		count.countTotalScore();
		count.countAverage();
		print.printStuInfo();
	}

}
