package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód


        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Adresa adresaProOsobu = new Adresa();
        adresaProOsobu.setObec("Brno");
        adresaProOsobu.setCastObce("Veveří");
        adresaProOsobu.setUlice("Pod kopcem");
        adresaProOsobu.setPsc("655 00");

        Osoba testovaciOsoba = new Osoba();
        testovaciOsoba.setSoukromyEmail("email1@email.cz");
        testovaciOsoba.setPracovniEmail("email2@email.cz");
        testovaciOsoba.set




    }

}
