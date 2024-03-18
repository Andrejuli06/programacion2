package com.mycompany.ejemploslistas;

import java.util.ArrayList;

public class EjemplosListas {

    public static void main(String[] args) {
        String name []= new String [5];//array
        ArrayList<String> list= new ArrayList<>();
        list.add("hola");
        list.add("mundo");
        list.add("cruel");
        list.set(1,"gente");
        list.remove(2);
        
        System.out.println("saluda: " + list.contains("hola"));
        System.out.println(list.get(0)); 
        System.out.println("Tamaño de la lista: "+ list.size());
        System.out.println("!Esta vacia? "+ list.isEmpty());
        System.out.println("valores de la lista: " + list);
        for (int i=0 ; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }
        for(String item : list){
            System.out.println(item);
        }
    }
}
