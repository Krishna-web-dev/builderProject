package assignment.builderDesign.builderDesign.Executer;

import assignment.builderDesign.builderDesign.Product.Student;

public class Client<student2> {

    public static void main(String[] args) {

        Student student1 = new Student.StudentBuilder("Krishna", "Verma") // mandatory parameters
                .addAge("90") // optional
                .addGender("M") // optional
                .addHasExperience(true) // optional
                .build(); // to get back student option

        
        
        loggger.info(student1);
        //System.out.println(student1);

    }


}
