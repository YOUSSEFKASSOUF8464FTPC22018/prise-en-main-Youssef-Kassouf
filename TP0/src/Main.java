
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
                .nom("Kassouf")
                .prenom("Youssef")
                .rue("Rassieh")
                .code("0")
                .etat("")
                .ville("Zahle")
                .pays("Liban")
                .telephone("00000000")
                .mail("youssef.kassouf@isae.edu.lb")
                .build();
        System.out.printf("%s", c);
        Clients.insert(c);
    }
}
