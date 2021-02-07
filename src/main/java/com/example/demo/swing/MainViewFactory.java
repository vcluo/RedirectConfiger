package com.example.demo.swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainViewFactory  implements BaseView{


	@Override
	public void BuildMainview(BaseFrame baseFrame) {
		baseFrame.setTitle("测试窗口");
		baseFrame.setSize(baseFrame.getWidth(),baseFrame.getHeight());
		baseFrame.add(baseFrame.getjPanel());
	}

}
