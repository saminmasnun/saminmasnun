package com.usa.learningjava;

public class Birds {

public void nicebirds() {
	System.out.println("Red Birds");
}

public static void uglybirds() {
	System.out.println("Black Birds");
}

public static int richbirds() {
	System.out.println("White Birds");
	return 0;
}

public static void main(String[] args) {
	Birds call = new Birds();
	call.nicebirds();
	Birds.uglybirds();
	Birds.richbirds();
}

}
