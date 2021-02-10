package com.example.demo.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;

import com.example.demo.swing.impl.MyFrameImpl;

public class MainViewFactory  implements BaseView{


	@Override
	public void BuildMainview(MyFrameImpl myFrameImpl) {
		myFrameImpl.setTitle("测试窗口");
		myFrameImpl.setSize(new BaseFrame().getWidth(),new BaseFrame().getHeight());
		myFrameImpl.setLayout(new BaseLayout().buildviewLeftSelect(new BaseLayout().GRIDBAG_LAYOUT));
		for (int i = 0; i < baseFrame.getjArrayList().size();i++) {
			baseFrame.add(baseFrame.getjArrayList().get(i));
		}
	}

}
