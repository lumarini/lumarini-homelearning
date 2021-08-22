import React from "react";
import "../src/public/styles.css"
import currentDay from "./date";


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

function greetingAndDate () {
    return (
        <div>
        <h1 className="heading" style={textColor}> {greeting}</h1>
        <p>Today is {todaysDate}</p>
        </div>
        );}

export default greetingAndDate;