package com.example.demo.swing.impl;

import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.JPanel;

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
	
	
	

}
