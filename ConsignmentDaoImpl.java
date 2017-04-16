package comm.sunbeam.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.sunbeam.pojos.*;

@Repository
@Transactional
public class ConsignmentDaoImpl implements ConsignmentDao {

	@Autowired
	private SessionFactory sf;
	
	@SuppressWarnings("unchecked")
    @Override
	public Consignment addConsignee(Consignment c) {
		sf.getCurrentSession().persist(c);
		return c;
	}
	
	@Override
	public Consignment getDetails(Integer id) {
		
		return (Consignment) sf.getCurrentSession().get(Consignment.class, id);
	}
	
	@Override
	public Consignment updateConsignee(Consignment c) {
	 System.out.println("in dao update "+c);
	 sf.getCurrentSession().update(c);
	 return c;
		
		
		/*System.out.println("in dao update "+c);
		Consignment cons=(Consignment) sf.getCurrentSession().createQuery
		("update Consignment l set l.deliveryDate= :ddate,l.deliveryBoy= :dboy,l.status= :stat"
		+ " where exist(select t from Consignment t where t.consignmentId=l.id)").
		setParameter("ddate",c.getDeliveryDate()).setParameter("dboy",c.getDeliveryBoy()).setParameter("stat",c.getStatus()).uniqueResult();
		System.out.println("dao"+cons.getConsigneeName());
		return cons;*/
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Consignment> listConsignees() {
		return sf.getCurrentSession().createQuery("select c from Consignment c")
				.list();
	}

	@Override
	public void deletConsignee(Consignment c) 
	{
		sf.getCurrentSession().delete(c);
		System.out.println("dao deleted consignee");
		
	}
}
