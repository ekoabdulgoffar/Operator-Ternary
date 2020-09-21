package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nilai = 76;

        // if-else statement
        if ( nilai > 75 )
            System.out.println("Lulus");
        else
            System.out.println("Gagal");
        // End if-else statement

        // Operator Ternery
        System.out.println(nilai > 75 ? "Lulus" : "Gagal");
        // End Operator Ternery

        // Contoh
        String kondisi = "kenyang";
        System.out.println(kondisi == "kenyang" ? "Sudah Makan" : "Belum Makan");
    }
}
