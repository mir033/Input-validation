

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Servlet implementation class ValidateData
 */
@WebServlet("/ValidateData")
public class ValidateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String Regex="^(.+)@(.+)$";
    private static final String MatricRegex="^/[0-9]{7}";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String name = request.getParameter("fullName");
		//String matric = request.getParameter("MatricNo");
		//String currentAddr = request.getParameter("CurrentAddr");
		//String homeAddr =request.getParameter("HomeAddr");
		String email = request.getParameter("Email");
		//String mobileno = request.getParameter("MobileNo");
		//String homeNo = request.getParameter("HomeNo");
		
	   Pattern pattern = Pattern.compile(Regex);
	   Matcher matcher = pattern.matcher("email");
	   
	   if(matcher.matches()) {
		   RequestDispatcher req = request.getRequestDispatcher("fail.jsp");
		   req.include(request, response);
	   }
	   
	   else {
		   RequestDispatcher req = request.getRequestDispatcher("welcome.jsp");
		   req.include(request, response);
	   }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
}
