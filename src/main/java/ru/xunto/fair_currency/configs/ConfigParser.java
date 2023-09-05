package ru.xunto.fair_currency.configs;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import org.codehaus.jackson.map.ObjectMapper;
import ru.xunto.fair_currency.configs.parsejssonstructure.SettingStructure;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConfigParser {
    private static final String FILE_NAME = "/assets/fair_currency/config.json";

    EntityToLoad entityToLoad;

    public void LoadConfig() {
        InputStream in = getClass().getResourceAsStream(FILE_NAME);
        ObjectMapper objectMapper = new ObjectMapper();
        String result = null;
        try {
            result = CharStreams.toString(new InputStreamReader(
                    in, Charsets.UTF_8));
            SettingStructure settingStructure = objectMapper.readValue(result, SettingStructure.class);
            entityToLoad = new EntityToLoad(
                    settingStructure.getBlocksAmount(),
                    settingStructure.getBlocks(),
                    settingStructure.getItems()
            );
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    public EntityToLoad getEntityToLoad() {
        if (entityToLoad == null) {
            LoadConfig();
        }
        return entityToLoad;
    }

}
