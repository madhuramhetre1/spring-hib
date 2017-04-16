package comm.sunbeam.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.sunbeam.dao.*;
import comm.sunbeam.pojos.*;

@Service
@Transactional
public class ConsignmentServiceImpl implements ConsignmentService{

	
	@Autowired
	private ConsignmentDao dao;

    @Override
	public String addConsignee(Consignment c) {
        Consignment c1=dao.addConsignee(c);
        if(c1.getConsignmentId()!=null)
		return "Consignee added successfully";
        return "Consignee registration failed";
	}

    @Override
	public Consignment getDetails(Integer id) {
		return dao.getDetails(id);
	}
    
   
    @Override
	public String updateConsignee(Consignment c) {
		Consignment c1 = dao.updateConsignee(c);
		return "Consignee updated successfully";
	}


	@Override
	public void deleteConsignee(Integer id) {
		Consignment c1=new Consignment();
		c1.setConsignmentId(id);
		dao.deletConsignee(c1);
	}

	@Override
	@Transactional
	public List<Consignment> listConsignees() {
		System.out.println("in b.l of service ");
		return dao.listConsignees();
		
	}
    
  
    
	

}
