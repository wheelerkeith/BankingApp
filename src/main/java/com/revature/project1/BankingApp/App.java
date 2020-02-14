package com.revature.project1.BankingApp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.database.ConnectionUtil;

/**
 * - use at least one Statement, PreparedStatement, and CallableStatement 
 * - Use the DAO design pattern
 * - Use proper coding conventions 
 * - Ensure that input is thoroughly validated 
 * - Include JUnit tests to test application code
 * 
 * 1) create a user account with a unique email and/or username (must have multiple users)
 * 2) secure my account using a password 
 * 3) log in/log out 
 * 4) create a bank account associated with each user 
 * 5) deposit money 
 * 6) withdraw money (no negative balances!) 
 * 7) view account balance 
 * 
 * Your bank can optionally support: 
 * - Use log4j to replace System.out.println with logging
 * - Multiple user bank accounts (checking & savings) 
 * - Transfer funds functionality between user accounts 
 * - Joint accounts (a single account with two separate users having access) 
 * - Ability to view transaction history Password encryption for added security 
 * - Include mocking and/or an H2 database for proper unit testing
 * 
 * 
 */
public class App 
{
	private static Scanner sc = new Scanner(System.in);
	private static boolean keepGoing = true;
	private static Connection databaseConnection = null;
	
	static boolean begin() {
		System.out.println("Welcome to University of the Wizards Bank!Please login:");
		
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
		
		Switch (command.charAt(0)) {
			case 'Q':
				keepGoing = false;
				break;
			case 'S':
				// sign out on database
				begin();
				break;
			case 'L':
				begin();
				break;
			case 'T':
				// do a transaction
				break;
		}
		
	}
	
    public static void main( String[] args ) throws SQLException
    {
    	try {
    		
			databaseConnection = ConnectionUtil.getConnection();
			
			if (begin()) {
				while (keepGoing) {
					doTransaction();
				}
			}
			
			end();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    }
}
