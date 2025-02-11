package com.example.demo.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.impl.PorderDaoImpl;
import com.example.demo.model.Porder;

@SpringBootTest
public class PorderDaoImplTest 
{
	@Autowired
	PorderDaoImpl mdi;
	
	//@Test
	public void addTest()
	{
		Porder p=new Porder("小余",9,25,511);
		mdi.add(p);
		System.out.println("add success");
	}
	
	//@Test
	public void selectAllTest()
	{
		List<Porder> l=mdi.selectAll();
		for(Porder p:l)
		{
			System.out.println("id:"+p.getId()+"\tname:"+p.getName());
		}
	}
	
	//@Test
	public void selectByidTest()
	{
		List<Porder> l=mdi.selectById(5);
		System.out.println(l.size());
		for(Porder p:l)
		{
			System.out.println("id:"+p.getId()+"\tname:"+p.getName());
		}
	}
	
	//@Test
	public void updateTest()
	{
		List<Porder> l=mdi.selectById(6);
		Porder[] p=l.toArray(new Porder[1]);
		p[0].setA(5);
		p[0].setB(11);
		p[0].setC(32);
		mdi.update(p[0]);
		System.out.println("update success");
	}
	
	@Test
	public void deleteTest()
	{
		mdi.delete(4);
		System.out.println("delete success");
	}
}