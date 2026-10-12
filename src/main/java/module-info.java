module com.programandofodacci.terranovaindustrialist {

    requires atlantafx.base;
    
    requires ch.qos.logback.classic;
    requires ch.qos.logback.core;
    requires com.github.oshi;
    requires com.google.gson;
    requires com.google.zxing;
    requires com.sun.jna;
    requires com.sun.jna.platform;
    
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
    
    requires libusb4java;
    
    requires okhttp;
    requires org.apache.logging.log4j;
    requires org.apache.poi.ooxml;
    requires org.apache.poi.poi;
    requires org.bouncycastle.pkix;
    requires org.bouncycastle.provider;
    requires org.bouncycastle.util;
    requires org.freedesktop.gstreamer;
    requires org.slf4j;

    requires uk.co.caprica.vlcj;
    requires usb4java;
    
    opens com.programandofodacci.terranovaindustrialist to javafx.fxml, 
            jfxtras.fxml;
    exports com.programandofodacci.terranovaindustrialist;
}
