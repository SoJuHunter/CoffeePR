package kr.co.dw.coffee.utils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

public class CoffeeUtils {

	

	public static String makeNewFilename(String oriName) {
		String newFilename = null;
		
		UUID uid = UUID.randomUUID();
		
		return "";
	}
	
	
	
	public static String makeFolder(String parent) {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		String path = "C:"+File.separator+"coffeeupload";
		
		File coffeeFolder = new File(path);
		if (!coffeeFolder.exists()) {
			coffeeFolder.mkdir();
		}
		
		File parentPath = new File(parent);
		
		File yearFile = new File(parentPath, year + "");
		if (!yearFile.exists()) {
			yearFile.mkdir();
		}
		File monthFile = new File(yearFile, new DecimalFormat("00").format(month));
		if (!monthFile.exists()) {
			monthFile.mkdir();
		}
		File dateFile = new File(monthFile, new DecimalFormat("00").format(date));
	      if (!dateFile.exists()) {
	         dateFile.mkdir();
	    }
	      
		
	      return File.separator+year+
	              File.separator+new DecimalFormat("00").format(month)+
	              File.separator+new DecimalFormat("00").format(date);
	}
	
}
