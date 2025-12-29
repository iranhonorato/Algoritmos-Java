package estruturaDeDados;

public class TiposPrimitivos {
//    Inteiros → int ou long
//    byte: 8 bits (intervalor aproximado de -127 a 127) Raramente usado
//    short: 16 bits (intervalo aproximado de -32.768 a 32.767) Quase nunca usado
//    int: 32 bits (intervalo aproximado de ±2.1 bilhões) Padrão de algortimos
//    long: 64 bits (intervalo aproximado de ±9e18) Obrigatório em somas grandes
    byte b = 100;

    short s = 30000;

    int x = 100000;
    int y = -42;

    long u = 100; // Nesse caso como Long cabe em int então não precisa do L
    long v = 1000000000000L; // Já nesse caso precisa do L

//    Racionais → float
//    float: 32 bits (intervalo aproximado de 7 casas decimais) Pouco usado
    float f = 3.14f; // precisa do f

//    Reais → double
//    double: 64 bits (intervalo aproximado de 15 casas decimais) Padrão para reais
    double d = 3.141592653589793;



//    Texto → String
//    char: 16 bits (intervalo aproximado de 0 a 65.535) Unicode
    char letra = 'A'; // letra++ → letra = 'B'
    char numero = '9';
    char simbolo = '#';
    char acento = 'á';
    char unicode = '\u0041';

    //      Como char representa um código Unicode, pode ser convertido para int:
    char c = 'A';
    int codigo = c; // 65
}
