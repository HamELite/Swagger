package com.materi_spring.java;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
SpringApplication.run(JavaApplication.class,args);
	String nama  = "Ilham Kusuma R";
    String kelas = "10 TKJ 2";


			System.out.println("Nama:"+nama);
	System.out .println("Kelas:"+kelas);

	}


}
