package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylis {
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();

        List.add(3);
        List.add(2);
        List.add(7);
        List.add(5);

        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);

        for(int i = 0; i<List.size();i++){
            if(List.get(i) %2==0){
                System.out.println(true);        ;
            }
            else {
                System.out.println(false);
            }
        }

        }
    }


