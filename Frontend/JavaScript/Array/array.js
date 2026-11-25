let ar1 = ["akash", "kiran" , "sita"]

let x = ar1.map((ele)=>{
    return ele.toUpperCase();
})
console.log(x)


let ar2 = [41,43,1,5,5];
let xx = ar2.map((ele)=>{
    return ele*2;
})
console.log(xx);


// convert prices to gst(18%) 
let ar3 = [100, 200, 350];

let x2 = ar3.map((ele) => {
  return ele + (ele * 18 / 100);
});

console.log(x2);


// take 2 letter of each city
let ar4 = ["chennai" , "delhi", "pune"]
let x3 = ar4.map((ele)=>{
    return ele.slice(0,2)
})
console.log(x3)


// covert numbers even odd

let ar5 = [5,12,7,20]
let x4 = ar5.map((ele)=>{
    if(ele% 2 == 0) 
        {
            return "even"
        }
    else{
       return "odd";
    }
});
console.log(x4)


// take last 3 charactors from each word

let ar6 = ["hydrabad" , "pune", "Nagpur"];
let x5 = ar6.map((ele)=>{
    return ele.slice(-3);
})
console.log(x5);

// 

let ar7 = [10,55,40,75];
let x6 = ar7.map((ele)=>{
    return ele > 50;
})
console.log(x6);

let x7 = ar7.filter((ele)=>{
    return ele > 50;
})
console.log(x7)


let ar8 = ["akash", "prafull", "madan","arvind", "tujus"];
let x8 = ar8.filter((ele)=>{
    return ele.slice(0,1)== "a";
})
console.log(x8);

console.log(ar8.filter(ele => ele.startsWith("a")));

// double number , filter > 10 , find first > 20 : [5,8,12,4] => 24

let arr1 = [5,8,12,4]

let c = arr1
  .map(ele => ele + ele)
  .filter(ele => ele > 10)
  .find(ele => ele > 20);
console.log(c);

let a = arr1.map((ele)=>{
    return ele * 2;
})

let b = a.filter((ele)=>{
    return ele > 10;
})

for(let i = 0; i<b.length ; i++)
{
    if(b[i] > 20)
    {
        console.log(b[i]);
        return ;
    }
}



// converts names to uppercase , filter length > 4 , find the starting with "A";
let arr2 = ["Aakesh", "sita", "ajay"]

let a1 = arr2.filter((ele)=>{
    return ele.length() > 4;
})

console.log(a1.toUpperCase().startsWith("A"));

//add 10% GST , filter > 500  , find first < 1000 

// let arr3 = [400, 600, 900, 2100];
// let a4 = arr3
//   .map(ele => ele + (ele * 18 / 100))
//   .filter(ele => ele > 500)
//   .find(ele => ele < 1000);

// console.log(a4);



// let a5 = arr3
// .map(ele => ele - (ele * 18 / 100))
// .filter(ele => ele > 500)
// .find(ele => ele < 1000);
// console.log(a5);


// 




