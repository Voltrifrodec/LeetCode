/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
    var array = [];
    
    for(let i = 0; i <= n; i++) {
        let temp = i;
        array.push(temp.toString(2).split(' ').reduce((count, str) => count + (str.split('').filter(char => char === "1").length), 0));
        // console.log(`${temp} -> ${array}`);
    }

    return array;
};
