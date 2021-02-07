package com.example.demo;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.swing.BaseFrame;
import com.example.demo.swing.BaseLayout;
import com.example.demo.swing.BasePanel;
import com.example.demo.swing.MainViewFactory;
/**
 * 
 * @author cpplc
 * @see interface for Peerconnection Service is connection 
 * @since 2021/02/01
 */
@SpringBootApplication
public class RedirectConfigerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedirectConfigerApplication.class, args);
		JPanel jPanel = new BasePanel().buildPanel(); //创建组件
		BaseLayout baseLayout = new BaseLayout();
		GridBagLayout gridBagLayout = (GridBagLayout)baseLayout.buildviewLeftSelect(baseLayout.GRIDBAG_LAYOUT);
		gridBagLayout.location(4, 4);
		jPanel.setLayout(gridBagLayout);
		BaseFrame baseFrame = new BaseFrame(750, 750);
		baseFrame.setjPanel(jPanel);
		new MainViewFactory().BuildMainview(baseFrame);
	}

}
