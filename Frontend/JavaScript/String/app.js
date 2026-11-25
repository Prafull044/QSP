
let str = "Hello Q spider" ;
console.log(str.split()); // split is used to convert string into array of sub strings . return type is array

console.log(str.split(""));

console.log(str.split(" "));

console.log(str.split("Q"));

console.log(str.split("e"));

console.log(str.split("e",2));

/////////////////////////////////


let st = "hello web Tech";      // include is use to check the string is present are not if present return true
console.log(st.includes("web"));
console.log(st.includes("q","e","l","T"));

let no = "2345678976543";
console.log(no.includes("4"));

/////////////////////////////////////

console.log(str.replace("Q","P"));

console.log(str.replace("Q")) // undefined because we are not replace with any other charactor

console.log(str.replaceAll("spider", "Bat Man"));

console.log(str.replaceAll(" ", ""));


let e = function(){
    return "hey"
}

console.log(str.replaceAll("Q" , e));


//////////////////////////////

let string = "                    hello Q spiders            ";
console.log(string.length);

console.log(string.trimStart());
console.log(string.trimStart().length);

console.log(string.trimEnd());
console.log(string.trimEnd().length);


console.log(string.trim())
console.log(string.trim().length)

///////////////////

console.log(str.repeat(2));

console.log(str.repeat(0)) // nothing to print
//console.log(str.repeat(-2)) // Error

///////////////////////

let a = "hello";
let b = a;
let c = a.padStart(10,'hi');  
let c = a.padEnd(10,'hi');        // add two extra spacing at start
console.log(a.length == b.length);

console.log(c.length)
console.log(a.length)
console.log(c)
console.log(a.length == c.length);

// startWith and endWith
//startsWith and endsWith --- return type both methods are boolean
//startsWith is method which is use to check wheather the string is starting with specific charactor or word 
//tartsWith is method which is use to check wheather the string is ending with specific charactor or word.
// the return type is array

// ex str.startsWith("Sting",position) 
// ex str.endsWith("Sting",length) // position optional


// includes 
// includes method is used to check wether a given parameter string is present or not
// The return type of includes is boolean 

// str.includes("hi")
//str.includes("hi", position)



// Replace and replaceAll

// the both methods return type is string
// replace : - this method is used to replace the only first occurence of string 

// replaceAll : - This method is used replace the all occurence of the given string 


// trimStart . trimEnd , trim()
// the return type of this method is string 
// this method is use to remove spaces fro the string 
// trimStart() is use to remove spaces from starting 
// trimEnd() is use to remove the spaces from the ending 
// trim() is udes to remove the spaces 


// repeat is use to repeat the string by using parameter value 
// the parameter should given in position only 
// The return typeof repeat is string 
 

// padstart
// padEnd

//padStart is use to increse the length of sting by adding the spaces at the starting of the string 
//padEnd  is use to increse the length of sting by adding the spaces at the End of the string 






