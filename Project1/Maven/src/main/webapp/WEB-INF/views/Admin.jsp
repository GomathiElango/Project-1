<!DOCTYPE html>
<html>
<head>
<style>
.container {
    overflow: hidden;
    background-color: #333;
    font-family: Arial;
}

.container a {
    float: left;
    font-size: 16px;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
}

.container a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: #ddd;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>
</head>
<body>

<div class="container">
  <div class="dropdown">
    <button class="dropbtn">Product</button>
    <div class="dropdown-content">
      <a href="#">Add</a>
      <a href="#">View</a>
    </div>
  </div> 

<div class="dropdown">
    <button class="dropbtn">Category</button>
    <div class="dropdown-content">
      <a href="#">Add</a>
      <a href="#">View</a>
    </div>
  </div> 
  
<div class="dropdown">
    <button class="dropbtn">Supplier</button>
    <div class="dropdown-content">
      <a href="#">Add</a>
      <a href="#">View</a>
    </div>
  </div> 
  
</div>

</body>
</html>
