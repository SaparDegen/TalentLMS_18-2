import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Home[] home = {
                new Flat("150,Mira street"),
                new Hotel("216,Abdyrahmanova street"),
                new Hostel("45,Shopokov street")
        };

        int familyNumber = 10;
        int[] arrFamily = new int[familyNumber];
        int sumPer = 0;
        for (int i = 0; i < arrFamily.length; i++) {
            arrFamily[i] = random.nextInt(2,6);
            sumPer += arrFamily[i];
        }
        Person[] arrPerson = new Person[sumPer];
        int a = 0, a1 = 0, a2 = 0, a3 = 0;
        for (int i = 0; i < arrFamily.length; i++) {
            int homeInt = random.nextInt(0, 3);
            for (int j = 0; j < arrFamily[i]; j++) {
                arrPerson[a] = new Person("Name" + (a + 1), "Surname" + (i + 1), home[homeInt]);
                if (arrPerson[a].getHome().getClass().getSimpleName().equals(home[0].getClass().getSimpleName())) {
                    a1++;
                } else if (arrPerson[a].getHome().getClass().getSimpleName().equals(home[1].getClass().getSimpleName())) {
                    a2++;
                } else if (arrPerson[a].getHome().getClass().getSimpleName().equals(home[2].getClass().getSimpleName())) {
                    a3++;
                }
                a++;
            }
        }
        //System.out.println(Arrays.toString(arrPerson));
        System.out.printf("In the Flat live %d person, in the Hotel live %d person, in the Hostel live %d person.\n", a1, a2, a3);
        System.out.println(arrPerson[5].toString());
        System.out.println("Address of residence " + arrPerson[5].getName() + ": " + arrPerson[5].getHome().getAddress());
        arrPerson[5].getHome().living();
        System.out.println(arrPerson[5].getName() + " " + arrPerson[5].getHome().housingFee());
    }
}