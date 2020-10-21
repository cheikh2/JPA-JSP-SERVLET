package sen.forage.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.forage.dao.ClientImpl;
import sn.forage.dao.IClient;
import sn.forage.dao.IVillage;
import sn.forage.dao.VillageImpl;
import sn.forage.entities.Client;
import sn.forage.entities.Village;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet(urlPatterns ="/", name="client")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClient clientdao;
	private IVillage villagedao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init(ServletConfig confif) throws ServletException{
 	   clientdao = new ClientImpl();
 	   villagedao = new VillageImpl();
    }

 	/**
 	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
 	 */
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		request.setAttribute("client", clientdao.list());
 		request.setAttribute("village", villagedao.list());
 		request.getRequestDispatcher("clients.jsp").forward(request, response);
 		//response.getWriter().append("Served at: ").append(request.getContextPath());
 	}

 	/**
 	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 	 */
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		String prenom = request.getParameter("prenom").toString();
 		String nom = request.getParameter("nom").toString();
 		String adress = request.getParameter("adress").toString();
 		String tel = request.getParameter("telephone").toString();
 		
 		int id =Integer.parseInt(request.getParameter("idVillage"));
		IVillage v = new VillageImpl();
		Village village = v.getVillage(id);
 		
 		Client client = new Client();
 		client.setPrenom(prenom);
 		client.setNom(nom);
 		client.setAdress(adress);
 		client.setTelephone(tel);
 		client.setVillage(village);
 		
 		int ok = clientdao.add(client);
 		response.getWriter().println(ok);
 	}

 }
