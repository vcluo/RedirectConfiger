package com.example.demo.swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;

import javax.swing.*;
/**
 * 
 * @author cpplc
 * @see interface for Peerconnection Service is connection 
 * @since 2021/02/01
 */
public class BaseLayout implements LayoutManager,LayoutManager2{
	private BorderLayout borderLayout;
	private BoxLayout boxLayout;
	private CardLayout cardLayout;
	private GridBagLayout gridBagLayout;
	
	public static final int BORDER_LAYOUT = 1;
	public static final int FLOW_LAYOUT = 2;
	public static final int CARD_LAYOUT = 3;
	public static final int GRIDBAG_LAYOUT = 5;
	
	private int layoutPostion;
	
	public LayoutManager2 buildviewLeftSelect(int layout) {
		layoutPostion = layout;
		LayoutManager2 baseLayoutManager = null ;
		switch (layoutPostion) {
		case 1:
			borderLayout = new BorderLayout();
			baseLayoutManager = borderLayout;
			break;
		case 2:
			boxLayout = new BoxLayout(new JPanel(),BoxLayout.X_AXIS);
			baseLayoutManager = boxLayout;
			break;
		case 3:
			cardLayout = new CardLayout();
			baseLayoutManager = cardLayout;
			break;
		case 5:
			gridBagLayout =  new GridBagLayout();
			baseLayoutManager = gridBagLayout;
			break;
		default:
			break;
		}
		
		return baseLayoutManager;
	}


	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void layoutContainer(Container parent) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addLayoutComponent(Component comp, Object constraints) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public float getLayoutAlignmentX(Container target) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public float getLayoutAlignmentY(Container target) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void invalidateLayout(Container target) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Dimension maximumLayoutSize(Container target) {
		// TODO Auto-generated method stub
		return null;
	}


}
