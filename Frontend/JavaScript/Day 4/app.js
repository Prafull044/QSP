 
//  // backTicks
// let a = 10;
// let b = 10;

// console.log(`the sum of ${a} and ${b} is ${a + b}`);

// let namee = "prafull/nDokrimare/n pune";
// console.log(namee);

// let name = `Praful
// Dokrimare
// pune`
// console.log(name);

// console.log(10 * "10"); // 100 

// console.log("10" - "10")
// console.log("10" - "hs");

// // falsy values
// let x = null;  //  0 , -0, 0n , NaN , undefined , null , false , "" 
// if(x){
//     console.log("true")   
// }else{
//     console.log("false")
// }


// // truthly values
// let z =  true;  // 1 , -1 , " ", [] , {} , true
// if(z){
//     console.log("true")   
// }else{
//     console.log("false")
// }

//  let n = 31;
// for(let i = 1; i<= n/2; i++){
    
//   if(n <= 1){
//     console.log("not prime")
//     break;
//   }else if( n % i == 0)
//   {
//     console.log("not prime")
//     break;
//   }
// }     
// console.log("prime")            



// let p = 1012;
// let count = 0;

// while (p != 0) {
//     count++;
//     p = Math.floor(p / 10);
// }

// console.log(count);


function sum(a, b){
    console.log(a + b);
}

sum(10,30);

function employeesSalary(empName, EmpSal, empBonus=0)
{
    let totalSalary = EmpSal + empBonus;
    console.log(`Employee Name : ${empName} and Total Salary : ${totalSalary}`);
}
employeesSalary("Prafull", 10000, 2000);


function evenOdd(num){
    if(num % 2 == 0){
        console.log("even number "+ num);
    }else{
        console.log("odd number "+ num);
    }
}
evenOdd(10)


function Test(){
    console.log(arguments);
}
Test(10,20,30,59);

let s = function multiply(a,b){
    console.log(a*b);
}

s(10,30);
s(1,3)

