import java.util.ArrayList;
import java.util.List;


public class loop {
    public static void main(String[] args) {

        // aqui foi criada uma arraylist para agrupar os objetos
         List<String> degraus = new ArrayList<>();


         // foi declarada a quantidade de degraus
         int qtdDegraus = 6;


        // foi executada a função que descreve o degrau que eo * que repita
        // 6vezes em forma que possibilita o formato da escada.
        for (int i = 0; i < qtdDegraus; i++) {
            degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
        }


        // aqui possibilita que o degrau seja criado que e repeti o * na tela .
        for (String d : degraus ) {
            System.out.println(d);
        }
      }
    }
