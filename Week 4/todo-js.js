const express = require("express");
const bodyParser = require("body-parser");

const app = express();
var items = [];
app.set('view engine', 'ejs');

app.use(bodyParser.urlencoded({
  extended: true
}));
app.use(express.static("public"));

app.get("/", function(req, res) {

  var today = new Date(); //full today's date
  //  var currentDay = today.getDay(); //gets day of the week, from 0 - sunday to 6 - saturday
  var dateOptions = {
    weekday: "long",
    year: "numeric",
    day: "numeric",
    month:"long"
  };
  var day = today.toLocaleDateString("en-GB", dateOptions); //// toLocaleDateString()
    res.render("list", {
    day: day, newListItems : items});
});


app.post("/", function(req, res){
  var input = req.body.newItem;
  items.push(input);
  res.redirect("/");
});


app.listen(3000, function() {
  console.log("Server started on port 3000")
});
