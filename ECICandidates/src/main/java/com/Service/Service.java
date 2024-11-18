package com.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.DAo.Dao;
import com.Entity.Candidate;

public class Service {
	Dao dao = new Dao();

	Scanner sc = new Scanner(System.in);

	public List<Candidate> getAllCandidate() {
		dao = new Dao();
		List<Candidate> allCandidate = dao.getAllCandidate();
		return allCandidate;

	}

	public List<Candidate> insertData() {
		dao = new Dao();
		List<Candidate> Allcandidate = dao.Insert();
		return Allcandidate;
	}

	public List<Candidate> updatedata() {
		dao = new Dao();
		List<Candidate> update = dao.Update();
		return update;

	}

	public List<Candidate> delete() {
		dao = new Dao();
		List<Candidate> deletequery = dao.Deletequery();
		return deletequery;
	}

	public List<Candidate> asperpartyname() {

		List<Candidate> allCandidate = this.getAllCandidate(); // Fetch all candidates from DAO
		List<Candidate> asperparty = new ArrayList<Candidate>(); // To store matching candidates
		System.out.println("Enter the Party Name: ");
		String partyname = sc.nextLine();

		for (Candidate candidate : allCandidate) {
			if (candidate.getPartyname().equals(partyname)) {
				asperparty.add(candidate);
			}
		}

		return asperparty; // Return the matching
	}
}
