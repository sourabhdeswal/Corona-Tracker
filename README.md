# CoronaVirus-Tracker
Spring Boot Java app to track coronavirus confirmed cases across the globe

Tools and technologies used: 
* IDE - Intellij Idea; 
* JDK - 1.8 or later;
* Spring Web - 2.7; 
* Spring Boot DevTools; 
* Thymeleaf;

Development Steps: 
* Create an Intellij Idea Dynamic Web Project; 
* Add Dependencies; 
* Project Structure; 
* Create a Service - CoronaVirusDataService.java; 
* Create a Model - LocationStats.java; 
* Create a Controller - HomeController.java; 
* Create a home.html; 
* Demo;


> Coronavirus Tracker can be useful to know the basic statistics of the Coronavirus cases of different states in the country and variations of the current day and previous day.

## About Coronavirus
> Coronavirus disease (COVID-19) is an infectious disease caused by the SARS-CoV-2 virus.
> Most people who fall sick with COVID-19 will experience mild to moderate symptoms and recover without special treatment. However, some will become seriously ill and require medical attention. [more info.](https://www.google.com/search?q=COVID-19)

## Coronavirus [CSV File](https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv)

### [Spring Initializr](https://start.spring.io/)
> Initializr generates spring boot project with just what you need to start quickly!

### [Download Pre-Configured Dependencies File](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.5.6&packaging=jar&jvmVersion=11&groupId=com.project&artifactId=coronavirus-tracker&name=coronavirus-tracker&description=Demo%20project%20for%20Spring%20Boot&packageName=com.project.coronavirus-tracker&dependencies=web,thymeleaf,devtools)

### Using [Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
> Thymeleaf is a modern server-side Java template engine for both web and standalone environments, capable of processing HTML, XML, JavaScript, CSS and even plain text.

### Using [Bootstrap](https://getbootstrap.com/docs/4.0/getting-started/introduction/)
> Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins, responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.

### [Spring Boot tutorial - Refernce](https://www.youtube.com/watch?v=8hjNG9GZGnQ)

Retrieving data from https://github.com/CSSEGISandData/COVID-19/blob/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv

Main Page:
![Screenshot (39)](https://user-images.githubusercontent.com/86052693/171726190-68009838-9a9d-419e-a55b-7707c0fd6635.png)

Statistic:
![Screenshot (40)](https://user-images.githubusercontent.com/86052693/171726241-9f95997e-30e0-457b-8a50-d07e1e99e753.png)
