package com.example.demo.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseFrame extends JFrame {
	
	private int width,height;
	private ArrayList<JPanel> jArrayList;
    // 得到显示器屏幕的宽高
    public int screenwidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    public int screenheight = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	public BaseFrame() throws HeadlessException {
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口可关闭
		//this.setLocationRelativeTo(getParent()); //设置窗口居中显示
		this.setBounds((screenwidth - width) / 2,
                (screenheight - height) / 2, width, height);
		this.setResizable(true); //设置窗口可拉伸
		this.setVisible(true);
	}
	
	public ArrayList<JPanel> getjArrayList() {
		return jArrayList;
	}

	public void setjArrayList(ArrayList<JPanel> jArrayList) {
		this.jArrayList = jArrayList;
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

	
	
	
}
