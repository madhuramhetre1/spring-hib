package comm.sunbeam.service;

import java.util.List;
import comm.sunbeam.pojos.*;

public interface ConsignmentService
{
	List<Consignment> listConsignees();
	String addConsignee(Consignment c);
	Consignment getDetails(Integer id);
	String updateConsignee(Consignment c);
	void deleteConsignee(Integer id);
}
