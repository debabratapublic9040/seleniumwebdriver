package ReadDataFromJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.Test;

import com.google.gson.Gson;

public class ReadData {
	
	@Test
	public void getDataFromJSON() throws FileNotFoundException
	{
		File file=new File("D:\\Debabrata Rout\\Eclipse Workplace\\seleniumwebdriver\\config.json");
		System.out.println(file);
		FileReader fileReader=new FileReader(file);
		Gson gson=new Gson();
		Config config=gson.fromJson(fileReader, Config.class);
		 Environment envirinment = config.getEnvironment().get("QA");
		 String url=envirinment.getUrl();
		 System.out.println(url);
	}

}
