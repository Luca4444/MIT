
function sliceElements(givenArray) {

    return givenArray.slice(givenArray.length-3, givenArray.length);
}


var a = [1,2,3,4,5,6,7,8];

console.log(sliceElements(a));