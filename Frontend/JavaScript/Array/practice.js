// filter()
// number is grater 50;
let num = [10,55,40,90,75,43,62,55,80,89,484,43,34];
let a = num.filter(ele => ele > 50);
console.log(a);

// filter names starting with "A" 
let str = ["Akash", "Sita" , "Ajay" , "Ram" , "Pratiksha", "Akansha", "Mahima"];
let b = str.filter(ele => ele.startsWith("A"));
console.log(b);

// filter even numbers
let c = num.filter(ele => ele % 2 == 0 )
console.log(c);

// filter number with length with 4
let d = str.filter(ele=> ele.length > 4)
console.log(d);

// filter number divide by 3;
let e = num.filter(ele => ele % 3 == 0);
console.log(e);

// filter number <= 30
let f = num.filter(ele => ele <= 30);
console.log(f);

// filter fruits containing "a"
let g = str.filter(ele => ele.toLowerCase().includes("a"));
console.log(g);

// filter names ending with "n"
let h = str.filter(ele => ele.includes("n"))
console.log(h);

// filter word starting with "b" 
let i = str.filter(ele=> ele.startsWith("b"))
console.log(i);

// find()
// find first greater than 40;
let num2 = [12,15,21,32,76,98,40,89,56,495];
let k = num2.find(ele => ele > 40)
console.log(k);

// find the first name with length 5 
let l = str.find(ele => ele.length > 5)
console.log(l);

// find the first even number
let n = num2.find(ele => ele % 2 == 0)
console.log(n);

// find the first names start with "P"
let m = str.find(ele => ele.startsWith("P"))
console.log(m);

// find the first number divide by 7 
let o = num2.find(ele => ele % 7== 0)
console.log(o);

// find the first word length = 4
let p = str.find(ele => ele.length == 4)
console.log(p);



// use sort Method
let num3 = [20,40,5,10,43];

// sort in acending order
console.log(num3.sort((a, b) => a - b));

// sort in decending order
console.log(num3.sort((a,b)=> b-a));

// sort in aplhabatecally
console.log(str.sort());

// sort the word by length
console.log(str.sort((a, b) => a.length - b.length));

// sort word by last charactors
console.log(str.sort((a, b) => a.slice(-1).localeCompare(b.slice(-1))));

// sort the numbers scending with negative number 
let neg = [10,-5,20,-10];
console.log(neg.sort((a,b) => a-b));

// sort the word descending 
console.log(str.sort((a, b) => b.localeCompare(a)));

// sort the number remainder when divide by 3
console.log(num.sort((a, b) => (a % 3) - (b % 3)));

// mixed quetions
let n1 = [12,25,33,1];

// double number , filter > 10 , find first > 20 ;
console.log(n1.map(ele => ele + ele).filter(ele => ele > 10).find(ele=> ele > 20));

//convert names to uppercase , filter length > 4 , starting with "A"
console.log(
  str.map(ele => ele.toUpperCase()).filter(ele => ele.length > 4).filter(ele => ele.startsWith("A"))
);

// add 10% gst , filter > 500 , find first < 1000 ;
let n2 = [400, 600, 900, 1200];
console.log(n2.map(ele => ele + (ele * 10/100)).filter(ele => ele > 500).find(ele => ele < 1000));

// take first two letters , filter starting with "M" , find first length = 2
console.log(str.map(ele => ele.slice(2)).filter(ele => ele.startsWith("M")).find(ele => ele.length > 2));


// Double no ,filter even , sort scending 
console.log(n1.map(ele => ele + ele).filter(ele => ele % 2 == 0).sort((a,b)=> a-b));








//sum of all array element
let nn = [10,20,30,40]; 
let aa = nn.reduce((acc, cu)=>{  // it is use to reduce array in single value
  return acc = acc + cu;
}, 100)
console.log(aa);

let bb = nn.reduce((acc ,ac)=>{
  return acc 
})
console.log(bb);

let cc = str.reduce((acc, ac)=>{
  return acc = acc + ac;
})
console.log(cc);


let nes = [10,20,[10,[20,30,[30,40,20,39]]]];
console.log(nes.flat(Infinity));

// remove the duplicate element and store only ones
let arr1 = [10,20,30,40,30];

let aaa = arr1.sort((a,b)=> a-b);

console.log(aaa);

let newArray = [];

for(let i = 0; i < aaa.length; i++)
{
   if(aaa[i] !== aaa[i+1])
   {
     newArray.push(aaa[i]);
   }
}

console.log(newArray);

// sir logic
let aa1 = arr1.filter((ele,ind,a)=>{
  return a.indexOf(ele) == ind;
})
console.log(aa1);


// 
let x = arr1.includes(30);
console.log(x);

//
delete arr1[2]
console.log(arr1.length);


let pp = nn.splice(2, 1);
console.log(pp);
