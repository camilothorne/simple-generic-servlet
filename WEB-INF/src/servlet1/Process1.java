package servlet1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Process1 extends HttpServlet {
	
	//properties
	
	private String dname;
	private String dsurname;
	
	//init (instead of constructor)
	
	public void init(){
		ServletConfig config = getServletConfig();
		
		//we recover the init parameters
		
		dname = config.getInitParameter("i_name");
		dsurname = config.getInitParameter("i_surname");
	}
	
	//post (recovering and processing request paramaters)
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		
			//we recover the form's parameters
		
			String name = request.getParameter("form_name");
			{if(name == ""){
				name = dname;
				}
			else{
				name = "Voici votre pr&eacute;nom: " + name;
				}
			};
			String surname = request.getParameter("form_surname");
			{if(surname == ""){
				surname = dsurname;
				}
			else{
				surname = "Voici votre nom: " + surname;
				}
			};
			request.setAttribute("name",name);
			request.setAttribute("surname",surname);
			
			//generating the response
			
			getServletContext().getRequestDispatcher("/Form.jsp").forward(request,response);
	}
	
}
