package estruturaDeDados;

public class HashMap {

    public static void main(String[] args) {


    //      Um HashMap armazena pares chave → valor (key → value).
//      Exemplos de pares:
//      CPF → Nome
//      Código → Produto
//      Placa → Proprietário
//      Cada chave é única, mas valores podem se repetir.

    //      Por exemplo:
    java.util.HashMap<String, Integer> idades = new java.util.HashMap<>();
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
}
