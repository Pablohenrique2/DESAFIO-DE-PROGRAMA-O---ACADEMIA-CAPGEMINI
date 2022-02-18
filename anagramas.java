
import java.util.ArrayList;

public class anagrama{

        public static void main(String[] args) {

            String palavra = "ovo";

            //fiz dois arraylist para armazena os anagramas
            ArrayList<String> anagramas = new ArrayList<String>();
            ArrayList<String> anagramas2 = new ArrayList<String>();

            //aqui foi feito um laço for para percorrer a palavra duas vezes e comparar
            //o numero pares das strings.
            for(int i = 0; i <palavra.length(); i++) {
                for(int j = 1; j < palavra.length(); j++) {

                    //aqui comparei se e diferente ou igual e qual condiçao cair executar.
                    if(palavra.charAt(i) == palavra.charAt(j) && i !=j && i < j) {
                        if(palavra.charAt(i) == palavra.charAt(i+1)  ) {
                            String x = palavra.substring(i, i + 1);
                            anagramas.add(x);
                        } else {
                            String y = palavra.substring(i, j );//ov
                            String z = palavra.substring(i + 1, j + 1);//vo
                            String a = palavra.substring(i , i + 1 );
                            String h = palavra.substring(i, i + 1);
                            anagramas.add(h);
                            anagramas.add(a);
                            anagramas2.add(z);
                            anagramas2.add(y);



                        }
                    }
                }
            }
            //Nesse comando invoquei os anagrams e o tamanho.
            System.out.println(anagramas.toArray().length);
            System.out.println(anagramas);
            System.out.println(anagramas2);
        }

    }