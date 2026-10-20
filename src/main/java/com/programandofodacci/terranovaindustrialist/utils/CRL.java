package com.programandofodacci.terranovaindustrialist.utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <h1>Classe registradora de Logs</h1>
 * @author Ultra Luminatio13
 */
public class CRL {
    private static final Logger LOGGER = LoggerFactory.getLogger(CRL.class);

    //Setters
    public static void setInfoLog(String msg){
        LOGGER.info(msg);
    }

    public static void setDebugLog(String msg){
        LOGGER.debug(msg);
    }

    public static void setTrabeLog(String msg){
        LOGGER.trace(msg);
    }

    public static void setWarnLog(String msg){
        LOGGER.warn(msg);
    }

    public static void setErrorLog(String msg){
        LOGGER.error(msg);
    }
}
