package bxtooldemo.ui.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import bxtooldemo.adapter.core.uiservice.Analysis;
import bxtooldemo.adapter.uimodels.UIModels;

/**
 * Servlet implementation class InitController
 */
@WebServlet("/InitController")
public class InitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Analysis adapterAnalysis;
	private UIModels uimodels;
	private String UUID;
	private Map<String, Object> uidMappings;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InitController() {
		super();
		//this.adapterAnalysis = new Analysis();
		this.uidMappings = new HashMap<String, Object>();
	}

	/**
	 * init() method is typically used to perform servlet initialization and guaranteed 
	 * to be called before the servlet handles its first request.
	 */

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO
	}

	@Override
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson gson = new Gson();

		if (request.getParameter("initCanvas") != null) {

			initSetup(request, response, gson);
		}

		if (request.getParameter("loadChanges") != null) {

			propagateChanges(request, response, gson);
		}

		if (request.getParameter("userChoice") != null) {

			propagateUserChoice(request, response, gson);
		}
		
		if (request.getParameter("exitDemo") != null) {

			exit(request, response, gson);
		}

		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().println( new Gson().toJson(this.uimodels));	
	}

	public void initSetup(HttpServletRequest request, HttpServletResponse response, Gson gson){

		this.adapterAnalysis = new Analysis();
		int blockArrayNo;

		blockArrayNo = gson.fromJson(request.getParameter("blockArrayNo"), int.class);
		this.UUID = gson.fromJson(request.getParameter("userID"), String.class);

		this.uidMappings.put(this.UUID, this.adapterAnalysis);
		this.adapterAnalysis.initeMoflonTool(blockArrayNo);
		this.uimodels = this.adapterAnalysis.getUIModels();

	}

	public void propagateChanges(HttpServletRequest request, HttpServletResponse response, Gson gson){

		
		
		System.out.println("ENCODE" + request.getParameter("OperationalDelta"));
		this.UUID = gson.fromJson(request.getParameter("userID"), String.class);
		String deltaString = request.getParameter("OperationalDelta");

		
		

		this.adapterAnalysis = (Analysis) getObject(this.UUID);
		
		if(this.adapterAnalysis == null) {
			this.adapterAnalysis = new Analysis();
			this.uidMappings.put(this.UUID, this.adapterAnalysis);

			this.adapterAnalysis.initeMoflonTool(5);
			this.uimodels = this.adapterAnalysis.getUIModels();
		}
		else
			this.uimodels = this.adapterAnalysis.getUIModelsAfterAtomicDeltaPropagation(Optional.of(deltaString));	
	}

	private void propagateUserChoice(HttpServletRequest request, HttpServletResponse response, Gson gson) {

		String UserChoice;
		
		UserChoice = gson.fromJson(request.getParameter("UserChoice"), new TypeToken<String>(){}.getType());
		this.UUID = gson.fromJson(request.getParameter("userID"), String.class);
		
		this.adapterAnalysis = (Analysis) getObject(this.UUID);
		
		if(this.adapterAnalysis == null) {
			this.adapterAnalysis = new Analysis();
			this.uidMappings.put(this.UUID, this.adapterAnalysis);

			this.adapterAnalysis.initeMoflonTool(5);
			this.uimodels = this.adapterAnalysis.getUIModels();
		}
		else
			this.uimodels = this.adapterAnalysis.continueSynchronisation(UserChoice);
	}


	public Object getObject(String UUID) {

		Object object = null;
		
		//UUID-Object mapping already exists
		for (Map.Entry<String, Object> entry : this.uidMappings.entrySet()){
			if(entry.getKey().equals(UUID)){
				object = entry.getValue();
			}
		}
		return object;
	}
	
	public void exit(HttpServletRequest request, HttpServletResponse response, Gson gson) {
		
		this.UUID = gson.fromJson(request.getParameter("userID"), String.class);
		Boolean uidExist = false;;

		//check whether uid exists
		for (Map.Entry<String, Object> entry : this.uidMappings.entrySet()){
			if(entry.getKey().equals(this.UUID)){
				uidExist = true;
			}
		}
		
		if(uidExist)
		this.uidMappings.remove(this.UUID);
	}

}
