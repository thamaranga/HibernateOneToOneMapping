package com.hasitha;

import com.hasitha.entity.Laptop;
import com.hasitha.entity.Student;
import com.hasitha.service.LaptopService;
import com.hasitha.service.StudentService;
import com.hasitha.service.impl.LaptopServiceImpl;
import com.hasitha.service.impl.StudentServiceImpl;


public class App 
{
    public static void main( String[] args )
    {

        int result=-1;

        try {

            LaptopService laptopService= new LaptopServiceImpl();
            StudentService studentService= new StudentServiceImpl();

            Laptop laptop= new Laptop();
            laptop.setName("Lenovo 120");
            result=laptopService.addLaptop(laptop);

            if(result>0){
                System.out.println("laptop successfully saved with ID "+result);
            }else{
                System.out.println("Error occured while saving laptop");
            }

            Student student= new Student();
            student.setName("Kasun");
            student.setMarks(85);
            student.setLaptop(laptop);
            result=studentService.addStudent(student);



            if(result>0){
                System.out.println("student successfully saved with ID "+result);
            }else{
                System.out.println("Error occured while saving student");
            }







        } catch (Exception e) {

            System.out.println("e "+e.getMessage());
        }


    }
}
