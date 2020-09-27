/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String age = request.getParameter("currentAge");
      
      if(age == null || age.equals("")){
          request.setAttribute("message", "You must give your current age");
          getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
                  
      }
      
   try{
        Integer.valueOf(age);
    } catch (NumberFormatException e) {
        request.setAttribute("message", "You must enter a number.");
          getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }
   
   int nextAge = Integer.parseInt(age);
   
      request.setAttribute("Nextage", nextAge + 1);
       getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

  
}
