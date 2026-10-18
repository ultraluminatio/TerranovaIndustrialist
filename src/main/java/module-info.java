module com.programandofodacci.terranovaindustrialist {

    requires atlantafx.base;
    
    requires ch.qos.logback.classic;
    requires ch.qos.logback.core;
    requires com.dlsc.pickerfx;
    requires com.dlsc.preferencesfx;
    requires com.github.oshi;
    requires com.google.gson;
    requires com.google.zxing;
    requires com.sun.jna;
    requires com.sun.jna.platform;
    requires concentus;
    
    requires fr.brouillard.oss.cssfx;
    
    requires gdx.jnigen.loader;
    
    requires jamepad;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.web;
    requires jfxtras.controls;
    requires jfxtras.fxml;
    
    requires kotlin.stdlib;
    
    requires libusb4java;
    
    requires net.synedra.validatorfx;
    requires netty.all;
    
    requires okhttp3;
    requires okio;
    requires org.apache.logging.log4j;
    requires org.apache.poi.ooxml;
    requires org.apache.poi.poi;
    requires org.apache.tika.core;
    requires org.bouncycastle.pkix;
    requires org.bouncycastle.provider;
    requires org.bouncycastle.util;
    requires org.controlsfx.controls;
    requires org.freedesktop.gstreamer;
    requires org.slf4j;

    requires twitch4j.auth;
    requires twitch4j.helix;
    
    requires uk.co.caprica.vlcj;
    requires usb4java;
    
    opens com.programandofodacci.terranovaindustrialist to javafx.fxml, 
            jfxtras.fxml;
    opens com.programandofodacci.terranovaindustrialist.utils to 
            com.programandofodacci.terranovaindustrialist, com.google.gson;
    exports com.programandofodacci.terranovaindustrialist;
}
