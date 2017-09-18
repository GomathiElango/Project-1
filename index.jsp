<!DOCTYPE html>
<html>
<head>
<title>GALAXY MOBILE WORLD </title>
<h2 style="font-family:Comic Sans MS;"><font color="RED"><center>GALAXY MOBILE WORLD</center></font></h2>

<meta name="viewport" content="width=device-width, initial-scale=1">
<style>

.nav{
width:100%;
background:#000033;
height:100px;
margin-top:5px;
opacity:0.6;
}
ul {
list-style:none;
padding:0;
margin:0;
position:absolute;
}
li{
float:left;
margin-top:30px;
}
a{
width:150px;
color:white;
display:block;
text-decoration:none;
font-size:20px;
text-align:center;
padding:10px;
border-radius:10px;
font-family:Century Gothic;
font-weight:bold;
}
a:hover{
background:#669900;
transition:0.8s;
}


* {box-sizing:border-box}
body {font-family: Verdana,sans-serif;}
.mySlides {display:none}

/* Slideshow container */
.slideshow-container {
  max-width: 1000px;
  position: relative;
  margin: auto;
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  height: 13px;
  width: 13px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .text {font-size: 11px}
}
</style>
</head>
<body>


<nav class="navbar navbar-inverse">
<div class="container-fluid">
<div class="navbar-header">
<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNvabar"></button></div>
</nav>
<div class ="nav">
<ul>
<li> <a href ="index.jsp"> Home</a></li>
<li> <a href ="Aboutus">About Us</a></li>
<li> <a href ="Contactus">Contact Us</a></li>
<li> <a href ="Login">Log In</a></li>
<li> <a href ="Register">Register</a></li>
<li> <a href ="Admin">Admin</a></li>
<li> <a href ="AddProduct">Add Product</a></li>
</ul>
</div>

<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="http://media.idownloadblog.com/wp-content/uploads/2016/09/iPhone-7-wallpaper-desktop-design_hero_large.jpg" style="width:100%">
  <div class="text">Apple</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="http://images.fonearena.com/blog/wp-content/uploads/2015/03/s6edgecolours2.jpg" style="width:100%">
  <div class="text">Samsung</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="http://www.wp7connect.com/wp-content/uploads/2013/07/concept-lumia1025-1.jpg" style="width:100%">
  <div class="text">Nokia</div>
</div>

</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>
<h3 style="font-family:Harrington;"><center><font color="GOLD"> ONLINE MOBILE PHONE STORE </font></center></h3>

</body>
</html> 
