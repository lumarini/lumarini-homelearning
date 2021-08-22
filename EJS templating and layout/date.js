module.exports = currentDay;

function currentDay() {

var today = new Date(); //full today's date
//today.getDay(); gets day of the week, from 0 - sunday to 6 - saturday

var dateOptions = {
  weekday: "long",
  year: "numeric",
  day: "numeric",
  month:"long"
};

var day = today.toLocaleDateString("en-GB", dateOptions); 

return day;

}