public class OperadoresLogicos {
    public static void main(String[] args) {
        // Variables booleanas
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // AND lógico entre 'true' y 'false' → false

        // Variables enteras
        int aNum = 2, bNum = 3, cNum = 4, dNum = 10;

        // Expresión lógica con AND (&&)
        System.out.println(aNum == bNum && cNum < dNum); // false && true → false

        // Expresión lógica con NOT (!) y AND (&&)
        System.out.println(!(aNum == bNum) && cNum > dNum); // true && false → false
    }
}
