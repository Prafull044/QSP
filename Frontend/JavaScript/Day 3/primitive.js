

// numbers
let x = 10;
console.log(typeof x,x);

// boolean
let y = true;
console.log(typeof y,y);

// null
let z = null;
console.log(typeof z, z);

// uderfined
let a;
console.log(typeof a , a);

// string
let b = "hello";
console.log(typeof b, b);

let c = 'hello 2'
console.log(typeof c,c);

let d = `hello 3`
console.log(typeof d,d);

// bigint
let e =  123456789000000000098n
console.log(typeof e,e);

let f = Number.Max_SAFE_INTEGER;
console.log(typeof f,f);

// symbol
let g = Symbol(10);
console.log(typeof g,g);

let h = Symbol(10)


console.log(g == h);    // false because each symbol is unique

// Nan
let i = 10;
let j = '10'
let k = i * j;
console.log(i == j) // true
console.log(i === j) // false
console.log(typeof k, k); // number NaN

let n = i + j
console.log(typeof n,n);


// alert("hey guys i am learning javascript");
// let p = confirm('are you sure you want to delete this file ?');
// console.log(p) // 

// let name = prompt('what is your name');
// console.log(name);

let num = 12;
if(num % 2 === 0){
    console.log('even number')
}
else{
    console.log('odd number')
}

