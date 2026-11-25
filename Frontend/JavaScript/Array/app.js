// let a =[10,20,30,"Prafull"];

// console.log(a); //[ 10, 20, 30, 'Prafull' ]

// let b = []
// b[0] = 10;
// b[1] = 20;
// console.log(b) // [ 10, 20 ]
 
// let c = ["Prafull" , "P2","P3","P4"];
// console.log(c);   //[ 'Prafull', 'P2', 'P3', 'P4' ]
// c[3] = "Update";  // add one more element
// console.log(c);
// c[4] = "Replace"  // it will replace the element with existing element
// console.log(c)
// c[7] = "ADD"
// console.log(c)
// console.log(c.length)


// let animals = ["Lion","Tiger"]
// console.log(animals)

// animals.push("Rabbit","Dogs"); // add element at last
// console.log(animals)

// animals.unshift("Ram");  // add element at starting
// console.log(animals)

// animals.pop(); // remove last element 
// console.log(animals);

// animals.shift()  // remove starting element
// console.log(animals);

// animals.splice(1,1) // splice(starting point , count of removals)  remove the element from middle or starting or end 
// console.log(animals)

// animals.splice(2,0,"Horse"); // splice(starting point , count of removals, adding element) adding  the element from middle or starting or end 
// console.log(animals);


// let subArray = animals.slice(0,1)
// console.log(subArray);


// //! Array  

// // array is a non primitive datatype 
// // in js array is a collection of elements 
// // in js we can store multiple datatypes element in one single array
// // in js array does not conatain fixed length , array is a muttable 
// // we can extract the elements from the array by using index 

// // first way
// let aa = [10,20,30];
// console.log(aa)

// // second way 
// // arr2[0] = 10;
// // arr2[1] = 20;
// // arr2[2] = 30;

// // third way
// let arr2 = new Array();
// arr2[0] =10;
// arr2[1] = 20;
// arr2[2] = 30;

// console.log(arr2)


// //! push()
// // it is used to add the elements in last index
// // it will modify the orignal array and return the that array
// // ex..  

// // ! unshift()
// // unshift is used to add the element from starting posotion 0 , 
// // it will modify the orignal array and ruturn thats modify array
// // example 

// //! POP()
// // it will remove the element from last index 
// // it will modify the orignal array and ruturn it 
// // example

// //! shift()
// // shift is remove the element in 0th index , menas staring 
// // it will modify the orignal array and modify it


// //! splice(starting index, count of remove elements, add elements)
// // this method is used to add the elements remove the elements from the Array
// // example 

// //! slice
// // It is used to return the sub array from the main array
// // it will not modify the orignal array it return orignal array 


// let arr = [10,20,30,40,50];

// for(let i = 0; i<arr.length ; i++)
// {
//     console.log(arr[i], i);
// }

// console.log("**************************************")

// arr.forEach(function(ele, index){
//     console.log(ele,index);
// })


// let fruits = ["Apple" , "Mango", "kiwi", "Peru"]

// fruits.forEach(function(fruits ,index ){
//      console.log(fruits, index)
// })

// console.log("**************************************")

// fruits.forEach((fruits, index)=>{
//     console.log(fruits ,index);
// })

// fruits.forEach((ele)=>{
//     return ele;
// })
// //console.log(x);


// // higher order
// function demo(cb){
//     let xx = cb(10);
//     console.log(xx);
// }

// demo((a)=>{
//     console.log(a);
//     return a;
// })

// // 

// function demo(){
//     let d = 10+10;
// }
// let m = demo();
// console.log(m); // undefined



// function demo1(){
//     let d = 10+10;
//     return d
// }
// let m1 = demo1();
// console.log(m1);


// function demo2(cb)
// {
//     let x =cb
// }


// // let y = forEach((ele){
// //     return ele;           //! not apply return keyword
// // })

// // console.log(y);


// //! forEach
// // for Each is a higher order function 
// // inside for each method we need to pass function as a parameter caled call back function
// // to that call back funtion we have to pass three parameter 1) element 2) index 3) Array (index, array are optional)
// // for rach method is use to iterate over an array
// // for each method will not return anything , if we try to return keyword we get undefined
// // syntax array.forEach(function(){
// //     statements ;
// // })

// // ex:-  let arr = [10,20,30,40,50];

// // arr.forEach(function(ele, index){
// //     console.log(ele,index);
// // })

// // function forEach(cb){
// //     for(int i = 0; i<arr.length; i++)
// //     {                                          // Internaly forEach loop working like this 
// //         cb(arr[i], i)
// //     }
// // }


// let u = arr.map((ele)=>{
//     return ele;
// })
// console.log(u);


// // function demo(cb)
// // {
// //     let arr2 = [];
// //     for(let i =0 ; i<arr.length ; i++)
// //     {
// //         let x = cb(arr[i], i, arr);
// //         arr2.push(x);
// //     }
// //     return arr2;
// // }

// // let uu = demo((ele)=>{
// //     return ele;
// // })


// //! Map 
// // Map is a higher order function which accept callback function as a parameter
// // call back function accept the paramter like elements , index, array 
// // map method is uded for itteration as well as return as array by performing some operation
// // map will return new array

// // function map(cb)
// // {
// //     let arr2 = [];
// //     for(let i =0 ; i<arr.length ; i++)
// //     {
// //         let x = cb(arr[i], i, arr);
// //         arr2.push(x);
// //     }
// //     return arr2;
// // }

// // let t = map((ele)=>{
// //     return ele;
// // }

// let fruits2 = ["mongo", "ram", "prath"]

// let fruits3 = fruits2.map((ele)=>{
//     return ele.toUpperCase();
// })

// console.log(fruits3);


// let fruits4 = fruits2.map((ele)=>{
//     return ele.slice(ele, 0, 2);
// })
// console.log(fruits4);


// 
// let arr4 = ["Prafull" , "Agrani" , "Ram"];
// arr4.sort()
// console.log(arr4);

// let num = [10,34,43,34,34,,4,33,2,34,23];
// num.sort((a,b)=>{
//     return a-b;
// })
// console.log(num);


// // some
// let e = num.some((ele)=>{
//     return ele> 5;
// })
// console.log(x);


// 1)
let a = [2,3,10,59]

console.log(a*2);