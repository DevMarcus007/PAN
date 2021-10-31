package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioWhileJsonApplication {

	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
		SpringApplication.run(DesafioWhileJsonApplication.class, args);
		String caminho = "/home/marcus/Documentos/Java_Projects/DesafioWhileJSON/src/main/java/com/example/";
        String arquivoJson = "produtos.json";

        lerJSON(caminho+arquivoJson);
       

    }

    public static void lerJSON(String arquivo) throws IOException, ParseException, org.json.simple.parser.ParseException {
        JSONArray jsonArray = (JSONArray)  new JSONParser().parse(new FileReader(arquivo));

        Iterator<JSONObject> IJson = jsonArray.iterator();
        System.out.println();
        System.out.println("*".repeat(35));

        while(IJson.hasNext()) {
            JSONObject objetoJSON = (JSONObject) IJson.next();

            Set<Map.Entry<String, String>> atributos = objetoJSON.entrySet();
            for(Map.Entry<String, String> atributo : atributos) {
                System.out.println( "|"+atributo.getKey() + " : " + atributo.getValue()+"|");
            }

            System.out.println("*".repeat(35));
        }
    }

    

}
