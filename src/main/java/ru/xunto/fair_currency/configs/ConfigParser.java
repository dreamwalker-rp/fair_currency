package ru.xunto.fair_currency.configs;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;

public class ConfigParser {
    private static final String FILE_NAME = "/assets/fair_currency/config.json";

    EntityToLoad entityToLoad;

    public void LoadConfig() {
        InputStream in = getClass().getResourceAsStream(FILE_NAME);
        Gson gson = new Gson();
        InputStreamReader streamReader = new InputStreamReader(in);
        entityToLoad = gson.fromJson(streamReader, EntityToLoad.class);
        System.out.println(entityToLoad);
    }

    public EntityToLoad getEntityToLoad() {
        if (entityToLoad == null) {
            LoadConfig();
        }
        return entityToLoad;
    }

}
