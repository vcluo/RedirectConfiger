package com.example.demo.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseFrame extends JFrame {
	
	private int width,height;
	private JPanel jPanel;
    // 得到显示器屏幕的宽高
    public int screenwidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    public int screenheight = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	public BaseFrame(int width, int height) throws HeadlessException {
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口可关闭
		//this.setLocationRelativeTo(getParent()); //设置窗口居中显示
		this.setBounds((screenwidth - width) / 2,
                (screenheight - height) / 2, width, height);
		this.setResizable(true); //设置窗口可拉伸
		this.setVisible(true);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public JPanel getjPanel() {
		return jPanel;
	}
	public void setjPanel(JPanel jPanel) {
		this.jPanel = jPanel;
	}
	
	
	
}
