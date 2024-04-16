package it.epicode.esercizio;

public class Exercise {

    // Esercizio 1

    public static Boolean stringaPariDispari(String stringa) {
      // Boolean isPari = stringa.length() % 2 == 0;
      if (stringa.length() % 2 == 0) {
          return true;
        } else {
          return false;
      }
}

    public static Boolean annoBisestile(int anno){
       Boolean isDivisibile4 = anno % 4 == 0;
       Boolean isDivisibile100 = anno % 100 == 0;
       Boolean isDivisibile400 = anno % 400 == 0;
       if ((isDivisibile4 && !isDivisibile100) || (isDivisibile100 && isDivisibile400)) {
           return true;
       } else {
           return false;
       }
    }

    public static void main (String [] args) {
    String stringa = "Ciao a tutti";
    System.out.println("La stringa è pari: " + stringaPariDispari(stringa));
    int anno = 2020;
    System.out.println("L'anno " + anno + " è bisestile: " + annoBisestile(anno));
    }

}







