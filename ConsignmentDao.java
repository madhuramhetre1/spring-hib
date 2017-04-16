package comm.sunbeam.dao;

import java.util.List;
import comm.sunbeam.pojos.*;

public interface ConsignmentDao {
	Consignment addConsignee(Consignment c);
	Consignment getDetails(Integer id);
	Consignment updateConsignee(Consignment c);
	List<Consignment> listConsignees();
	void deletConsignee(Consignment c);
	
}
