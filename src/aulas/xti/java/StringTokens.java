package aulas.xti.java;

public class StringTokens {

    public static void main(String[] args) {
        String s1 = ("XHTML ; CSS ; JavaScript ; Java ; Jquery");
        String[] tokens = s1.split("; "); //retorna um arrya de strings com os tokens

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
