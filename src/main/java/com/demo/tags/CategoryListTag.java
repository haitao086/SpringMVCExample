package com.demo.tags;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.jsp.JspWriter;
import org.springframework.web.servlet.tags.*;

public class CategoryListTag extends RequestContextAwareTag {

	@Override
	public void doFinally() {
		JspWriter writer = pageContext.getOut();
		try {
			List<String> categories = new ArrayList<String>();
			categories.add("Category 1");
			categories.add("Category 2");
			categories.add("Category 3");
			categories.add("Category 4");
			categories.add("Category 5");
			if (categories.size() > 0) {
				writer.print("<ul>");
				for (String category : categories) {
					writer.print("<li><a href=\"#\">" + category + "</a></li>");
				}
				writer.print("</ul>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected int doStartTagInternal() throws Exception {
		return 0;
	}

}