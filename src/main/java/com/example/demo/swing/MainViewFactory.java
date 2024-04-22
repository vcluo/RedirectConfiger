package com.example.demo.swing;

import com.example.demo.swing.impl.MyFrameImpl;
import com.example.demo.util.PropertiesUtil;
import org.springframework.stereotype.Component;

@Component
public class MainViewFactory  implements BaseView{


	@Override
	public void BuildMainview(MyFrameImpl myFrameImpl) {
		myFrameImpl.setTitle(new PropertiesUtil().getPropertieString("frametitle"));
		myFrameImpl.setSize(MyFrameImpl.getInstance().getWidth(),MyFrameImpl.getInstance().getHeight());
		myFrameImpl.setLayout(new BaseLayout().buildviewLeftSelect(new BaseLayout().GRIDBAG_LAYOUT));
	}

}
