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

