/**
 * @param {number} num
 * @return {boolean}
 */
var isPerfectSquare = function(num) {
    if (num < 2) {
        return true;
    }

    let leftP = 1;
    let rightP = num;

    while (leftP <= rightP) {
        let mid = Math.floor(leftP + (rightP - leftP) / 2);
        let square = mid ** 2;

        if (square === num) {
            return true;
        } else if (square < num) {
            leftP = mid + 1;
        } else {
            rightP = mid - 1;
        }
    }

    return false;
};

console.log(isPerfectSquare(1))
console.log(isPerfectSquare(2))
console.log(isPerfectSquare(5))
console.log(isPerfectSquare(16))
console.log(isPerfectSquare(100))