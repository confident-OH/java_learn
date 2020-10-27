import java.io.*;

public class Students {
    private char gender;
    private int age;
    private String name;
    private String id;
    Students(){
        this.age = 0;
        this.gender = '1';
        this.id = "U201814778";
        this.name = "zeng yangqing";
    }
    Students(String names, String id, char gender, int age){
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.name = names;
    }
    void set_name(String names){
        this.name = names;
    }
    void set_age(int age){
        this.age = age;
    }
    void set_id(String id){
        this.id = id;
    }
    void set_gender(char a){
        this.gender = a;
    }
    void show_info(){
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("Student_id"+this.id);
        if(gender == '1'){
            System.out.println("gender: man");
        }
        else{
            System.out.println("gender: women");
        }
    }
}
