package hello.core;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.swing.filechooser.FileSystemView;

@Getter
@Setter
@ToString
public class HelloLombok {
    
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("as");


        System.out.println("helloLombok = " + helloLombok);
    }
    
}
