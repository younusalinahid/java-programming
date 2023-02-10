public class Test {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        teacher1.name = "Younus ali";
        teacher1.gender = "male";
        teacher1.phone = 1234567890;


        System.out.println("Name : "+teacher1.name);
        System.out.println("Gender : "+teacher1.gender);
        System.out.println("Phone : "+teacher1.phone);

        System.out.println();
        Teacher teacher2 = new Teacher();

        teacher2.name = "Md.nahid";
        teacher2.gender = "male";
        teacher2.phone = 1710442700;


        System.out.println("Name : "+teacher2.name);
        System.out.println("Gender : "+teacher2.gender);
        System.out.println("Phone : "+teacher2.phone);


    }
}
