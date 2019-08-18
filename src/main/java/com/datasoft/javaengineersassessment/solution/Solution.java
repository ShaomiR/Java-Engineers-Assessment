package com.datasoft.javaengineersassessment.solution;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class Solution implements Runnable{
    @Override
    public void run() {
        System.out.println("All set ...");
        //take the number of test cases in inputNo
        int testNo = Integer.parseInt(IO.readLine());
        for (int i = 0;i<testNo;i++)
        {
            //take the input of nT and nD in n array
            String [] stringN = IO.readLine().split(" ");
            int [] n = new int[stringN.length];
            for(int j = 0; j<n.length; j++){
                n[j] = Integer.parseInt(stringN[j]);
            }
            //take input of data objects of nT numbers
            String [] dataObjects = IO.readLine().split(" ");
            //create a JSON Array which will store the JSON Objects
            JSONArray ja = new JSONArray();
            //considering the inputs will be in this format 'name:L. Messi' 
            //and the input stream will be ended by a new line for each JSON object
            for (int j =0; j< n[1];i++){
                //each data in JSONArray will be a JSON Object
                JSONObject jo = new JSONObject()
            }
            System.out.println("Goodbye :)");
	}
    }
}
