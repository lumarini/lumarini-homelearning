import React from "react";
import currentDay from "./date.jsx";
import "./App.css";


var greeting = "";
var today = new Date();
var hour = today.getHours();
var todaysDate = currentDay();


if (hour < 12) {
  greeting = "Good Morning,";
  var timeOfTheDay = "morning"
;
} else if (hour >= 12 && hour < 18) {
  greeting = "Good afternoon,";
  var timeOfTheDay = "afternoon"
  ;
} else if (hour > 18) {
  greeting = "Good Evening,";
  var timeOfTheDay = "night"
}

var classList = "datetag "+timeOfTheDay;


function GreetingAndDate () {
    return (
            <div className={classList}>
            <h1> {greeting}</h1>
            <p>Today is {todaysDate}</p>
            </div>
);}

export default GreetingAndDate;