import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        for (int a = 0; a <= 10; a++) {
            for (int b = 0; b <= 10; b++) {
//                System.out.print(a * b + " ");
            }
//            System.out.println();
        }


        String[] names = {"Jonas", "Gediminas", "Vytautas", "Vilius", "Haroldas"};

        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
        }


        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            // System.out.println(numbers[i]);
        }

        numbers[2] = 16;
        numbers[4] = 20;

        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
        }


//uzduotis lengvesni 1

        for (int i = 0; i < 10; i++) {
//            System.out.println("Labas");
        }

//uzduotis lengvesni 2

        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
        }

//uzduotis lengvesni 3

        String[] plants = {"Roze", "Tulpe", "Zibute", "Kaktusas", "Agurkas", "Pomidoras", "Bulve", "Lazdynas", "Berzas", "Azuolas"};

//uzduotis lengvesni 4

        for (int i = 0; i < plants.length; i += 3) {
//            System.out.print(plants[i] + " ");
        }

//uzduotis lengvesni 5

        for (int i = plants.length - 1; i >= 0; i--) {
//            System.out.print(plants[i] + " ");
        }

//uzduotis lengvesni 6

        for (int i = 10; i <= 50; i += 2) {
//            System.out.print(i  + " ");
        }

//uzduotis lengvesni 7

        for (int i = 10; i <= 50; i += 2) {
            if (i % 10 == 0) {
                continue;
            }
//            System.out.print(i  + " ");
        }

//uzduotis lengvesni 8
        int count = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
//                count++;
//                System.out.print(i + " ");
            }
        }
//        System.out.println(count);

//uzduotis lengvesni 9
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() < 5) {
                count1++;
            }
            if (plants[i].length() > 7) {
                count2++;
            }
        }
//        System.out.println("Masyve elementu trumpesniu nei 5 yra "+count1 + " o elementu ilgesniu nei 7 yra "+count2);


//uzduotis lengvesni 10
        int count3 = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() > 5 && plants[i].length() < 10) {
                count3++;
            }
        }
//        System.out.println("Masyve elementu didesniu nei 5 bet mazesniu nei 10 yra: "+count3);


//uzduotis sunkesni 1

        int count150 = 0;
        int rng = 0;
        for (int i = 0; i <= 300; i++) {
            rng = (int) Math.round(Math.random() * 300);
            if (rng > 150) {
                count150++;
            }
            if (rng > 275) {
//                System.out.print("[" + rng + "] ");
            } else {
//                System.out.print(rng + " ");
            }
        }
//        System.out.println("Skaiciu virs 150 yra " + count150);


//uzduotis sunkesni 2

        String s = " ";
        for (int i = 77; i <= 3000; i += 77) {
            s += i + ",";
        }
        s = s.substring(0, s.length() - 1);
//        System.out.println(s);

//uzduotis sunkesni 3

        for (int i = 1; i < 10; i++) {
//            System.out.println();
            for (int j = 1; j < 10; j++) {
//                System.out.print(" * ");
            }
        }


//uzduotis sunkesni 4

        for (int i = 1; i < 10; i++) {
//            System.out.println();
            for (int j = 1; j < 10; j++) {
//                System.out.print(" * ");
            }
        }

//uzduotis sunkesni 5


        while (true) {
            if (Math.random() > 0.5) {
                System.out.println("Iskrito skaicius");
            } else {
                System.out.println("Iskrito herbas");
                break;
            }
        }

        while (true) {
            if (Math.random() > 0.5) {
                System.out.println("Iskrito skaicius");
            } else {
                System.out.println("Iskrito herbas");
                break;
            }
        }


    }
}