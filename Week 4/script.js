// ES6

document.getElementById("btn-submit").addEventListener("click", function() {
  alert("Your details have been submitted. \nThank you for registering");
});


document.getElementById("button-one").addEventListener("click", function() {
    document.getElementById("text-one").classList.add("red-bold");
    alert("Change text color to RED, increase font-size and font-weight to bolder")
});

document.getElementById("button-two").addEventListener("click", function() {
    document.getElementById("text-two").classList.add("hidden");
    alert("This button will hide the text to its right")
});

document.getElementById("button-three").addEventListener("click", function() {
  document.getElementById("text-three").classList.add("black");
  alert("This button will change the text to black and background to pink")
});

var today = new Date();

var displaydate = today.getDate() + "-" + (today.getMonth()+1) + "-" + today.getFullYear();

document.getElementById("date").innerHTML = "Today is "+displaydate;