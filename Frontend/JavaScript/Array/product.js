let arr = [];

let add = () => {
    let productName = document.getElementById("product").value;
    arr.push(productName);
    arr.unshift(productName)

    console.log(arr);
};