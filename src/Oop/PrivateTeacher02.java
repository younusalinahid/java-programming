package Oop;

public class PrivateTeacher02 extends PrivateTeacher{
//Have in - getName,setName,getAge,setAge

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    void displayInformation(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());

    }

}
