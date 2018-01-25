package com.usa.learningjava;

public class Sports {

public static void main(String[] args) {
	Sports obj = new Sports();
obj.Cricket();
Sports.Football();
Sports.Badminton();

}

public void Cricket() {
	System.out.println("Bat");
}

public static int Football() {
	System.out.println("Ball");
	return 0;
}

public static void Badminton() {
	System.out.println("Racket");
}

}
