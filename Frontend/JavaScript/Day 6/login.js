
function btn()
{
  console.log("login button was click");
  let username = document.getElementById("username").value
 let pass = document.getElementById("pass").value
 
 if(username && pass){
    console.log("login successful")
    window.location.href="home.html"
 }
 else{
    alert("Invalid credential")
 }
  console.log(username)
  console.log(pass)
}

