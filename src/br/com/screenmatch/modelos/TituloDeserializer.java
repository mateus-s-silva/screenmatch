package br.com.screenmatch.modelos;

import br.com.screenmatch.exception.ErroDeConversaoDeAnoException;
import com.google.gson.*;

import java.lang.reflect.Type;

public class TituloDeserializer implements JsonDeserializer<Titulo> {
    @Override
    public Titulo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();

        String tmp = jsonObject.get("Year").getAsString();

        if (tmp.length() > 4){
            throw new ErroDeConversaoDeAnoException("Erro ao converter ano");
        }

        return new Titulo(
                jsonObject.get("Title").getAsString(),
                jsonObject.get("Year").getAsInt()
        );
    }
}
