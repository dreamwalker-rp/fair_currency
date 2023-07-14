package ru.xunto.fair_currency.configs;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import scala.util.parsing.input.StreamReader;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static java.nio.file.Paths.get;

public class ConfigParser {
    public static int EACH_SIDE_BLOCKS = 2;

    private static String FILE_NAME = "/assets/fair_currency/config.json";

    EntityToLoad entityToLoad;

    public void LoadConfig(){
        InputStream in =  getClass().getResourceAsStream(FILE_NAME);
        Gson gson = new Gson();
        InputStreamReader streamReader = new InputStreamReader(in);
        entityToLoad = gson.fromJson(streamReader, EntityToLoad.class);
    }

    public EntityToLoad getEntityToLoad() {
        if(entityToLoad == null){
            LoadConfig();
        }
        return entityToLoad;
    }

}
