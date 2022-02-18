import java.util.Scanner;

public class testando {
    public static void main(String[] args) {
        //Pedindo para o usuario que digite a senha.
        Scanner scan = new Scanner(System.in);//funçao que posibilita pedir senha para o usuario.
        System.out.println("Crie a sua senha:");
        String senha = scan.next();//recebe a senha do usuario.


        // verifica se a senha esta ok ou esta invalida.
        if (senhaForte(senha) == true){
            System.out.println("Parabéns sua senha e forte e ela possui"
                    + " "+ senha.length() + " " +"caracteres");}else if(senhaForte(senha) == false) {
            System.out.println("senha invalida,não se adequa aos requisitos de uma senha forte.");

        }
    }

    //funçao para verificar a senha.
    public static boolean senhaForte(String senha) {

        // verificar se a senha tem mais de 6 caracteres;
        if (senha.length() < 6) return false;

        //declarando as condições
        boolean achouNumero = false;
        boolean achouMaiuscula = false;
        boolean achouMinuscula = false;
        boolean achouSimbolo = false;

        // funçao for each que verifica a senha se contem os caracteres pedidos .
        for (char c : senha.toCharArray()) {
            if (c >= '0' && c <= '9') {
                achouNumero = true;
            } else if (c >= 'A' && c <= 'Z') {
                achouMaiuscula = true;
            } else if (c >= 'a' && c <= 'z') {
                achouMinuscula = true;
            } else {
                achouSimbolo = true;
            }
        }
        //retorna todas condições para assim ver se e uma senha forte e valida;
        return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
    }

}