import React from "react";

var date = new Date();
var year = date.getFullYear();


function Footer() {
    return (

        <footer>   <p>Copyright {year} - LPMarini</p> </footer>
);}

export default Footer;