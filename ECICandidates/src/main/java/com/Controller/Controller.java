package com.Controller;

import java.util.List;
import com.Entity.Candidate;
import com.Service.Service;

public class Controller {

	Service service = null;

	public List<Candidate> getallcandidate() {
		service = new Service();
		List<Candidate> allCandidate = service.getAllCandidate();
		for (Candidate candidate : allCandidate) {
			System.out.println(candidate);
		}
		return allCandidate;

	}

	public List<Candidate> InsertData() {
		service = new Service();
		List<Candidate> Data = service.insertData();
		return Data;

	}

	public List<Candidate> UpdateData() {
		service = new Service();
		List<Candidate> updat = service.updatedata();
		return updat;

	}

	public List<Candidate> deletequery() {
		service = new Service();
		List<Candidate> del = service.delete();
		return del;

	}

	public void asperpartyname() {
		service = new Service();
		List<Candidate> partyname = service.asperpartyname();
		for (Candidate candidate : partyname) {
			System.out.println(candidate);
		}

	}
}
