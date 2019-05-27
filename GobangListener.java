package gobang2;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 
 * @author 熊哥
 * 
 */
public class GobangListener extends MouseAdapter {

	private Graphics g;
	private GobangPanel gp;

	/**
	 * 构造方法
	 * 
	 * @param gp从GobangPanel类传递过来的棋盘面板
	 */
	public GobangListener(GobangPanel gp) {
		this.gp = gp;
	}

	/**
	 * 发生鼠标按键释放时执行的事件处理方法
	 */
	public void mouseReleased(MouseEvent e) {
		g = gp.getGraphics();// 获取画笔画布对象

		int x = e.getX();
		int y = e.getY();

		g.fillOval(x, y, 35, 35);

	}
}
