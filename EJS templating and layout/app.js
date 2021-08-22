//Heading 

const express = require("express");
const bodyParser = require("body-parser");
const app = express(); 
app.set('view engine', 'ejs'); //set EJS views
app.use(bodyParser.urlencoded({extended: true})); // set body parser
app.use(express.static("public")); //create "public" directory for static files, like CSS


app.get("/", function(req, res) {
  res.render("body");
});

app.get("/about", function(req, res) {
    res.render("about");
  });

app.get("/booking", function(req, res) {
    res.render("booking");
  });


app.post("/", function(req, res){
  res.redirect("/");
});


app.listen(3000, function() {
  console.log("Server started on port 3000")
});
