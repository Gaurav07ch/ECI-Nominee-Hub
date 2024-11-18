package com.Clients;

import java.util.Scanner;
import com.Controller.Controller;
import com.Entity.Candidate;
import com.Service.Service;

public class Clients {
	public static void main(String[] args) {

		Controller co = new Controller();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("******************************Welcome to ECI(NomineeHub)***********************");
			System.out.println(
					"\n1. See All Candidates \n2. Insert Data Of Candidate \n3. Update Data Of Candidate \n4. Delete Data Of Candidate \n5. Party Name \n6. Exit");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Enter the Choice  : ");
			System.out.println("--------------------------------------------------------------------");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				co.getallcandidate();
				break;

			case 2:
				co.InsertData();
				break;

			case 3:
				co.UpdateData();
				break;

			case 4:
				co.deletequery();
				break;

			case 5:
				co.asperpartyname();
				break;

			}
		}

	}

}
