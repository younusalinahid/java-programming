public class StringDemo03 {

    public static void main(String[] args) {

        String country = "  Bangladesh is my country  ";
        System.out.println(country);

        //removed spaces
        String s3 = country.trim();
        System.out.println(s3);


        char ch = country.charAt(0);
        System.out.println("ch "+ch);

        //Asci value
        int value = country.codePointAt(0);
        System.out.println("Value = "+value);

        //position
        int pos = country.indexOf("is ");
        System.out.println("First position of is ="+pos);

        //word position
        pos = country.lastIndexOf('n');
        System.out.println("Last position of n = "+pos);

    }
}
