require("dotenv").config();

const express = require("express");
const bodyParser = require("body-parser");
const path = require('path');
const mongoose = require("mongoose");
const encrypt = require("mongoose-encryption");


const app = express();


app.set('view engine', 'ejs');
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static(__dirname + "/public"));

//----------------------------------------------------------SETTING CONNECTION
mongoose.connect(process.env.URL_DB, {useNewUrlParser: true})

const notesSchema = new mongoose.Schema ({
  content: String
});

const Note = new mongoose.model("Note", notesSchema);

//-----------------------------------------------------------LOGIN PAGE
const userSchema = new mongoose.Schema ({
  username: String,
  password: String
});

const encryption = process.env.ENCRYPTION;

userSchema.plugin(encrypt, {secret:encryption, encryptedFields:["password"]});

const User = new mongoose.model("User", userSchema);

var savedNotes = [];

Note.find({}, function(err,retrieved){
  if (err) {console.log(err);}
  else     {retrieved = savedNotes}
});

//-------------------------------------------------------GET REQUESTS

app.get('/', function (req, res) {
  res.render("home");
});

app.get("/login", function(req,res){
  res.render("login");
});

app.get("/register", function(req,res){
  res.render("register");
});

app.get("/notes", function(req,res){

  Note.find({}, function(err,retrieved){
  if (err) {console.log(err);}
  else     {
    res.render("notes", {renderedNotes: retrieved});
  }});
});

//------------------------------------------------------POST REQUESTS

app.post("/register", function(req,res){
  const newUser = new User ({
    username: req.body.username,
    password: req.body.password
});
  newUser.save(function(err){
  if (err) {console.log(err);}
  else {
    console.log("User successfully added to database.");
    res.redirect("notes");
  }
});
});


app.post("/login", function(req,res){
  const username = req.body.username;
  const password = req.body.password;

  User.findOne({email: username}, function(err, foundUser){
    if (err) {console.log(err);}
    else {
        if (foundUser) {
          if (foundUser.password === password) {
            res.redirect("notes");
          }   else {res.send("Autentication failed - incorrect password.")}
        } else {res.send("Autentication failed - username not found.")}
        }
  });
});


app.post("/notes", function(req,res){
    const newContent = req.body.content;
    const newNote = new Note ({
        content: newContent
    });
    newNote.save();
    savedNotes.push(newNote);
    res.redirect("notes");
});


app.post("/delete", function(req,res){

  const deleteNote = req.body.delete;

  Note.findByIdAndRemove(deleteNote, function (err) {
      if (err) {console.log(err)}
      else {console.log("Note deleted.");}
  });

  res.redirect("notes");
});


//----------------------------------------------------LISTEN TO PORT

const PORT = process.env.PORT || 3000;

app.listen(PORT, function() {
    console.log("Server started successfully.");
  });
