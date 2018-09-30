package com.yaduraj.LoginSP.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.yaduraj.LoginSP.model.ClientModel;
import com.yaduraj.LoginSP.model.LoginModel;
import com.yaduraj.LoginSP.service.ClientService;
import com.yaduraj.LoginSP.service.LoginService;

@Controller
public class IndexController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private ClientService clientService;

	@GetMapping("/")
	public String showIndex() {
		return "index";
	}

	@GetMapping("/adduser")
	public String addUser() {
		return "adduser";
	}

	@GetMapping("/addclient")
	public String addClient() {
		return "addclient";
	}

	@GetMapping("/editClient")
	public String editClient() {
		return "editclient";
	}

	@RequestMapping(value = "/save_user", method = RequestMethod.POST)
	public String saveuser(@ModelAttribute LoginModel loginModel) {
		try {
			loginService.saveUser(loginModel);
			return "redirect:/";
		} catch (Exception e) {
			return "redirect:/adduser";
		}

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(HttpServletRequest req) {

		String user = req.getParameter("username");
		String pass = req.getParameter("password");

		LoginModel loginModel = (LoginModel) loginService.getUserByUsername(user);
		try {
			if (user.equals(loginModel.getUsername()) && pass.equals(loginModel.getPassword())) {
				
				
				//get the old session and invalidate
	            HttpSession oldSession = req.getSession(false);
	            if (oldSession != null) {
	                oldSession.invalidate();
	            }
	            //generate a new session
	            HttpSession newSession = req.getSession(true);

	            //setting session to expiry in 5 mins
	            newSession.setMaxInactiveInterval(20);
				
				
				
				
				
				return "redirect:/getAllClients";
			} else {
				return "redirect:/";
			}
		} catch (NullPointerException ex) {
			return "redirect:/";
		}

	}

	@RequestMapping(value = "/getAllClients", method = RequestMethod.GET)
	public String getAllClients(Model model) {
		model.addAttribute("clients", clientService.getAllClients());
		return "home";
	}

	@RequestMapping(value = "clientDelete/{id}", method = RequestMethod.GET)
	public String deleteClientById(@PathVariable("id") int id) {
		clientService.removeClient(id);
		return "redirect:/getAllClients";

	}

	@RequestMapping(value = "clientEdit/{id}", method = RequestMethod.GET)
	public String getClientById(@PathVariable("id") int id, Model model) {
		ClientModel clientModel = clientService.getClientModelById(id);
		model.addAttribute("client", clientModel);
		return "editclient";
	}

	@RequestMapping(value = "/saveClient", method = RequestMethod.POST)
	public String saveClient(@ModelAttribute ClientModel clientModel) {
		clientService.saveClient(clientModel);
		return "redirect:/getAllClients";

	}

	@RequestMapping(value = "/clientEdit/updateClient", method = RequestMethod.POST)
	public String updateClient(@ModelAttribute ClientModel clientModel) {
		clientService.updateClient(clientModel);
		return "redirect:/getAllClients";
	}

}
