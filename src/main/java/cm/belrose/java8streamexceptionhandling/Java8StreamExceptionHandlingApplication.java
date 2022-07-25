package cm.belrose.java8streamexceptionhandling;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Java8StreamExceptionHandlingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Java8StreamExceptionHandlingApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        List<String> list= Arrays.asList("44","373","xyz");
        //List<Integer> intList = list.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());

        //List<Integer> intList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
       // System.out.println(intList);

        //Approche -1
        /*list.forEach(s -> {
            try{
                System.out.println(Integer.parseInt(s));
            }catch (Exception ex){
                System.out.printf("Exception: "+ex.getMessage());
            }
        });*/

        //Aproche -2
        list.forEach(Java8StreamExceptionHandlingApplication::printList);
    }

    public static void printList(String s){
        try{
            System.out.println(Integer.parseInt(s));
        }catch (Exception ex){
            System.out.printf("Exception: "+ex.getMessage());
        }
    }
}
