import React from "react";
import "../src/public/styles.css";
import Header from "/public/components/header.jsx";
import currentDay from "./date";
//import greetingAndDate from "./greetinganddate.jsx";

var greeting = "";
var today = new Date();
var hour = today.getHours();
var todaysDate = currentDay();

if (hour < 12) {
  greeting = "Good Morning,";
  var textColor = { color: "red" };
} else if (hour >= 12 && hour < 18) {
  greeting = "Good afternoon,";
  textColor = { color: "green" };
} else if (hour > 18) {
  greeting = "Good Evening,";
  textColor = { color: "blue" };
}


function App() {
    return (
            <div>
            {/* <h1 style={textColor}> {greeting}</h1>
            <p>Today is {todaysDate}</p> */}
            <Header />
            </div>);
    
}

export default App;