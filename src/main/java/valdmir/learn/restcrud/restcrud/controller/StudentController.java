package valdmir.learn.restcrud.restcrud.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import valdmir.learn.restcrud.restcrud.entity.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    /*@GetMapping("/student")
    public Student getStudent(){
        return new Student("Ramesh","Wijaya");
    }*/
    @GetMapping("/student")
    public Student studentQueryParam(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){
        return new Student(lastName,firstName);
    }
    @GetMapping("/students")

    public List<Student> getStudents(){
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student("budi","wijaya"));
        studentList.add(new Student("tono","wijaya"));
        studentList.add(new Student("badu","wijaya"));
        studentList.add(new Student("melisa","wijaya"));
        studentList.add(new Student("freddy","wijaya"));
        return studentList;
    }

//    @GetMapping("{firstName}/{lastName}")
//    public Student studentPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName){
//        return new Student(lastName,firstName);
//    }

}
