import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 定义一个GobangPanel类，该类作为五子棋游戏的主界面类，它还继承自JPanel
 * 
 * @author 熊哥
 * 
 */
public class GobangPanel extends JPanel {

	public static void main(String[] args) {
		GobangPanel gp = new GobangPanel();
		gp.initUI();
	}

	public void initUI() {
		//hello world
		//hello world2
		//
		//
		//computer1
		JFrame frame = new JFrame("五子棋");
		frame.setSize(700, 570);
		frame.setDefaultCloseOperation(3);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		// frame.setLayout(new BorderLayout());//JFrame默认的布局方式就是边框布局

		// 棋盘面板
		//,,,
		this.setBackground(Color.LIGHT_GRAY);
		frame.add(this, BorderLayout.CENTER);

		// 东边按钮面板
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.DARK_GRAY);
		eastPanel.setPreferredSize(new Dimension(150, 0));
		// JPanel默认的布局方式是流式布局居中对齐

		String[] array = { "开始游戏", "悔棋", "认输", "人机对战", "双人对战" };
		for (int i = 0; i < array.length; i++) {
			JButton button = new JButton(array[i]);
			button.setPreferredSize(new Dimension(140, 50));
			eastPanel.add(button);
		}

		frame.add(eastPanel, BorderLayout.EAST);

		frame.setVisible(true);

		GobangListener gl = new GobangListener(this);
		this.addMouseListener(gl);

	}

	/**
	 * 重写JPanel的重绘方法(面板组件的绘制方法)
	 */
	public void paint(Graphics g) {
		super.paint(g);// 调用JPanel类中的paint方法
		for (int i = 0; i < 15; i++) {
			g.drawLine(20, 20 + i * 35, 20 + 14 * 35, 20);
			g.drawLine(20 + i * 35, 20, 20, 20 + 14 * 35);
		}
	}

}
