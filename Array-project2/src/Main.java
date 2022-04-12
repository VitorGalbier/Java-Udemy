import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //não aceita numero primitivo, só wrappers classes
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("João");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        for(String el : list){
            System.out.println(el);
        }

        System.out.println("Tamanho " + list.size());

        list.remove("Anna");
        list.remove(1);

        //remove tudo que começa com M
        list.removeIf(x -> x.charAt(0) == 'M');

        list.indexOf("Bob");

        //Só quem começa com uma letra! Converte pra stream e depois volta pra list
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
