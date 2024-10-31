/** 
 * Forward declaration of guess API.
 * @param {number} num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * var guess = function(num) {}
 */

/**
 * @param {number} n
 * @return {number}
 */
var guessNumber = function(n) {
    let leftP = 1;
    let rightP = n;
    
    while (leftP <= rightP) {
        let mid = Math.floor((rightP + leftP) / 2);
        let resp = guess(mid);

        if (resp === 0) {
            return mid;
        } else if (resp > 0) {
            leftP = mid + 1;
        } else {
            rightP = mid - 1;
        }
    }
};