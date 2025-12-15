package estruturaDeDados;

import java.util.HashMap;

public class DataStructures {

//    ________________________________________________________________________________________________

//    Array:
//    Um array é uma estrutura de dados que
//    armazena um conjunto de valores do mesmo
//    tipo, organizados por índices e possuem tamanho fixo.
//    Principais métodos:
//    - length()

//    Por exemplo:


    int[] numeros = new int[5];
//     Isso é algo do tipo: {0, 0, 0, 0, 0}
//     Criamos um array com 5 posições (índices 0 a 4).

//    __________________________________________________________________________________________________





//    __________________________________________________________________________________________________
//    char:
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

// _______________________________________________________________________________________________________





//    ____________________________________________________________________________________________________

//    Strings
//    - Uma String é uma sequência de caracteres (como uma frase ou palavra).
//    - Diferente de char, ela:
//    - Usa aspas duplas " "
//    - Pode ter vários caracteres
//    - É um objeto da classe String
//    - Strings são imutáveis
//    Principais métodos:
//    - length()
//    - charAt()
//    - toUpperCase() e toLowerCase()
//    - equals() e equalsIgnoreCase()
//    - split()
//    Por exemplo:
    String s = "Java";
//    __________________________________________________________________________________________________________





//    __________________________________________________________________________________________________________

//    HashMap
//      Um HashMap armazena pares chave → valor (key → value).
//      Exemplos de pares:
//      CPF → Nome
//      Código → Produto
//      Placa → Proprietário
//      Cada chave é única, mas valores podem se repetir.

//      Por exemplo:
    HashMap<String, Integer> idades = new HashMap<>();
//    String → tipo da chave
//    Integer → tipo do valor
    idades.put("Ana", 25);
    idades.put("Carlos", 30);
    idades.put("Ana", 26); // Atualiza (chave repetida)

//    Principais métodos:

//    get(chave) – pegar valor pela chave
//    idades.get("Ana");   // retorna 26
//    idades.get("Pedro"); // retorna null

//    remove(chave) – remover elemento
//    idades.remove("Ana");

//    size() – quantidade de elementos
//    idades.size()

//    Percorrendo chaves
//    for (String chave : idades.keySet()) {
//        System.out.println(chave);
//    }


//    Percorrendo valores
//    for (Integer valor : idades.values()) {
//        System.out.println(valor);
//    }


//    Percorrendo chave e valores
//    for (HashMap.Entry<String, Integer> entry : idades.entrySet()) {
//        System.out.println(entry.getKey() + " → " + entry.getValue());
//    }
}
