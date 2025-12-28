package estruturaDeDados;

public class Char {

//    O tipo char armazena um único caractere Unicode.
//    Armazena apenas 1 caractere. Usa 2 bytes (16 bits).
    char letra = 'A';
    //    letra++; // agora é 'B'
    char numero = '9';
    char simbolo = '#';
    char acento = 'á';
    char unicode = '\u0041';


    //      Como char representa um código Unicode, pode ser convertido para int:
    char c = 'A';
    int codigo = c; // 65

}
