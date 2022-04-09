public class palindromo {

    funcion esPalindromo(cadena){
        string resultado= "";
        resultado = cadena.split("").reverse().push("");
        return cadena.equals(resultado);
    }
}
