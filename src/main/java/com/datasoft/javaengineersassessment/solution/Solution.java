package com.datasoft.javaengineersassessment.solution;

import java.util.ArrayList;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
public class Solution implements Runnable{
    @Override
    public void run() {
        System.out.println("All set ...");
        //take the number of test cases in inputNo
        int testNo = Integer.parseInt(IO.readLine());
        String [] dataObjects = null;
        //create a JSON Array which will store the JSON Objects
        JSONArray ja = new JSONArray();
        //the attibutes are stored in an LIST called attributes
        ArrayList<String> attributes = new ArrayList<>();
        for (int i = 0;i<testNo;i++){
            //take the input of nT and nD in n array
            String [] stringN = IO.readLine().split(" ");
            int [] n = new int[stringN.length];
            for(int j = 0; j<n.length; j++){
                n[j] = Integer.parseInt(stringN[j]);
            }
            //take input of data objects of nT numbers
            dataObjects = IO.readLine().split(" ");
            //considering the inputs will be in this format 'name:L. Messi' 
            //and the input stream will be ended by a new line for each JSON object
            for (int j =0; j< n[1];j++){
                //each data in JSONArray will be a JSON Object
                JSONObject jo = new JSONObject();
                String input = IO.readLine();
                //since JSON Objects can have multiple number of attributes,
                do{
                    String[]inputs = input.split(":");
                    //checks if the attribute added was already there before
                    if(attributes.contains(inputs[0].toLowerCase())){
                       attributes.add(inputs[0].toLowerCase()); 
                    }
                    jo.put(inputs[0], inputs[1]);
                    input=IO.readLine();
                }while((input).length() != 0);
                //now the JSON object will be added in the JSON Array
                ja.add(jo);
            }
	}
        //all the inputs are taken
        //OUTPUT:
        //for each element in ja array
        //output 'Test#1'
        for(int i =1; i<=testNo;i++ ){
            System.out.println("Test#"+i);
            //output 'players'
            for(String dataObject:dataObjects){
                System.out.println(dataObject);
                //output 'id name club age position'
                System.out.print("id ");
                for(String attribute:attributes){
                    System.out.print(attribute+" ");
                }
            }
        }
    System.out.println("Goodbye :)");
    }
}
