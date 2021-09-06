/**
 * 
 */

 <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
 google.charts.load('current', {'packages':['corechart']});
 google.charts.setOnLoadCallback(drawChart);

function drawChart() {


var xmlhttp=new XMLHttpRequest();
var url="http://localhost:8085/stocks/AAPL/2021-01-04/2021-01-010";
xmlhttp.open("GET",url,true);
xmlhttp.send();
xmlhttp.onreadystatechange=function(){
if(this.readyState==4&&this.status==200)
{
   var data=JSON.parse(this.responseText);
   //console.log(data);
   var high_data=data.map(function(elem){
       return elem.high;
   });
   var low_data=data.map(function(elem){
       return elem.low;
   });
   var date_data=data.map(function(elem){
       return elem.date;
   });

   var open_data=data.map(function(elem){
       return elem.open;
   });

   var close_data=data.map(function(elem){
       return elem.close;
   });



   var data = new google.visualization.DataTable();
   data.addColumn('string', 'year');
   data.addColumn('number', 'low');
   data.addColumn('number','open');
   data.addColumn('number','close')
   data.addColumn('number','high')

 
   for(i = 0; i < high_data.length; i++)
     data.addRow([date_data[i],low_data[i],open_data[i],close_data[i],high_data[i]]);


   //  var data = google.visualization.arrayToDataTable(dataa, true);

var options = {
 legend:'none'

};

var chart = new google.visualization.CandlestickChart(document.getElementById('canvas'));

chart.draw(data, options);

 }
}
}

drawChart();