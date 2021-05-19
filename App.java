package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Livro;

@WebServlet ("/app")
public class App extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Livro> livro = new ArrayList<Livro>();
		
		Livro livro1 = new Livro() ;
		livro1.setTitulo("One Last Stop");
		livro1.setAno(2021);
		livro1.setAutor("Casey McQuiston"); 
		
		Livro livro2 = new Livro() ;
		livro2.setTitulo("Asiáticos Podres de Rico");
		livro2.setAno(2013);
		livro2.setAutor("Kevin Kwan"); 
		
		Livro livro3 = new Livro() ;
		livro3.setTitulo("Rainha Vermelha");
		livro3.setAno(2015);
		livro3.setAutor("Victoria Aveyard"); 
		
		Livro livro4 = new Livro() ;
		livro4.setTitulo("As Quatro Rainhas Mortas");
		livro4.setAno(2019);
		livro4.setAutor("Astrid Scholte"); 
		
		livro.add(livro1);
		livro.add(livro2);
		livro.add(livro3);
		livro.add(livro4);
		
		req.setAttribute("livro", livro);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("lista.jsp");
		dispatcher.forward(req, resp);
	}
}
