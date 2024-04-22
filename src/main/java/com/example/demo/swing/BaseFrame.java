package com.example.demo.swing;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.Objects;
import javax.swing.JFrame;
public class BaseFrame extends JFrame {
    // 得到显示器屏幕的宽高
    public static int screenwidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static int screenheight = Toolkit.getDefaultToolkit().getScreenSize().height;

}
