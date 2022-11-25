//generating random strings from a collection of strings?
var arr=[];
var groceries = [
    'milk',
    'coriander',
    'cucumber',
    'eggplant'
    ]
    let mygroceries = groceries[Math.floor(Math.random() * groceries.length)]
    arr.push(mygroceries);
    console.log(arr)//This gives you any string from groceries 
    