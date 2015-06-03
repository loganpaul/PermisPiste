package controleur;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import modele.Apprenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import persistance.dao.IApprenantDao;

@Controller
public class MultiControleur extends MultiActionController{

	@Autowired
	private IApprenantDao apprenantDAO;
	
	/**
	 * 
	 * Affichage de la page d'accueil
	 */
	@RequestMapping(value = "index.htm", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		List<Apprenant> apprenants = apprenantDAO.getAllApprenant();
		for(Apprenant apprenant : apprenants){
			System.out.println(apprenant);
		}
		return "/index";
	}

	
}
