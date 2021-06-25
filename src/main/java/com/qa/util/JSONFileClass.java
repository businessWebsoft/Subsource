package com.qa.util;

import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriverException;

@SuppressWarnings("serial")
public class JSONFileClass extends WebDriverException implements Serializable {
	public JSONObject readJson() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("./src/test/resources/JsonFiles/Companydata.json");
		Object obj = jsonParser.parse(reader);
		JSONObject userLogIn = (JSONObject) obj;
		return userLogIn;
	}

	public JSONObject readJson1() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("./src/test/resources/JsonFiles/Companydata1.json");
		Object obj = jsonParser.parse(reader);
		JSONObject userLogIn = (JSONObject) obj;
		return userLogIn;
	}

	public JSONObject readJsonShop() throws IOException, ParseException {
		JSONParser jsonParser1 = new JSONParser();
		FileReader readerShop = new FileReader("./src/test/resources/JsonFiles/Shopdata.json");
		Object obj1 = jsonParser1.parse(readerShop);
		JSONObject userLogIn1 = (JSONObject) obj1;
		return userLogIn1;
	}
}
