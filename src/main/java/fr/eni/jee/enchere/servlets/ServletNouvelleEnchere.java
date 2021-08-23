package fr.eni.jee.enchere.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.jee.enchere.bll.ArticleManager;
import fr.eni.jee.enchere.bll.BLLException;
import fr.eni.jee.enchere.bll.ObjectManager;
import fr.eni.jee.enchere.bo.User;


@WebServlet("/venteEnchere")
@MultipartConfig 
public class ServletNouvelleEnchere extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArticleManager am = new ArticleManager();
		
		
		User utilisateur = (User) request.getSession().getAttribute("utilisateur");
		String article = request.getParameter("article");
		String description = request.getParameter("description");
		String categorie = request.getParameter("categorie");
		String image = request.getParameter("img");
		String prixRecup = request.getParameter("prix");
		String dateDebut = request.getParameter("dateDebut");
		String dateFin = request.getParameter("dateFin");
		String etatVente = "EC";
		int prix = Integer.parseInt(prixRecup);
		int no_categorie = 1;
		try {
			am.addArticle(article, description, dateDebut, dateFin, prix, utilisateur.getId(), no_categorie, etatVente, image);
		}catch (BLLException e) {
			request.setAttribute("erreur", e);
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/NouvelleVente.jsp").forward(request, response);

	}
	public static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[a-zA-Z0-9]*$");
    }
}