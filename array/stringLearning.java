public class stringLearning {
    public static void main(String[] args) {
        String a = "ANAND";
        String b = "ajit";
        String c = "      kumar       ";
        String d = "";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(b.concat(a));
        System.out.println(b.length());
        System.out.println(b.toUpperCase());
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
        System.out.println(a.indexOf('D'));
        System.out.println(a.charAt(2));
        System.out.println(a.replace('A','B'));
    }
}

/*  OUTPUT

anand
AJIT
ajitANAND
4
AJIT
kumar
true
4
A
BNBND
*/