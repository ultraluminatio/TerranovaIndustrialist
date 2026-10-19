package com.programandofodacci.terranovaindustrialist.models;

import com.google.gson.annotations.SerializedName;

public class Jogador {

    @SerializedName("jogador_nickname") private String nickName;
    @SerializedName("jogador_email") private String email;




    //Getters
    public String getNickName() {
        return nickName;
    }
    public String getEmail() {
        return email;
    }

    //Setters
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
