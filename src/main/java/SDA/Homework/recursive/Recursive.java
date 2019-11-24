package SDA.Homework.recursive;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;


@Component
public class Recursive implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        seeker(new File("F:/SDA/Spring/testFolder"));


        }

    public void seeker(File file){
        File[] files = file.listFiles();
        for(File f: files){
            if(f.isDirectory()){
                seeker(f);
            }else{
                isImage(f);
            }



        }
    }

    public void isImage(File file){
        if(file.isFile() && file.getName().toLowerCase().endsWith(".jpg")){
            System.out.println(file.getName());
    }
    }



}
