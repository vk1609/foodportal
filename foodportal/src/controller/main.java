package controller;

import java.io.IOException;

import dac.NavigationMenu;

import model.registerOperations;


public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		registerOperations ro = new registerOperations();
        ro.register();
		NavigationMenu mn = new NavigationMenu();
		mn.menu();


	}

}
