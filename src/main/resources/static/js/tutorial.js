'use strict';
const COLOR_RED = '#F00';

let msg = null

/*
alert("Test" + msg);
msg = prompt("test prompt", "default result");
let isOk = confirm("u good?");
*/

/*
let age = null
alert(Number(age)); // 0
age = undefined;
alert(Number(age)); // NaN
*/

/*
alert("2"*"3");
alert(" -9 " -5);
alert(null - 5);
alert(undefined - 5);
*/

let testThis = function(){
    alert("test");
};

function pow(base, exponent){
    if (exponent < 0) return NaN;
    if (Math.round(exponent) != exponent) return NaN;

    let result = 1;

    for (let i = 0; i < exponent; i++) {
        result *= base;
    }

    return result;
}

/*
const year = +prompt("Which year?", "2023");
const date = new Date(year, 1, 29);
if (date.getMonth() == 1) {
    console.log(`${year} is a leap year.`);
}
else {
    console.log(`${year} is not a leap year.`);
}
*/

/*
let searchDate = null;
for (let year = 2014; year <= 2050; year++) {
    searchDate = new Date(year, 0, 1);
    if (searchDate.getDay() == 0){
        console.log(`${searchDate} is the first day of the year to also be a Sunday`);
        break;
    }
}
*/
/*
const randomNumber = Math.ceil(Math.random()*10); // [1;10]
console.log(randomNumber);
let userGuess = null;
do{
    userGuess = +prompt("Guess a number between 1 and 10", "0");
    if (userGuess == randomNumber) {
        console.log("You guessed it right!");
        break;
    }
}while(userGuess <= 10 || userGuess >= 1);
*/

const today = new Date();
console.log(today);