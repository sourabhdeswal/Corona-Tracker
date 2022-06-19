package com.coronatracker.projecttrackercorona;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;



@Service

public class coronavirusservices {

	
	private static String VIRUS_DATA_URL="https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";
       
	private List<locationstat> allstats =new ArrayList<>();
	
	
	@PostConstruct
	@Scheduled(cron = "1 * * * * *")
		public void fetchvirusdata() throws IOException, InterruptedException{
		
		List<locationstat> newState =new ArrayList<>();//to avoid giving error to users while working on project simultaniously		
		HttpClient client =HttpClient.newHttpClient();
			
		HttpRequest request=	HttpRequest.newBuilder()
			.uri(URI.create(VIRUS_DATA_URL))
			.build();
			
			HttpResponse<String> httpResponse=client.send(request, HttpResponse.BodyHandlers.ofString());
			
			StringReader csvBodyReader =new StringReader(httpResponse.body());
			
			Iterable<CSVRecord> records=CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);
			
			for(CSVRecord record:records) {
				locationstat locationstats= new locationstat();
				locationstats.setStates(record.get("Province/State"));
				locationstats.setCountry(record.get("Country/Region"));
				int Latestcases=Integer.parseInt(record.get(record.size()-1));
				int prevDaycases=Integer.parseInt(record.get(record.size()-1));
				locationstats.setLatesttotalcases(Latestcases);//cause intiially record is a string
				
				locationstats.setDifference(Latestcases-prevDaycases);
				
				newState.add(locationstats);
			}
			
			this.allstats=newState;
			
			
		}


	public List<locationstat> getAllstats() {
		return allstats;
	}


	public void setAllstats(List<locationstat> allstats) {
		this.allstats = allstats;
	}
}
