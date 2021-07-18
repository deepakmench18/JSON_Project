package com.bridgelab.Utility;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Utility {
Scanner sc = new Scanner(System.in);
	
	// Inventory data management 
	public void InventryManagment()  {
		JSONParser parser = new JSONParser();
        try {
        	Object object = parser.parse(new FileReader("C:\\Users\\User\\eclipse-workspace\\InventoryManagement\\Invetory\\Inventoryfile.json"));
            JSONObject jsonObject = (JSONObject) object;
            JSONArray itemList = (JSONArray) jsonObject.get("listOfItem");
            System.out.println(itemList);
            Iterator iterator = itemList.iterator();
           long amount , totalamount = 0;
            while (iterator.hasNext()){
                JSONObject jsonobj1 = (JSONObject) iterator.next();
                System.out.println("=======>"+jsonobj1);
              
                long w1 =(long) jsonobj1.get("wieght");
                long p1 =(long) jsonobj1.get("price");

                amount = w1*p1;
                System.out.println("amount of " + jsonobj1.get("name") +" = " + amount);
                totalamount = amount+totalamount;
            }
            System.out.println("total amount = "+totalamount);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
}
