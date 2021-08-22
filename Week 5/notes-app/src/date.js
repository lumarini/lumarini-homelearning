//### this section for EJS syntax ###
//module.exports = currentDay; 

function currentDay() {

var today = new Date(); //this line gets full today's date as object
//today.getDay(); gets day of the week, from 0 - sunday to 6 - saturday

var dateOptions = {
  weekday: "long",
  year: "numeric",
  day: "numeric",
  month:"long"
};

var day = today.toLocaleDateString("en-GB", dateOptions); // formats line to local format with options expressed above

return day;

}

export default currentDay;