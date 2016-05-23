package com.example.julia.roombooking;

import com.google.gson.Gson;

import java.security.Timestamp;

/**
 * Created by Julia on 24.05.2016.
 */
public class User {

    private String bruker_kode;
    private String fornavn;
    private String etternavn;
    private String epost;
    private int bruker_type_id;
    private String passord;
    private String random;
    private int vertifiser;
    private Timestamp opprettet;

    private String ll;




    public User(String bruker_kode, String fornavn, String etternavn, String epost, String passord, String random, int vertifiser, Timestamp opprettet) {
        this.bruker_kode = bruker_kode;
        this.fornavn = fornavn;
        this.etternavn= etternavn;
        this.epost = epost;
        this.passord = passord;
        this.random = random;
        this.vertifiser = vertifiser;
        this.opprettet = opprettet;

    }

    public String getBruker_kode() {return bruker_kode;}

    public void setBruker_kode(String bruker_kode) {this.bruker_kode = bruker_kode;}

    public String getFornavn() {return fornavn;}

    public void setFornavn(String fornavn) {this.fornavn = fornavn;}

    public String getEtternavn() {return etternavn;}

    public void setEtternavn(String etternavn) {this.etternavn = etternavn;}

    public String getEpost() {return epost;}

    public void setEpost(String epost) {this.epost = epost;}

    public int getBruker_type_id() {return bruker_type_id;}

    public void setBruker_type_id(int bruker_type_id) {this.bruker_type_id = bruker_type_id;}

    public String getPassord() {return passord;}

    public void setPassord(String passord) {this.passord = passord;}

    public String getRandom() {return random;}

    public void setRandom(String random) {this.random = random;}

    public int getVertifiser() {return vertifiser;}

    public void setVertifiser(int vertifiser) {this.vertifiser = vertifiser;}

    public Timestamp getOpprettet() {return opprettet;}

    public void setOpprettet(Timestamp opprettet) {this.opprettet = opprettet;}

    public String toJSONString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;

}

}
