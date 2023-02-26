import java.io.File;

public class FileDemo {

    public static void main(String[] args) {

        File dir = new File("Person");
        dir.mkdir();//directory will be created
        String path = dir.getAbsolutePath();

        File file1 = new File(path+"Student.txt");
        File file2 = new File(path+"Teacher.txt");

        try{

            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created ");

        }catch (Exception e){
            System.out.println(e);
        }


    }

}
