package com.myproject.aem.core.use;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.cq.sightly.WCMUse;
import com.day.cq.wcm.api.Page;

public class HeaderNavigation extends WCMUse {
	private static final Logger log=LoggerFactory.getLogger(HeaderNavigation.class);
public Map<String,List<String>> nav=new HashMap<String,List<String>>();
	@Override
	public void activate() throws Exception {
   String navPath = getCurrentStyle().get("navigation",String.class);
		if(null != navPath)
		{
			log.debug("Page Navigation Path : {}",navPath);
			Page parentPage=getResourceResolver().resolve(navPath).adaptTo(Page.class);
			if(null != parentPage)
			{
				Iterator<Page> children = parentPage.listChildren();  
				while(children.hasNext())
				{
					Page nextPage=children.next();
					List<String>  props=new ArrayList<String>();
					props.add(nextPage.getTitle());
					nav.put(nextPage.getPath(), props);
				}
			}
		}
	}

public Map<String, List<String>> getNav(){
	
	return nav;
}

}

