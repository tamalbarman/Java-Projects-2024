package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
			"Why do Java developers wear glasses? Because they don't C#!",
		    "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
		    "Why don't programmers like nature? It has too many bugs.",
		    "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
		    "Why do programmers prefer dark mode? Because light attracts bugs!",
		    "What do you call a programmer from Finland? Nerdic.",
		    "Why do programmers hate nature? It has too many bugs.",
		    "Why do programmers always mix up Christmas and Halloween? Because Oct 31 == Dec 25.",
		    "How many programmers does it take to screw in a light bulb? None, that's a hardware problem.",
		    "Why did the programmer quit his job? Because he didn't get arrays.",
		    "Why was the JavaScript developer sad? Because he didn't know how to 'null' his feelings.",
		    "Why do programmers prefer using the dark mode? Because the light attracts bugs.",
		    "Why do Python programmers prefer snake case? Because they can't C#.",
		    "What is a programmer's favorite place to hang out? Foo Bar.",
		    "Why do Java developers wear glasses? Because they can't C#.",
		    "What do you get if you lock a bunch of programmers in a room? A byte of code."
	    };
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int ans;
		
		if(str3.equals("1")) ans= a+b;
		else if(str3.equals("2")) ans=a-b;
		else if(str3.equals("3")) ans=a*b;
		else ans=a/b;
		
		 int randomIndex = (int) (Math.random() * jokes.length);
	     String randomJoke = jokes[randomIndex];
	     
		response.sendRedirect("result.jsp?ans="+ans+"&joke="+randomJoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}