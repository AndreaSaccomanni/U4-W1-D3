package Esercizio3;

import java.util.Date;

public class Cliente {
    private String codice;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;
    private Articolo[] listaArticoli;


    public Cliente(String codice, String nomeCognome, String email, String dataIscrizione){
        this.codice = codice;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;

    }

    public String getNomeCognome() {
        return nomeCognome;
    }
}
