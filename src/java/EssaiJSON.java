/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author itu
 */
public class EssaiJSON {
    public static void main(String[] args){
        JSONObject obj = new JSONObject();
        JSONArray arr = new JSONArray();
        
        
        String[] a = {"1a","2b","3c"};
        String[] b = {"1aa","2ba","3ca"};
        try{
            for(int i = 0 ; i< a.length ; i++)
            {
                //p = list.get(i);

                obj.put("id", a[i]);
                obj.put("title", b[i]);
                System.out.println(obj);
                arr.put(i,obj);

                obj = new JSONObject();
            }
            System.out.println(arr);
        }
        catch(Exception e){}
        
   }
}
