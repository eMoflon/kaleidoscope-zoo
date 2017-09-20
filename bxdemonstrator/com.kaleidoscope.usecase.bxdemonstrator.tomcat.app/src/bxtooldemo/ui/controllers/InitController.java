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

import com.bxtooldemo.controller.BxDemoController;
import com.bxtooldemo.controller.ControllerModule;
import com.bxtooldemo.uimodels.UIModels;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Servlet implementation class InitController
 */
@WebServlet("/InitController")
public class InitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BxDemoController bxDemoController;
	private UIModels uimodels;
	private String UUID;
	private Map<String, BxDemoController> uidMappings;
	private ControllerModule controllerModule;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InitController() {
		super();
		//this.adapterAnalysis = new Analysis();
		this.uidMappings = new HashMap<String, BxDemoController>();
		this.controllerModule = new ControllerModule();
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
		
		int blockArrayNo = gson.fromJson(request.getParameter("blockArrayNo"), int.class);
		this.bxDemoController = controllerModule.getControllerInstance(blockArrayNo);
		UUID = gson.fromJson(request.getParameter("userID"), String.class);

		uidMappings.put(this.UUID, this.bxDemoController);
		uimodels = bxDemoController.initialise();
	
	}

	public void propagateChanges(HttpServletRequest request, HttpServletResponse response, Gson gson){

		System.out.println("ENCODE" + request.getParameter("OperationalDelta"));
		UUID = gson.fromJson(request.getParameter("userID"), String.class);
		String deltaString = request.getParameter("OperationalDelta");
		int noOfSourceDeltaOperations = gson.fromJson(request.getParameter("noOfSourceDeltaOperations"), int.class);
		int noOfTargetDeltaOperations = gson.fromJson(request.getParameter("noOfTargetDeltaOperations"), int.class);
		
		bxDemoController = getBxDemoController(UUID);
		
		if(bxDemoController == null) {
			bxDemoController = controllerModule.getControllerInstance(5);
			uidMappings.put(UUID, bxDemoController);

			uimodels = bxDemoController.initialise();
		}
		else {
			
			if(noOfSourceDeltaOperations > 0)
				uimodels = bxDemoController.workflow(Optional.of(deltaString), Optional.empty());
			else if (noOfTargetDeltaOperations > 0) 
				uimodels = bxDemoController.workflow(Optional.empty(), Optional.of(deltaString));
			
		}
				
	}

	private void propagateUserChoice(HttpServletRequest request, HttpServletResponse response, Gson gson) {

		String UserChoice = gson.fromJson(request.getParameter("UserChoice"), new TypeToken<String>(){}.getType());
		UUID = gson.fromJson(request.getParameter("userID"), String.class);
		
		bxDemoController = getBxDemoController(this.UUID);
		
		if(bxDemoController == null) {
			bxDemoController = controllerModule.getControllerInstance(5);
			uidMappings.put(UUID, bxDemoController);

			uimodels = bxDemoController.initialise();
		}
		else
			uimodels = bxDemoController.continueSynchronisation(UserChoice);
	}


	public BxDemoController getBxDemoController(String UUID) {

		BxDemoController bxDemoController = null;
		
		//UUID-Object mapping already exists
		for (Map.Entry<String, BxDemoController> entry : this.uidMappings.entrySet()){
			if(entry.getKey().equals(UUID)){
				bxDemoController = entry.getValue();
			}
		}
		return bxDemoController;
	}
	
	public void exit(HttpServletRequest request, HttpServletResponse response, Gson gson) {
		
		this.UUID = gson.fromJson(request.getParameter("userID"), String.class);
		Boolean uidExist = false;;

		//check whether uid exists
		for (Map.Entry<String, BxDemoController> entry : this.uidMappings.entrySet()){
			if(entry.getKey().equals(this.UUID)){
				uidExist = true;
			}
		}
		
		if(uidExist)
		this.uidMappings.remove(this.UUID);
	}

}
