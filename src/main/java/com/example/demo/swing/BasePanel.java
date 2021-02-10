package com.example.demo.swing;

import java.awt.LayoutManager;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BasePanel extends JPanel {
	private JTextField textField;
	private JComboBox<String> jComboBox;
	private JButton jButton;
	private JMenu newViewjMenu;
	
	
	public BasePanel buildPanel() {
		BasePanel basePanel = new BasePanel();
		return basePanel;
	}
	
	@Override
	public void setLayout(LayoutManager mgr) {
		
		super.setLayout(mgr);
	}
	
}
