package com.company;

public class Main {

    public static void main(String[] args) {

	Vidlicka vidlicka1 = new Vidlicka("Vidlicka1");
	Vidlicka vidlicka2 = new Vidlicka("Vidlicka2");
	Vidlicka vidlicka3 = new Vidlicka("Vidlicka3");
	Vidlicka vidlicka4 = new Vidlicka("Vidlicka4");
	Vidlicka vidlicka5 = new Vidlicka("Vidlicka5");
	Vidlicka vidlicka6 = new Vidlicka("Vidlicka6");
	Vidlicka vidlicka7 = new Vidlicka("Vidlicka7");
	Vidlicka vidlicka8 = new Vidlicka("Vidlicka8");
	Vidlicka vidlicka9 = new Vidlicka("Vidlicka9");
	Vidlicka vidlicka10 = new Vidlicka("Vidlicka10");

	Filozof filozof1 = new Filozof("Filozof1", vidlicka1, vidlicka2);
	Filozof filozof2 = new Filozof("Filozof2",vidlicka2, vidlicka3);
	Filozof filozof3 = new Filozof("Filozof3",vidlicka3, vidlicka4);
	Filozof filozof4 = new Filozof("Filozof4",vidlicka4, vidlicka5);
	Filozof filozof5 = new Filozof("Filozof5",vidlicka5, vidlicka6);
	Filozof filozof6 = new Filozof("Filozof6",vidlicka6, vidlicka7);
	Filozof filozof7 = new Filozof("Filozof7",vidlicka7, vidlicka8);
	Filozof filozof8 = new Filozof("Filozof8",vidlicka8, vidlicka9);
	Filozof filozof9 = new Filozof("Filozof9",vidlicka9, vidlicka10);
	Filozof filozof10 = new Filozof("Filozof10",vidlicka1, vidlicka10);

	filozof1.start();
	filozof2.start();
	filozof3.start();
	filozof4.start();
	filozof5.start();
	filozof6.start();
	filozof7.start();
	filozof8.start();
	filozof9.start();
	filozof10.start();
    }
}
