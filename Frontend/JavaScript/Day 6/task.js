

// function demo(){
//     console.log("button was click")

//     let numone = document.getElementById("numone").value
    
//     let numtwo = document.getElementById("numtwo").value

//     if(Number(numone) && Number(numtwo))
//     {
//         console.log("valid number")
//     }
//     else{
//         console.log("enter valid number")
//     }
// }



// let quantity = document.getElementById("quantity")
// console.log(quantity)

// let count = 0;
// function increment (){
//     count++;
//     quantity.innerText = count;

    
//     if(count  == 5){
//   alert("maximum range reach")
//     }else if(count > 5)
//     {
//         reset();
//     }
//     console.log("count")
// }

// function decrement(){
//     count--;
//     quantity.innerText = count;
//     if(count === 0){
//         alert("mininum range reach")
//         count = 0;
//       }else if(count < 0)
//     {
//         reset();
//     }
      
// }

// function reset()
// {
//     count = 0 
//       quantity.innerText = count;
//     console.log("count")
// }



//Anonymous function  ---- 


// let u = function (a,b){
//     console.log(a,b)
// }

// u(10,30)



// Immediate Invoke Function  --- we can call this function using ().  

// (function demo(){
//     console.log("Immediate invoke function")
// })

// ()


///
// function demo(){
//     return ("hello")
// }
// let a  = demo();
// console.log(a)

/// arrow Function  

// let x = (d)=>{
//     console.log("Arrow Function",d)
// } 
// x(44)
// //
// let s = e =>{
//     console.log("Arrow Function",e)
// } 
// s(44)
// //                                         argument object
// let ss = e => e + e;   // short form
// console.log(ss(3))



// Nested Function

// function parent(){
//     console.log("from parent function")

//     function child(){
//         console.log("from child function")
//     }
//     child()
// }
// parent()


// Higher Order & call back Function 

// function demo(a,b,c){
//     console.log(a)
//      console.log(b)
//      c()
// }

// demo(100, 33, function(){
//     console.log("fuction argument")
// })


// let test = (x,y,z) =>{
//     console.log(x)
//     console.log(y)
//     z()
// }
// (
// test(102,43, ()=>{
//     console.log("from anynomus function arrow function")
// }))


// let demo1 = (a,b) =>{
//     console.log("demo1 is executed " , a)
//     b()
// };

// let demo2 = () =>{
//     console.log("demo2 is executed")
// };

// demo1(200, demo2)


// function YY (a,b,c) {
//    let d = c(a,b)
//    console.log(d)
// }

// YY(100,443,(x,y)=>{
//     return x+ y;
// })


// function SS (a,b,c){
//     c(a,b)
//     c(a,b)
//     c(a,b)
// }

// SS(121,24,(a,b)=>{
//     console.log(a,b)
// })


// let a = function (a, f){
// if(a > 50){
//     f()
// }
// }
// a(333,()=>{
// console.log("call back funtion is executed")
// })



// let a = function (d,f){
//     d()
//     f()
// }

// a(  ()=>{
//     console.log("first function")
// } , ()=>{
//     console.log("second function")
// }
// )


// function num (a,f){
//     f(a)
// }

// num(234, (b)=>{
//     console.log(b)
// })

// function num (a,b){
//     return (()
// }

// num((m,n)=>{
//     console.log(m+n)
// })

// 

// function hey (a,b,c){
//     if((a % 2 == 0) && (b% 2 == 0) )
//     {
//         c()
//     }else{
//         console.log("condition is falls")
//     }
// }

// hey(22,4, ()=>{
//     console.log("call back function both even")
// })


// pure and unPure Function



// Generator function

// function* demo(){
//     yield 100;
//     yield 200;
//     return 4400  // if we not write return keyword and print it then it return undefined  ...       
// }

// let x = demo()
// console.log(x.next().value); 
// console.log(x.next().value); 
// console.log(x.next().value)








