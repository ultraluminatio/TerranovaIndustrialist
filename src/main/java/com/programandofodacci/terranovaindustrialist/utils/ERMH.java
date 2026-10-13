package com.programandofodacci.terranovaindustrialist.utils;

import java.time.Duration;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author UltraLuminatio
 */
public class ERMH {
    private static final OkHttpClient okc = new OkHttpClient
        .Builder()
            .callTimeout(Duration.ofSeconds(10))
            .readTimeout(Duration.ofSeconds(30))
            .build();

    public static String requestMethodPost(@NotNull String link, String json){
        Request requesicao = new Request
            .Builder()
                .url(link)
                .header("Accept", "application/json")
                .build();
        
        MediaType tipo_json = MediaType.get("application/json; charset=utf-8");
        RequestBody corpoRequesicao = RequestBody.create(json,tipo_json);
        return "";
    }
    
    
}
