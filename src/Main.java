import java.util.*;

public class Main {

    public static void main(String[] args) {


        int niz [];
        Object o = 23;
        int a = (int)o;

        //------------------------

        ArrayList<String> list = new ArrayList();

        list.add("49");
        list.add("Pera");

        list.remove(0);

        //list.clear();

        if (!list.isEmpty()){
            System.out.println(list);
        }else {
            System.out.println("Empty list!");
        }

        List<String> list1 = new ArrayList<>(list);

        list1.addAll(list);//drugi pristup

        for (String s : list1){
            System.out.println(s);
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        List randomList = new ArrayList();

        randomList.add(45);
        randomList.add("Marko");
        randomList.add(true);
        randomList.add('A');
        randomList.add(45.99);



        for (Object s:randomList){
            System.out.println(s);
        }

        Collections.sort(list);
        Collections.emptyList();//npr vrati mi empty list

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,8,6,5,4,4,6,2));
        System.out.println("Integer list: " + integerList);

        Set<Integer> set = new HashSet<>(integerList);
        System.out.println("Integer set: " + set);


        /*
    Napraviti klasu Student sa 3 polja, ime, prezime i ocena.
- Napraviti klasu koja sadrzi Main metodu i u njoj napraviti minimum 4 studenta cije podatke treba uneti preko scanner-a: ime prezime i ocena.
- Ocene treba da budu 5,6,7 i 9.
- Kreirati dve liste.
- Kada se preko scanner-a unesu podaci za studenta, taj student treba da se doda u listu.
- Dodati sve studente u jednu listu, a nakon toga u drugu dodati samo one koji su polozili tj. koji imaju ocenu vecu od 5 u drugu listu.
- Potrebno je to uraditi u petlji gde ce unos podataka za studente biti omogucen sve dok se ne unese "quit".
- Kada se unese "quit", program se prekida i ispisuje sve unete studente preko scanner-a, a nakon toga i one koji su polozili tj. koji imaju vecu ocenu od 5.
     */















    }

}