package Oop;

import java.util.LinkedList;

public class ListStudentDemo {

    public static void main(String[] args) {
        //Student Linkedlist
        LinkedList<ListStudent> list = new LinkedList<ListStudent>();

        //Student creat
        ListStudent s1 = new ListStudent(82,"Nahid","CSE");
        ListStudent s2 = new ListStudent(81,"Korim","CSE");
        ListStudent s3 = new ListStudent(84,"Rohim","CSE");
        ListStudent s4 = new ListStudent(83,"Josim","CSE");

        //adding student to the studentlist
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //information display
        for (ListStudent s : list){

            System.out.println(s.id+" "+s.name+" "+s.className);
        }


    }

}
