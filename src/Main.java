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
                count++;
//                System.out.print(i + " ");
            }
        }
//        System.out.println(count);

//uzduotis lengvesni 9


//uzduotis lengvesni 10


//uzduotis sunkesni 1

        int rng = (int) Math.round(Math.random() * 300);

        for (int i = 0; i <= 300; i++) {

        }


    }
}