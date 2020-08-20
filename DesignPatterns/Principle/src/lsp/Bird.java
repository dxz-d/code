package lsp;
/**
 * 
 * @author 刁秀泽
 *	鸟类
 */
public class Bird {

	double flySpeed;

	public void setSpeed(double speed) {
		flySpeed = speed;
	}	
	
	public double getFlyTime(double distance) {
		return distance/flySpeed;
	}
}
