console.log(Math);
console.log(Math.E);
console.log(Math.PI);

let x = 100.2;
console.log(Math.floor(x)); // Math.floor it will return always down value by removing decimals 
 
console.log(Math.ceil(x)); // Math.ceil it will return always upper value by removing decimals

console.log(Math.round(x));// Math.round it will return the previous value by removing decimals


let y = 1234;
let z = y/10;

console.log(Math.trunc(z)); // math.trunc is use to remove decimal values 


let a = 40;
console.log(Math.sign(a)) // Math.sign is used to tell whether the number is +ve or -ve or 0
                          // for +ve number it will return as 1 output 
                          // for -ve number it will return as -1 output 
                          // for 0 number it will return as 0 output 


console.log(Math.abs(a)) // Math.abs is used to return the +ve number as output 

console.log(Math.sqrt(a)) // Math.sqrt help as to find square of the number , if number in negative it will return NAN

console.log(Math.pow(5,3)) // Math.pow help to find the  power value


console.log(Math.hypot(5,10)); // Math.hypo it will help to find hypo-t of the tran 


let b = Math.random();
let c = b * 9000 + 1000;
console.log(Math.trunc(c));


let d = b * 900000 + 100000;
console.log(Math.trunc(d))





let otp;

function OTP(){
    let mobile = prompt("Enter mobile number");

    if(Number(mobile)){
        otp = Math.trunc(1000 + Math.random() * 9000);
        console.log(opt);
        console.log("Your OTP is: " + otp);
    }else{
        alert("Please enter a valid number");
    }
}
function verify(){
    let userOtp = document.getElementById("opt").value;

    if(otp == userOtp){
        alert("OTP Verify Successfully");
    }else if(otp != userOtp){
        alert("Please enter valid otp");
    }
}
