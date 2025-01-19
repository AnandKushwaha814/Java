public class a {
    public static void main(String[] args) {
        int a = 4, b, c;
        a += ++a + a-- + --a;                      // ++a पहले बढता है फिर उपयोग होता है
        b = a++ * ++a;                            // a++ पहले जो वैल्यू है उसको उतार दो फिर बाद में बढता है 
        c = a++ + ++b;                           // --a पहले घटता है फिर उपयोग है 
        System.out.println(a);                  //  a-- पहले जो वैल्यू है उसको उतार दो फिर बाद में घटा दो  है 
        System.out.println(b);
        System.out.println(c);
    }
}
