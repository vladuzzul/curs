public class Main {
    public static void main(String[] args){
        int obiecte = 4;
        double y = 0.25;
        String nume = "robot";
        boolean pornit = true;

        if (obiecte > 2) {
            System.out.println("Sunt mai mult de 2 obiecte");
        }

        if (pornit) { // daca pornit == true
            System.out.println("Robotul e pornit");
        }
        else {
            System.out.println("Robotul e oprit");
        }

        for (int i = 0; i < obiecte; i++){
            System.out.println("Obiectul " + i);
        }
        System.out.println(obiecte);
    }
}
