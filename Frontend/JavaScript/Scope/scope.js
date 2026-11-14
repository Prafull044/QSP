
// Global scope
// let x = 10;
// var y = 10;
// const z = 20;

// console.log(x,y,z);

// function demo(){
//     console.log(x,y,z);
// }
// demo();



/// Local scope

// function local(){
//  let r = 10;
//  let t = 70;
//  console.log(r,t);
// }
// function local2(){
//     console.log(r,t);  /// r is not defined
// }
// local()
// local2()
// console.log(r,t);


// Block scope

// if(true)
//     {
//     let s = 10;
//     const ss =12;
//     var pp = 43;
//     console.log(s,ss,pp);   
// }
// console.log(pp); /// we can only access the var variable outside the block 
/// console.log(s)               // let and const not access outside the block scop


// lexical scope
// the area which is belong to parent that it called ad lexical scop

// function lexical(){
// let p = 20;
//     function lexi(){
//         console.log(p)
//     }}
// lexical();


