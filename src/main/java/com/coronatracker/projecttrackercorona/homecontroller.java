package com.coronatracker.projecttrackercorona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller {
     
	@Autowired
	coronavirusservices coronavirusservices;
	
	@GetMapping("/")
	public String  home(Model modle) {//model pases data from controller to view
		
          List<locationstat> allstats= coronavirusservices.getAllstats();
          
	     int Totalreportedcases= allstats.stream().mapToInt(stat -> stat.getLatesttotalcases()).sum();
	    
	     int Totalnewcases= allstats.stream().mapToInt(stat -> stat.getDifference()).sum();
	     
		 modle.addAttribute("locationstat",allstats);
		 
		 modle.addAttribute("Totalreportedcases", Totalreportedcases);
		 modle.addAttribute("Totalnewcases",Totalnewcases);
		 
		return "home";
	}
	 
}
