package com.servlet;

import java.io.IOException;

import com.DB.DbConnect;
import com.dao.UserDAO;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/update_profile")
public class UpdateUserServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String ps=req.getParameter("ps");
		String qua=req.getParameter("qua");
		
		
		UserDAO dao=new UserDAO(DbConnect.getconn());
		
		
		User u=new User();
		
		u.setId(id);
		u.setName(name);
		u.setQualification(qua);
		u.setEmail(email);
		u.setPassword(ps);
		
	
		
		boolean f=dao.updateUser(u);
		HttpSession session=req.getSession();
		if(f) {
			session.setAttribute("succMsg", "Profile Update Sucessfully");
			resp.sendRedirect("home.jsp");
		}else {
			session.setAttribute("succMsg", "Something wrong on server");
			resp.sendRedirect("home.jsp");
		}
				
		
		
	}

	
}
