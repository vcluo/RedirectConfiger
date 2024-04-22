package com.example.demo;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.example.demo.swing.BaseFrame;
import com.example.demo.swing.BaseLayout;
import com.example.demo.swing.BasePanel;
import com.example.demo.swing.MainViewFactory;
import com.example.demo.swing.impl.MyFrameImpl;
import org.springframework.context.ApplicationContext;

/**
 * 
 * @author cpplc
 * @see interface for Peerconnection Service is connection 
 * @since 2021/02/01
 */
@SpringBootApplication
public class RedirectConfigerApplication {
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(RedirectConfigerApplication.class);
		builder.headless(false).run(args);
		MainViewFactory mainViewFactory = new MainViewFactory();
		mainViewFactory.BuildMainview(MyFrameImpl.getInstance());
	}

}
