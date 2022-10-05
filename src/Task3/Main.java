package Task3;

import java.util.ArrayList;

public class Main {
    static ArrayList<Costumer> costumers = new ArrayList<>();

    public static void main(String[] args) {
    Costumer c1 = new Costumer("Sander", "Roust", "snadering");
    Costumer c2 = new Costumer("Tobias", "Berg", "toby312");
    Costumer c3 = new Costumer("Morten", "Larsen", "Mlarsen01");
    Costumer c4 = new Costumer("Clara", "Jensen", "Claary");
    Costumer c5 = new Costumer("Lotte", "Carlsson", "LcarlsonE");
    Costumer c6 = new Costumer("Jack", "Oulund", "Jackiboi");

        costumers.add(c1);
        costumers.add(c2);
        costumers.add(c3);
        costumers.add(c4);
        costumers.add(c5);
        costumers.add(c6);

        printCostumers(costumers);

    }

    public static void printCostumers(ArrayList<Costumer> arrayList){

        for (Costumer c:arrayList) {
            System.out.println(c.toString());
        }



    }



}
