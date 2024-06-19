package com.Lohith.www;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.www.Model;

public class Name extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, resp);
		System.out.println("im serv here");
		List<Model> h=new ArrayList<Model>();
		h.add(new Model("lohith",111));
		h.add(new Model("lakshmi",122));
		req.setAttribute("rohan1",h);
		req.getRequestDispatcher("rip.jsp").forward(req, resp);
	}

}
