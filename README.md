# VNIT-1
# NT Hackthon - Team 1
Team members - 1) Varaprasad 2) Niliesh 3) Ameya 4)Satwik 5) Vedasree .


Working -  This appliacation work on a spring boot backend exposing api's that are used by front end for rendering charts . It also uses Apis for plotting the charts for example 
chart.js, google candlestick .  

The exposed Api's can be found at - 
1) http://localhost:8085/stocks (gives all stocks json data ) 

2) http://localhost:8085/stocks/{CompanySymbol} (gives  stocks json data specific to comapany ) 


3) http://localhost:8085/stocks/{CompanySymbol}/{date} (gives the stock json data  of a particular company on a particular date . ) 

4) http://localhost:8085/stocks/{CompanySymbol}/{startDate}/{endData} (gives all the stock json data in the range of start date to end date).

Spring boot uses jackson to convert json to pojo , we use that to read the json file that was provided . We then use restControllers to expose the api's mentioned above .
Frontend of the application uses XMLHttpRequest() to get the data from the exposed api and store them in a variable which is then later passes on to the chart.js and google candlestick , when in turn plots the graph for us . Linking the html to the server is done by Spring controller . 

Instructions to setup and run the solution -> 

  Download a local copy from the Github of the project . 
  
  For eclipse (IDE) based setup and running --->>>
  
  This application is built on maven . Our team used eclipse (IDE) for the development process , So to run this application , make sure you have eclipse for web developer version .  Then click on import project . Select maven project , and select the folder that we downloaded from github . It will open that up, it will take some time, downloading all the dependencies and setting up environment . Once done with downloading the dependencies , etc click on the project , and go the maven in drop down list and click on update project . 
  That will make sure , your are on same page with application - dependencies . Then finally Run the OhlcApplication.java . Check in the terimal , for the messages , if you can see  something as [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8085 (http) with context path '' ,then viola , The application is up and running . Now open Chrome(or any other browser) type http://localhost:8085/ and we are up and running.  Now you will be able the see a Dashboard , Select the company Symbol form the drop-down list , choose starting date and ending date  , and click on Get plot button , within no time, the plot will appear on the centre of the screen(CandleStick) .  
  The UserSelect Column can be used to plot the line, bar, and bubble plot . Clicking on them , we get a plot at the bottom of the screen . 
  
  
  
  
  
  
  
  Note - in case it shows port is already occupied by something else . Go to application.properties and change the server.port = 8085 to any other value .
  
  





