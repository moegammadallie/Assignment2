package Assinmentchp2;

import java.util.*;

public class Assign2 {
        public static void main( String[] args){

            //List
            List carList = new ArrayList();
            carList.add("Honda");
            carList.add("VW");
            carList.add("Nissan");
            for(int i=0; i<carList.size(); i++)
                System.out.println(carList.get(i));

            //Set
            Set carSet = new HashSet();
            carSet.add("Ferrari");
            carSet.add("Lamborghini");
            carSet.add("Mclaren");
            for(int i=0; i<carSet.size(); i++)
                System.out.println(carSet.toArray()[i]);

            //Map
            Map carMap = new HashMap();
            carMap.put("1", "Bugatti");

            //collection of objects
            Collection<NewObject> Col = new ArrayList<NewObject>();
            Col.add(new NewObject("BMW"));
            Col.add(new NewObject("Audi"));
            for(int i=0; i<Col.size(); i++)
                System.out.println(((ArrayList<NewObject>) Col).get(i).getCarName());


        }

    }

