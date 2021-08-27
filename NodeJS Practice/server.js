//ES 6

const express = require("express");
const bodyParser = require("body-parser");

const app = express();
app.use(bodyParser.urlencoded({extended:true}));

app.get("/", function(req, res){
  res.sendFile(__dirname + "/index.html")
});

app.post("/", function(req, res){
   var num1 = Number(req.body.num1);
   var num2 = Number(req.body.num2);
   var operator = req.body.operator;
   if (operator == "add") {
     var result = num1+num2;
   } else if (operator == "subtract") {
     var result = num1-num2;
   } else if (operator == "multiply") {
     var result = num1*num2;
   } else if (operator == "divide") {
     var result = num1/num2;
   } else { return console.log("Error"); }

   res.send("The result is "+ result);
});

app.get("/bmicalc", function(req, res){
  res.sendFile(__dirname + "/bmicalc.html");
});

app.post("/bmicalc", function(req, res){
   var weight = Number(req.body.weight);
   var height = Number(req.body.height);
   var bmiResult = (weight/(height*height));

   res.sendFile(__dirname + "/bmicalc-result.html");
});




app.listen(3000, function(){
  console.log("Server started on port 3000")
});
