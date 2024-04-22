package com.example.demo.swing.impl;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.*;

import com.example.demo.swing.BaseFrame;
import com.example.demo.swing.BasePanel;

public class MyFrameImpl extends BaseFrame{

	
	private ArrayList<JPanel> jPanels = new ArrayList<JPanel>();

	public void buildFrame() {
		JPanel jPanel = new BasePanel().buildPanel(); //创建组件
		JPanel jPanel1 = new BasePanel().buildPanel(); //创建组件
		JPanel jPanel2 = new BasePanel().buildPanel(); //创建组件
		JPanel jPanel3 = new BasePanel().buildPanel(); //创建组件
		
		jPanels.add(jPanel);
		jPanels.add(jPanel1);
		jPanels.add(jPanel2);
		jPanels.add(jPanel3);
	}
	private static MyFrameImpl baseFrame = null;

	private MyFrameImpl() throws HeadlessException {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口可关闭
		this.setLocationRelativeTo(getParent()); //设置窗口居中显示
		this.setBounds((screenwidth ) / 4,
				(screenheight ) / 4, (screenwidth ) / 2,
				(screenheight ) / 2);
		this.setResizable(true); //设置窗口可拉伸
		this.setVisible(true);
	}

	public static MyFrameImpl getInstance(){
		if(Objects.isNull(baseFrame)){
			baseFrame = new MyFrameImpl();
			return baseFrame;
		}else{
			return baseFrame;
		}
	}
	@Override
	public void setSize(int width, int height) {
		super.setSize(width, height);
	}
}
