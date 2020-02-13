package com.revature.project1.BankingApp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.database.ConnectionUtil;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner sc = new Scanner(System.in);
	private static boolean keepGoing = true;
	
	static boolean begin() {
		System.out.print("Username: ");
		String uName = sc.nextLine();
		System.out.print("Password: ");
		String password = sc.nextLine();
//		if (uName /* is not correct */ || password /* also not correct */) {
//			System.out.println("Username or Password Incorrect. Try again");
//		}
		
		return true;
	}
	
	static void end() {
		System.out.println("Have a nice day!");
	}
	

	private static void doTransaction() {
		System.out.println("Commands: Quit, Sign out, Login, Transaction");
		System.out.println("What would you like to do? ");
		String command = sc.nextLine();
		
//		Switch (command.charAt(0)) {
//			case 'Q':
//				keepGoing = false;
//				break;
//			case 'S':
//				// sign out on database
//				begin();
//				break;
//			case 'L':
//				begin();
//				break;
//			case 'T':
//				// do a transaction
//				break;
//		}
		
	}
	
    public static void main( String[] args ) throws SQLException
    {
    	try {
			Connection databaseConnection = ConnectionUtil.getConnection();
			System.out.println(databaseConnection);
//			if (begin()) {
//				Connection databaseConnection = ConnectionUtil.getConnection();
//				while (keepGoing) {
//					doTransaction();
//				}
//        end();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    }
}
