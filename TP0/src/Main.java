
import tp0.Client;
import tp0.Clients;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author youssef
 */
public class Main {

    public static void main(String args[]) {
        Client c = new Client.ClientBuilder("C2")
                .nom("fares")
                .prenom("pascal")
                .rue("Zkak")
                .code("0324")
                .etat("Bey")
                .ville("Beyrouth")
                .pays("Liban")
                .telephone("01840161")
                .mail("pf@isae.edu.lb")
                .build();
        System.out.printf("%s", c);
        Clients.insert(c);
    }
}
