/**
 * @param {string} s
 * @return {number}
 */
var countKeyChanges = function(s) {
    
    var changes = 0;
    s = s.toLowerCase();
    for(let i = 1; i < s.length; i++) {
        if(s[i - 1] != s[i])
            changes++;
    }
        
    return changes;
};
