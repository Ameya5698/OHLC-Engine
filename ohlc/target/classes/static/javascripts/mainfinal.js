async function submit_by_id(){
    let url ='http://127.0.0.1:5500/hackathon/response.json';
    let data= document.getElementById(symbol)
    fetch(url)
    .then(response =>response.json())
    .then(json=> console.log(json));
    let url ='http://127.0.0.1:5500/hackathon/response.json';
    var dps = [];
    var obj= document.getElementById("symbol");
    var chart = new CanvasJS.Chart("chartContainer", {
        animationEnabled: true,
        exportEnabled: true,
       
        axisX: {
            valueFormatString: "DD MMM"
        },
        axisY: {
            title: "Price",
            prefix: "$"
        },
        data: [{
            type: "ohlc",
            name: obj.options[obj.selectedIndex].text+"Stock",
            color: "#DD7E86",
            showInLegend: true,
            yValueFormatString: "$##0.00",
            xValueType: "dateTime",
            dataPoints: dps
        }]
    });
    
    $.getJSON(url, parseData);
    
    function parseData(result) {
        for (var i = 0; i < result.length; i++) {
            dps.push({
                x: result[i].date,
                y: [result[i].open,result[i].high,result[i].low,result[i].close]
            });
        }
        chart.render();
    }
    
}

window.onload = function() {
    var subjectObject = {
        "AAPL":{}, "ABBV":{}, "ABT":{}, "ACN":{}, "ADBE":{}, "ADSK":{}, "AMAT":{},
        "AMD":{}, "AMGN":{}, "AMT":{}, "AMZN":{}, "ASML":{}, "AVGO":{}, "AXP":{}, 
        "BA":{}, "BABA":{}, "BAC":{}, "BBL":{}, "BHP":{}, "BLK":{}, "BMY":{}, "BUD":{}, 
        "C":{}, "CHTR":{}, "CMCSA":{}, "COST":{}, "CRM":{}, "CSCO":{}, "CVX":{}, "DHR":{},
        "DIS":{}, "EL":{}, "FB":{}, "GOOG":{}, "GOOGL":{}, "GS":{}, "HD":{}, "HDB":{}, 
        "HON":{}, "IBM":{}, "INTC":{}, "INTU":{}, "ISRG":{}, "JD":{}, "JNJ":{}, "JPM":{},
        "KO":{}, "LIN":{}, "LLY":{}, "LOW":{}, "MA":{}, "MCD":{}, "MDT":{}, "MRK":{},
        "MRNA":{}, "MS":{}, "MSFT":{}, "NEE":{}, "NFLX":{}, "NKE":{}, "NOW":{}, "NVDA":{},
        "NVO":{}, "NVS":{}, "ORCL":{}, "PDD":{}, "PEP":{}, "PFE":{}, "PG":{}, "PM":{}, 
        "PYPL":{}, "QCOM":{}, "RIO":{}, "RTX":{}, "RY":{}, "SAP":{}, "SBUX":{}, "SCHW":{},
        "SE":{}, "SHOP":{}, "SNAP":{}, "SNY":{}, "SONY":{}, "SQ":{}, "T":{}, "TD":{}, 
        "TGT":{}, "TM":{}, "TMO":{}, "TMUS":{}, "TSLA":{}, "TSM":{}, "TXN":{}, "UL":{},
        "UNH":{}, "UNP":{}, "UPS":{}, "V":{}, "VZ":{}, "WFC":{}, "WMT":{}, "XOM":{}
    }
    var symbolSel = document.getElementById("symbol");
    var startSel = document.getElementById("start");
    var endSel = document.getElementById("end");
    for (var x in subjectObject) {
        symbolSel.options[symbolSel.options.length] = new Option(x, x);
    }
    
    }