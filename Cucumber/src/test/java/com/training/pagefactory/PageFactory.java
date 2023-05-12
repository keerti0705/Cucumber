package com.training.pagefactory;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.training.base.BasePage;
import com.training.pages.LoginPage;


public class PageFactory {
	
	static final HashMap<String, String> packageClassMap = new HashMap<String, String>();
	WebDriver driver;

	static {
		try {

			getClassInPackage(new com.training.utilities.CommonUtilities()
					.getproperty("page.packages"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public BasePage initialize(String pageName) {
		BasePage page = null;
		String formattedPageName = getRemovedSpaceName(pageName);
		try {
			String packageName = packageClassMap.get(formattedPageName);
			if (packageName != null) {
				String pageClassFullName = packageName + "."
						+ formattedPageName;
				page = (BasePage) Class.forName(pageClassFullName)
						.newInstance();
				//page = (BasePage)new LoginPage(driver);
			} else {
				System.out.println("Page Class with" + formattedPageName
						+ "doesnt exist .Please provide valid page Name");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return page;

	}

	private String getRemovedSpaceName(String pageName) {
		return pageName.replaceAll("\\s+", "");
	}

	private static void getClassInPackage(String packageName) {

		String classPath = packageName.replaceAll("\\.",
				Matcher.quoteReplacement(File.separator));
		String srcPath = System.getProperty("user.dir") + "\\src\\test\\java";
		String[] classPathDirs = srcPath.split(System
				.getProperty("path.separator"));
		String name;

		for (String classDir : classPathDirs) {
			try {
				File base = new File(classDir + File.separatorChar + classPath);
				for (File file : base.listFiles()) {
					if (!(file.getName().equalsIgnoreCase(".svn"))) {
						if (file.isDirectory()
								&& !(file.getName().equalsIgnoreCase("factory"))) {
							getClassInPackage(packageName + "."
									+ file.getName());
						} else if (file.getName().contains(".java")) {
							name = file.getName();
							name = name.substring(0, name.lastIndexOf("."));
							packageClassMap.put(name, packageName);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}