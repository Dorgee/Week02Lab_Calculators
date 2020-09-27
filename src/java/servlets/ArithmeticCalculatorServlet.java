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


public class ArithmeticCalculatorServlet extends HttpServlet {

  

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String f = request.getParameter("first");
        String s = request.getParameter("second");
        request.setAttribute("First", f);
        request.setAttribute("Second", s);
        String action = request.getParameter("action");
       String d = "Result:---";
         if(f == null || f.equals("")&& s == null || s.equals("")){
        request.setAttribute("r", d); 
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
         }else if(f == null || f.equals("")){
                request.setAttribute("message", "Result:Invalid");
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
         } else if(s == null || s.equals("")){
             request.setAttribute("message", "Result:Invalid");
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
         }
       try{
        Integer.valueOf(f);
        Integer.valueOf(s);
        
       } 
     catch (NumberFormatException e) {
        request.setAttribute("message", "Result:Invalid");
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }
       
       
     
       
   
   
        int firstInt = Integer.parseInt(f);
        int secondInt = Integer.parseInt(s);
        
   
         if("+".equals(action) ){
             request.setAttribute("result", "Result: " + (firstInt + secondInt));
           //request.setAttribute("result", "Result: "+(firstInt + secondInt));
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);

       } else if("-".equals(action)){
       request.setAttribute("result", "Result: "+(firstInt - secondInt));
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
       }
         else if("*".equals(action)){
           request.setAttribute("result", "Result: "+(firstInt * secondInt));
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
       }
         else if("%".equals(action)){
           request.setAttribute("result", "Result: "+(firstInt % secondInt));
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
       }
         
     
    
   

}
}
